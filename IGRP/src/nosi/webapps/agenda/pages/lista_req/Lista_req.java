/*---------------------- Create Model ----------------------*/
package nosi.webapps.agenda.pages.lista_req;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import java.util.ArrayList;

public class Lista_req extends Model{		
	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	private ArrayList<Table_1> table_1 = new ArrayList<>();
	public void setTable_1(ArrayList<Table_1> table_1){
		this.table_1 = table_1;
	}
	public ArrayList<Table_1> gettable_1(){
		return this.table_1;
	}
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}


	public static class Table_1{
		private String tipo_de_requisito;
		private String requisito;
		private String requisito_item;
		public void setTipo_de_requisito(String tipo_de_requisito){
			this.tipo_de_requisito = tipo_de_requisito;
		}
		public String getTipo_de_requisito(){
			return this.tipo_de_requisito;
		}

		public void setRequisito(String requisito){
			this.requisito = requisito;
		}
		public String getRequisito(){
			return this.requisito;
		}

		public void setRequisito_item(String requisito_item){
			this.requisito_item = requisito_item;
		}
		public String getRequisito_item(){
			return this.requisito_item;
		}

	}
}
/*-------------------------*/