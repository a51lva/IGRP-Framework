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
import nosi.webapps.agenda.helper.RestRequestHelper;

/**
 * @author: Emanuel Pereira
 * 4 Aug 2017
 */
public class Balcao {
	@Expose(serialize = false, deserialize = true)
	private Integer id;
	private int id_entidade;
	private String fusohorario;
	private String localizacao;
	private String hr_inicio;
	private String hr_fim;
	private int nr_servicos;
	private int confirmacao;
	private String estado;
	private String nome_balcao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getId_entidade() {
		return id_entidade;
	}
	public void setId_entidade(int id_entidade) {
		this.id_entidade = id_entidade;
	}
	public String getFusohorario() {
		return fusohorario;
	}
	public void setFusohorario(String fusohorario) {
		this.fusohorario = fusohorario;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getHr_inicio() {
		return hr_inicio;
	}
	public void setHr_inicio(String hr_inicio) {
		this.hr_inicio = hr_inicio;
	}
	public String getHr_fim() {
		return hr_fim;
	}
	public void setHr_fim(String hr_fim) {
		this.hr_fim = hr_fim;
	}
	public int getNr_servicos() {
		return nr_servicos;
	}
	public void setNr_servicos(int nr_servicos) {
		this.nr_servicos = nr_servicos;
	}
	public int getConfirmacao() {
		return confirmacao;
	}
	public void setConfirmacao(int confirmacao) {
		this.confirmacao = confirmacao;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getNome_balcao() {
		return nome_balcao;
	}
	public void setNome_balcao(String nome_balcao) {
		this.nome_balcao = nome_balcao;
	}
	
	
	
	@Override
	public String toString() {
		return "Balcao [id=" + id + ", id_entidade=" + id_entidade + ", fusohorario=" + fusohorario + ", localizacao="
				+ localizacao + ", hr_inicio=" + hr_inicio + ", hr_fim=" + hr_fim + ", nr_servicos=" + nr_servicos
				+ ", confirmacao=" + confirmacao + ", estado=" + estado + ", nome_balcao=" + nome_balcao + "]";
	}
	public static Balcao insert(Balcao b){
		ClientConfig config = new DefaultClientConfig();			 
        Client client = Client.create(RestRequestHelper.applySslSecurity(config));	        
        String url = RestRequestHelper.baseUrl + "/ag_t_balcoes";	        
        WebResource resource = client.resource(url);	        
		String content = RestRequestHelper.convertDaoToJson(b);
        ClientResponse response = resource.header("Prefer", "return=representation").accept(MediaType.APPLICATION_JSON).type("application/json")
        		.post(ClientResponse.class, content);		
        String jsonResult = response.getEntity(String.class);
       client.destroy();
       return response.getStatus()==201?RestRequestHelper.convertJsonToDao(jsonResult, Balcao.class):null;
	}	

	public static Balcao update(Balcao b){
	    ClientConfig config = new DefaultClientConfig();			 
        Client client = Client.create(RestRequestHelper.applySslSecurity(config));	        
        String url = RestRequestHelper.baseUrl + "/ag_t_balcoes("+b.getId()+")";	        
        WebResource resource = client.resource(url);	        
		String content = RestRequestHelper.convertDaoToJson(b);
		ClientResponse response = resource.header("Prefer", "return=representation").accept(MediaType.APPLICATION_JSON).type("application/json")
        		.put(ClientResponse.class, content);		
        String jsonResult = response.getEntity(String.class);
       client.destroy();
       return response.getStatus()==201?RestRequestHelper.convertJsonToDao(jsonResult, Balcao.class):null;
	}
	
	public static List<Balcao> getAllBalcao(String nome_entidade){
		if(nome_entidade==null || nome_entidade.equals("")){
			return getAllBalcao();
		}
		List<Balcao> aux = null;
		try {
			ClientConfig config = new DefaultClientConfig();			 
	        Client client = Client.create(RestRequestHelper.applySslSecurity(config));	        
	        String url = RestRequestHelper.baseUrl + "/balcoes_ent";	        
	        WebResource resource = client.resource(url);	        
	        ClientResponse response = resource.path(nome_entidade.trim()).accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
	        String jsonResult = response.getEntity(String.class);
	        if(response.getStatus() == 200) {
		        aux = (List<Balcao>) RestRequestHelper.convertJsonToDaoColl(jsonResult, "Balcoes", "Balcao", new TypeToken<List<Balcao>>(){}.getType());
	        }
	        else {
	       	 System.err.println("Error:"+RestRequestHelper.convertToDefaultFault(jsonResult));
	       	 //System.out.println(RestRequestHelper.convertToDefaultFault(jsonResult));
	        }
	       client.destroy();
		}catch(Exception e){
			e.printStackTrace();
		}
		return aux != null ? aux : new ArrayList<Balcao>();
	}
	
	
	public static List<Balcao> getAllBalcao(){
		List<Balcao> aux = null;
		try {
			ClientConfig config = new DefaultClientConfig();			 
	        Client client = Client.create(RestRequestHelper.applySslSecurity(config));	        
	        String url = RestRequestHelper.baseUrl + "/ag_t_balcoes";	        
	        WebResource resource = client.resource(url);	        
	        ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);	        
	   	 	String jsonResult = response.getEntity(String.class);	   	 	
	        if(response.getStatus() == 200) {
		        aux =  RestRequestHelper.convertJsonToListDao(jsonResult,  new TypeToken<List<Balcao>>(){}.getType());
	        }
	        else {
	       	 	System.err.println("Error");
	        }
	       client.destroy();
		}catch(Exception e){
			e.printStackTrace();
		}
		return aux != null ? aux : new ArrayList<Balcao>();
	}
	
	
	public static Balcao getBalcao(int id){
		Balcao aux = null;
		try {
			ClientConfig config = new DefaultClientConfig();			 
	        Client client = Client.create(RestRequestHelper.applySslSecurity(config));	        
	        String url = RestRequestHelper.baseUrl + "/ag_t_balcoes("+id+")";	        
	        WebResource resource = client.resource(url);	        
	        ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);	        
	   	 	String jsonResult = response.getEntity(String.class);	   	    
	   	 	
	        if(response.getStatus() == 200) {
	        	aux = (Balcao) RestRequestHelper.convertJsonToDao(jsonResult, Balcao.class);
	        }
	        else {
	       	 	System.err.println("Error");
	        }
	       client.destroy();
		}catch(Exception e){
			e.printStackTrace();
		}
		return aux != null ? aux : new Balcao();
	}
	
}
