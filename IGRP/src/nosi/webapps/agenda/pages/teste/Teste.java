/*---------------------- Create Model ----------------------*/
package nosi.webapps.agenda.pages.teste;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import java.util.ArrayList;
import java.util.List;

public class Teste extends Model{		
	@RParam(rParamName = "p_cod_fk")
	private String[] p_cod_fk;
	@RParam(rParamName = "p_cod_fk_desc")
	private String[] p_cod_fk_desc;
	@RParam(rParamName = "p_name_fk")
	private String[] p_name_fk;
	@RParam(rParamName = "p_name_fk_desc")
	private String[] p_name_fk_desc;
	@RParam(rParamName = "p_email_fk")
	private String[] p_email_fk;
	@RParam(rParamName = "p_email_fk_desc")
	private String[] p_email_fk_desc;
	
	private List<Separatorlist_1> list;

	private ArrayList<Separatorlist_1> separatorlist_1 = new ArrayList<>();
	
	public void setSeparatorlist_1(ArrayList<Separatorlist_1> separatorlist_1){
		this.separatorlist_1 = separatorlist_1;
	}
	public ArrayList<Separatorlist_1> getseparatorlist_1(){
		return this.separatorlist_1;
	}
	
	public void setP_cod_fk(String[] p_cod_fk){
		this.p_cod_fk = p_cod_fk;
	}
	public String[] getP_cod_fk(){
		return this.p_cod_fk;
	}
	
	public void setP_cod_fk_desc(String[] p_cod_fk_desc){
		this.p_cod_fk_desc = p_cod_fk_desc;
	}
	public String[] getP_cod_fk_desc(){
		return this.p_cod_fk_desc;
	}
	
	public void setP_name_fk(String[] p_name_fk){
		this.p_name_fk = p_name_fk;
	}
	public String[] getP_name_fk(){
		return this.p_name_fk;
	}
	
	public void setP_name_fk_desc(String[] p_name_fk_desc){
		this.p_name_fk_desc = p_name_fk_desc;
	}
	public String[] getP_name_fk_desc(){
		return this.p_name_fk_desc;
	}
	
	public void setP_email_fk(String[] p_email_fk){
		this.p_email_fk = p_email_fk;
	}
	public String[] getP_email_fk(){
		return this.p_email_fk;
	}
	
	public void setP_email_fk_desc(String[] p_email_fk_desc){
		this.p_email_fk_desc = p_email_fk_desc;
	}
	public String[] getP_email_fk_desc(){
		return this.p_email_fk_desc;
	}

	public static class Separatorlist_1{
		
		private Pair cod;
		private Pair name;
		private Pair email;
		
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
			
			@Override
			public String toString() {
				return this.key + "_" + this.value;
			}
		}
 		
		public void setCod(Pair cod){
			this.cod = cod;
		}
		public Pair getCod(){
			return this.cod;
		}

		public void setName(Pair name){
			this.name = name;
		}
		public Pair getName(){
			return this.name;
		}

		public void setEmail(Pair email){
			this.email = email;
		}
		public Pair getEmail(){
			return this.email;
		}

	}
}
/*-------------------------*/