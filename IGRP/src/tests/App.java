package tests;

import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.ws.rs.core.MediaType;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import nosi.core.gui.components.IGRPSeparatorList;
import nosi.core.webapp.SeparatorList;
import nosi.core.webapp.helpers.IgrpHelper;
import nosi.webapps.agenda.dao.Balcao;
import nosi.webapps.agenda.dao.Entidade;
import nosi.webapps.agenda.dao.ODFault;
import nosi.webapps.agenda.dao.Requisitos;
import nosi.webapps.agenda.dao.Servicos;
import nosi.webapps.agenda.helper.RestRequestHelper;
import nosi.webapps.agenda.pages.teste.Teste.Separatorlist_1;

import com.google.gson.reflect.TypeToken;
/**
 * @author Marcel Iekiny
 * Aug 3, 2017
 */
public final class App {
	
	@SeparatorList(name = Separatorlist_1.class)
	private List<Separatorlist_1> list = new ArrayList<>();
	
	
	public List<Separatorlist_1> getList() {
		return list;
	}

	public void setList(List<Separatorlist_1> list) {
		this.list = list;
	}

	private App() {}
	
	public static void main(String []args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, ClassNotFoundException {
		App app = new App();
		Field field = app.getClass().getDeclaredField("list");
		
		 Class c = field.getDeclaredAnnotation(SeparatorList.class).name();
		 
		 List<String> fieldsName = new ArrayList<String>();
		 Object obj = Class.forName(c.getName()).newInstance();
		
		 for(Field m : obj.getClass().getDeclaredFields()){
				m.setAccessible(true);
				m.set(obj, new IGRPSeparatorList.Pair("key1", "value1"));
				m.setAccessible(false);
				//System.out.println(m.getName());
		 }
		 ArrayList results = new ArrayList<>();
		 results.add(obj);
		 
		 field.setAccessible(true);
		 field.set(app, results);
		 
		 System.out.println(app.getList().get(0).getCod());
		 
		/* for(Field m : c.getDeclaredFields()){
				m.setAccessible(true);
				fieldsName.add(m.getName());
				System.out.println(m.getName());
		 }*/
		 System.out.println();
	}
	
	public static void makePostRequest() {
		ClientConfig config = new DefaultClientConfig();
		 
        Client client = Client.create(RestRequestHelper.applySslSecurity(config));
        
        String url = RestRequestHelper.baseUrl + "/ag_t_entidades";
        
        WebResource resource = client.resource(url);
        
        Entidade entidade = new Entidade();
        entidade.setNome_entidade("EntidadeTeste100 isaias");
        entidade.setEstado("ATIVO");
        
		String content = RestRequestHelper.convertDaoToJson(entidade);
		
		System.out.println(content);
		
        ClientResponse response = resource.header("Prefer", "return=representation").accept(MediaType.APPLICATION_JSON).type("application/json")
        		.post(ClientResponse.class, content);
		
   	 	String jsonResult = response.getEntity(String.class);
   	 	
        if(response.getStatus() == 200 || response.getStatus() == 201) {
        	System.out.println(RestRequestHelper.convertJsonToDao(jsonResult, Entidade.class));
        	
        }
        else {
        	System.out.println(RestRequestHelper.convertJsonToDao(jsonResult, ODFault.class).getError());
        }
        
       client.destroy();
	}
	
	
	public static void makeGetRequest() {
		
		ClientConfig config = new DefaultClientConfig();
		 
        Client client = Client.create(RestRequestHelper.applySslSecurity(config));
        
        String url = RestRequestHelper.baseUrl + "/ag_t_entidades";
        
        WebResource resource = client.resource(url);
        
        ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        
   	 	String jsonResult = response.getEntity(String.class);
   	    
   	 	
        if(response.getStatus() == 200) {
        	List<Entidade> entidade = RestRequestHelper.convertJsonToListDao(jsonResult, new TypeToken<List<Entidade>>(){}.getType());
        	for(Entidade obj : entidade) {
        		System.out.println(obj);
        	}
        }
        else {
       	 System.out.println("Error");
        }
       client.destroy();
	}
	
}