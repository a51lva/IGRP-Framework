/*---------------------- Create Model ----------------------*/
package nosi.webapps.kofax.pages.novoobjeto;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import java.util.ArrayList;

public class NovoObjeto extends Model{		
	@RParam(rParamName = "p_organica")
	private String organica;
	@RParam(rParamName = "p_objeto")
	private String objeto;
	@RParam(rParamName = "p_default_page")
	private String default_page;
	@RParam(rParamName = "p_preencher_automatico")
	private String preencher_automatico;
	@RParam(rParamName = "p_pagina")
	private String pagina;
	@RParam(rParamName = "p_formato_output")
	private String formato_output;
	@RParam(rParamName = "p_guardar_em")
	private String guardar_em;
	@RParam(rParamName = "p_id")
	private String p_id;
	@RParam(rParamName = "p_campo")
	private String campo;
	@RParam(rParamName = "p_estado")
	private String p_estado;

	private ArrayList<Separatorlist_1> separatorlist_1 = new ArrayList<>();
	public void setSeparatorlist_1(ArrayList<Separatorlist_1> separatorlist_1){
		this.separatorlist_1 = separatorlist_1;
	}
	public ArrayList<Separatorlist_1> getseparatorlist_1(){
		return this.separatorlist_1;
	}
	
	public void setOrganica(String organica){
		this.organica = organica;
	}
	public String getOrganica(){
		return this.organica;
	}
	
	public void setObjeto(String objeto){
		this.objeto = objeto;
	}
	public String getObjeto(){
		return this.objeto;
	}
	
	public void setDefault_page(String default_page){
		this.default_page = default_page;
	}
	public String getDefault_page(){
		return this.default_page;
	}
	
	public void setPreencher_automatico(String preencher_automatico){
		this.preencher_automatico = preencher_automatico;
	}
	public String getPreencher_automatico(){
		return this.preencher_automatico;
	}
	
	public void setPagina(String pagina){
		this.pagina = pagina;
	}
	public String getPagina(){
		return this.pagina;
	}
	
	public void setFormato_output(String formato_output){
		this.formato_output = formato_output;
	}
	public String getFormato_output(){
		return this.formato_output;
	}
	
	public void setGuardar_em(String guardar_em){
		this.guardar_em = guardar_em;
	}
	public String getGuardar_em(){
		return this.guardar_em;
	}
	
	public void setP_id(String p_id){
		this.p_id = p_id;
	}
	public String getP_id(){
		return this.p_id;
	}
	
	public void setCampo(String campo){
		this.campo = campo;
	}
	public String getCampo(){
		return this.campo;
	}
	
	public void setP_estado(String p_estado){
		this.p_estado = p_estado;
	}
	public String getP_estado(){
		return this.p_estado;
	}


	public static class Separatorlist_1{
		private Pair campo;
		private Pair p_estado;
		public static class Pair{
		
			private String key;
			private String value;
			
			public Pair() {}
			
			public Pair(String key, String value) {
				this.key = key;
				this.value = value;
			}
			
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
 		
		public void setCampo(Pair campo){
			this.campo = campo;
		}
		public Pair getCampo(){
			return this.campo;
		}

		public void setP_estado(Pair p_estado){
			this.p_estado = p_estado;
		}
		public Pair getP_estado(){
			return this.p_estado;
		}

	}
}
/*-------------------------*/