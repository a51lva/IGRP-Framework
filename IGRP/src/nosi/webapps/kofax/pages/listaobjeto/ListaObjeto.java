/*---------------------- Create Model ----------------------*/
package nosi.webapps.kofax.pages.listaobjeto;
import nosi.core.webapp.Model;

import java.util.ArrayList;

public class ListaObjeto extends Model{		

	private ArrayList<Table_1> table_1 = new ArrayList<>();
	public void setTable_1(ArrayList<Table_1> table_1){
		this.table_1 = table_1;
	}
	public ArrayList<Table_1> gettable_1(){
		return this.table_1;
	}


	public static class Table_1{
		private String objeto;
		private String pagina;
		private String organica;
		private String estado;
		private String p_id;
		public void setObjeto(String objeto){
			this.objeto = objeto;
		}
		public String getObjeto(){
			return this.objeto;
		}

		public void setPagina(String pagina){
			this.pagina = pagina;
		}
		public String getPagina(){
			return this.pagina;
		}

		public void setOrganica(String organica){
			this.organica = organica;
		}
		public String getOrganica(){
			return this.organica;
		}

		public void setEstado(String estado){
			this.estado = estado;
		}
		public String getEstado(){
			return this.estado;
		}

		public void setP_id(String p_id){
			this.p_id = p_id;
		}
		public String getP_id(){
			return this.p_id;
		}

	}
}
/*-------------------------*/