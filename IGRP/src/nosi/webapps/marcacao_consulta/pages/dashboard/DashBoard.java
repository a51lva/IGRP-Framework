/*---------------------- Create Model ----------------------*/
package nosi.webapps.marcacao_consulta.pages.dashboard;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import java.util.ArrayList;

public class DashBoard extends Model{		

	private ArrayList<Chart_1> chart_1 = new ArrayList<>();
	public void setChart_1(ArrayList<Chart_1> chart_1){
		this.chart_1 = chart_1;
	}
	public ArrayList<Chart_1> getchart_1(){
		return this.chart_1;
	}

	private ArrayList<Chart_2> chart_2 = new ArrayList<>();
	public void setChart_2(ArrayList<Chart_2> chart_2){
		this.chart_2 = chart_2;
	}
	public ArrayList<Chart_2> getchart_2(){
		return this.chart_2;
	}


	public class Chart_1{
		private String Ano;
		private String X1;
		private String X2;
		private String X3;
		private String X4;
		public void setAno(String Ano){
			this.Ano = Ano;
		}
		public String getAno(){
			return this.Ano;
		}

		public void setX1(String X1){
			this.X1 = X1;
		}
		public String getX1(){
			return this.X1;
		}

		public void setX2(String X2){
			this.X2 = X2;
		}
		public String getX2(){
			return this.X2;
		}

		public void setX3(String X3){
			this.X3 = X3;
		}
		public String getX3(){
			return this.X3;
		}

		public void setX4(String X4){
			this.X4 = X4;
		}
		public String getX4(){
			return this.X4;
		}

	}
	public class Chart_2{
		private String Ano;
		private String X1;
		private String X2;
		private String X3;
		private String X4;
		public void setAno(String Ano){
			this.Ano = Ano;
		}
		public String getAno(){
			return this.Ano;
		}

		public void setX1(String X1){
			this.X1 = X1;
		}
		public String getX1(){
			return this.X1;
		}

		public void setX2(String X2){
			this.X2 = X2;
		}
		public String getX2(){
			return this.X2;
		}

		public void setX3(String X3){
			this.X3 = X3;
		}
		public String getX3(){
			return this.X3;
		}

		public void setX4(String X4){
			this.X4 = X4;
		}
		public String getX4(){
			return this.X4;
		}

	}
}
/*-------------------------*/