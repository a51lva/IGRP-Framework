package nosi.webapps.agenda.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.ws.rs.core.MediaType;

import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import nosi.webapps.agenda.helper.RestRequestHelper;

/**
 * @author: Emanuel Pereira
 * 4 Aug 2017
 */
public class Requisitos {
	@Expose(serialize = false, deserialize = true)
	private int id;
	private int id_servico;
	private String tipo_requisito;
	private int id_doc_igrp;
	private String descritivo;
	private String estado;
	private int nome_doc_igrp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_servico() {
		return id_servico;
	}
	public void setId_servico(int id_servico) {
		this.id_servico = id_servico;
	}
	
	public String getTipo_requisito() {
		return tipo_requisito;
	}
	public void setTipo_requisito(String tipo_requisito) {
		this.tipo_requisito = tipo_requisito;
	}
	public int getId_doc_igrp() {
		return id_doc_igrp;
	}
	public void setId_doc_igrp(int id_doc_igrp) {
		this.id_doc_igrp = id_doc_igrp;
	}
	public String getDescritivo() {
		return descritivo;
	}
	public void setDescritivo(String descritivo) {
		this.descritivo = descritivo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}	
	
	public int getNome_doc_igrp() {
		return nome_doc_igrp;
	}
	public void setNome_doc_igrp(int nome_doc_igrp) {
		this.nome_doc_igrp = nome_doc_igrp;
	}
	public static Requisitos insert(Collection<Requisitos> r) {
		ClientConfig config = new DefaultClientConfig();			 
        Client client = Client.create(RestRequestHelper.applySslSecurity(config));	        
        String url = RestRequestHelper.baseUrl + "/ag_t_requisitos";	
        WebResource resource = client.resource(url);	        
		String content = RestRequestHelper.convertDaoToJson(r);
		ClientResponse response = resource.header("Prefer", "return=representation").accept(MediaType.APPLICATION_JSON).type("application/json")
        		.post(ClientResponse.class, content);
		String jsonResult = response.getEntity(String.class);
		client.destroy();
	    return (response.getStatus() == 201) ? RestRequestHelper.convertJsonToDao(jsonResult, Requisitos.class) : null;
	}
	
	public static Requisitos update(Requisitos r) {
		ClientConfig config = new DefaultClientConfig();			 
        Client client = Client.create(RestRequestHelper.applySslSecurity(config));	        
        String url = RestRequestHelper.baseUrl + "/ag_t_requisitos("+r.getId() +")";
        int id = r.getId();
        WebResource resource = client.resource(url);	        
		String content = RestRequestHelper.convertDaoToJson(r);
		ClientResponse response = resource.header("Prefer", "return=representation").accept(MediaType.APPLICATION_JSON).type("application/json")
        		.post(ClientResponse.class, content);
		client.destroy();
		return response.getStatus() == 204 ? getRequisitoById(id) : null;
	}
	
	public static Requisitos getRequisitoById(int id) {
		Requisitos aux = null;
		try {
			ClientConfig config = new DefaultClientConfig();
	        Client client = Client.create(RestRequestHelper.applySslSecurity(config));
	        String url = RestRequestHelper.baseUrl + "/ag_t_requisitos("+id+")";
	        WebResource resource = client.resource(url);
	        ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
	   	 	String jsonResult = response.getEntity(String.class);
	   	 	
	   	 	if(response.getStatus() == 200) {
	   	 		aux = (Requisitos) RestRequestHelper.convertJsonToDao(jsonResult, Requisitos.class);
	   	 	}else {
	   	 	System.out.println("Error");
	       	 //System.out.println(RestRequestHelper.convertToDefaultFault(jsonResult));
	   	 	}
		}catch(Exception e){
			e.printStackTrace();
		}
		return aux != null ? aux : new  Requisitos();
	}
	
	public static List<Requisitos> getAllRequisitos(){
		List<Requisitos> aux = null;
		
		try {
			ClientConfig config = new DefaultClientConfig();
			 
	        Client client = Client.create(RestRequestHelper.applySslSecurity(config));
	        
	        String url = RestRequestHelper.baseUrl + "/ag_t_requisitos";
	        
	        WebResource resource = client.resource(url);
	        
	        ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
	        
	   	 	String jsonResult = response.getEntity(String.class);
	   	 	
	        if(response.getStatus() == 200) {
		        aux = (List<Requisitos>) RestRequestHelper.convertJsonToListDao(jsonResult, new TypeToken<List<Requisitos>>(){}.getType());
	        }
	        else {
	       	 System.out.println("Error");
	       	 //System.out.println(RestRequestHelper.convertToDefaultFault(jsonResult));
	        }
	       client.destroy();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return aux != null ? aux : new ArrayList<Requisitos>();
	}
	
	public static List<Requisitos> getAllRequisitosByServico(int servicoId){
		List<Requisitos> aux = getAllRequisitos();
		List<Requisitos> result = new ArrayList<Requisitos>();
		for(Requisitos requisito : aux) 
			if(requisito.getId_servico() == servicoId)
				result.add(requisito);
		return result;
	}
	
}
