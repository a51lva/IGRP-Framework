/*---------------------- Create Model ----------------------*/
package nosi.webapps.agenda.pages.lst_balcao;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import java.util.ArrayList;

public class LST_BALCAO extends Model{		
	@RParam(rParamName = "p_entidade")
	private String entidade;

	private ArrayList<Table_1> table_1 = new ArrayList<>();
	public void setTable_1(ArrayList<Table_1> table_1){
		this.table_1 = table_1;
	}
	public ArrayList<Table_1> gettable_1(){
		return this.table_1;
	}
	
	public void setEntidade(String entidade){
		this.entidade = entidade;
	}
	public String getEntidade(){
		return this.entidade;
	}


	public static class Table_1{
		private String balcao;
		private String entidade;
		private int checkbox_1;
		private int checkbox_1_check;
		private int p_id;
		public void setBalcao(String balcao){
			this.balcao = balcao;
		}
		public String getBalcao(){
			return this.balcao;
		}

		public void setEntidade(String entidade){
			this.entidade = entidade;
		}
		public String getEntidade(){
			return this.entidade;
		}

		public void setCheckbox_1(int checkbox_1){
			this.checkbox_1 = checkbox_1;
		}
		public int getCheckbox_1(){
			return this.checkbox_1;
		}
		public void setCheckbox_1_check(int checkbox_1_check){
			this.checkbox_1_check = checkbox_1_check;
		}
		public int getCheckbox_1_check(){
			return this.checkbox_1_check;
		}

		public void setP_id(int p_id){
			this.p_id = p_id;
		}
		public int getP_id(){
			return this.p_id;
		}

	}
}
/*-------------------------*/