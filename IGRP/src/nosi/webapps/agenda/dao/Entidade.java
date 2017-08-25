package nosi.webapps.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import nosi.core.webapp.helpers.Permission;
import nosi.webapps.agenda.helper.RestRequestHelper;
/**
 * @author: Emanuel Pereira
 * 4 Aug 2017
 */
public class Entidade {
	
	@Expose(serialize = false, deserialize = true)
	private Integer id;
	
	private String estado;
	
	private String nome_entidade;
	
	private int id_organica; 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getNome_entidade() {
		return nome_entidade;
	}
	public void setNome_entidade(String nome_entidade) {
		this.nome_entidade = nome_entidade;
	}
	
	public int getId_organica() {
		return id_organica;
	}
	public void setId_organica(int id_organica) {
		this.id_organica = id_organica;
	}
	
	@Override
	public String toString() {
		return "Entidade [id=" + id + ", estado=" + estado + ", nome_entidade="
				+ nome_entidade + "]";
	}
	
	public static int insert(Entidade e){
		ClientConfig config = new DefaultClientConfig();			 
        Client client = Client.create(RestRequestHelper.applySslSecurity(config));	        
        String url = RestRequestHelper.baseUrl + "/entidade";	        
        WebResource resource = client.resource(url);	        
		String content = RestRequestHelper.createJsonPostData("_postentidade", e);
        ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).type("application/json")
        		.post(ClientResponse.class, content);			
       client.destroy();
       return response.getStatus();
	}	

	public static int update(Entidade e){
	    ClientConfig config = new DefaultClientConfig();			 
        Client client = Client.create(RestRequestHelper.applySslSecurity(config));	        
        String url = RestRequestHelper.baseUrl + "/balcao";	        
        WebResource resource = client.resource(url);	        
		String content = RestRequestHelper.createJsonPostData("_putentidade_id", e);
		ClientResponse response = resource.path(String.valueOf(e.getId())).accept(MediaType.APPLICATION_JSON).type("application/json")
        		.put(ClientResponse.class, content);			
 	    client.destroy();
	    return response.getStatus();
	}
	
	public static List<Entidade> getAllEntidade() {
		
		List<Entidade> aux = null;
		
		try {
			ClientConfig config = new DefaultClientConfig();
			 
	        Client client = Client.create(RestRequestHelper.applySslSecurity(config));
	        
	        String url = RestRequestHelper.baseUrl + "/ag_t_entidades?$filter=id_organica%20eq%20"+Permission.getCurrentOrganization();
	        
	        WebResource resource = client.resource(url);
	        
	        ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
	        
	   	 	String jsonResult = response.getEntity(String.class);
	        if(response.getStatus() == 200) {
		        aux = (List<Entidade>) RestRequestHelper.convertJsonToListDao(jsonResult, Entidade.class);
	        }
	        else {
	       	 System.out.println("Error");
	       	 //System.out.println(RestRequestHelper.convertToDefaultFault(jsonResult));
	        }
	       client.destroy();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return aux != null ? aux : new ArrayList<Entidade>();
	}
	
	
	public static List<Balcao> getAllBalcao(int id_entidade) {
		
		List<Balcao> aux = null;
		
		try {
			ClientConfig config = new DefaultClientConfig();
			 
	        Client client = Client.create(RestRequestHelper.applySslSecurity(config));
	        
	        String url = RestRequestHelper.baseUrl + "/ag_t_entidades("+id_entidade+")/ag_t_balcoes";
	        
	        WebResource resource = client.resource(url);
	        
	        ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
	        
	   	 	String jsonResult = response.getEntity(String.class);
	   	 	
	        if(response.getStatus() == 200) {
		        aux = (List<Balcao>) RestRequestHelper.convertJsonToListDao(jsonResult, Balcao.class);
	        }
	        else {
	       	 System.out.println("Error");
	       	 //System.out.println(RestRequestHelper.convertToDefaultFault(jsonResult));
	        }
	       client.destroy();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return aux != null ? aux : new ArrayList<Balcao>();
	}
	
	public static List<Servicos> getAllServicos(int id_entidade) {
		
		List<Servicos> aux = null;
		
		try {
			ClientConfig config = new DefaultClientConfig();
			 
	        Client client = Client.create(RestRequestHelper.applySslSecurity(config));
	        
	        String url = RestRequestHelper.baseUrl + "/ag_t_entidades("+id_entidade+")/ag_t_servicos";
	        
	        WebResource resource = client.resource(url);
	        
	        ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
	        
	   	 	String jsonResult = response.getEntity(String.class);
	   	 	
	        if(response.getStatus() == 200) {
		        aux = (List<Servicos>) RestRequestHelper.convertJsonToListDao(jsonResult, Servicos.class);
	        }
	        else {
	       	 System.out.println("Error");
	       	 //System.out.println(RestRequestHelper.convertToDefaultFault(jsonResult));
	        }
	       client.destroy();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return aux != null ? aux : new ArrayList<Servicos>();
	}
}
