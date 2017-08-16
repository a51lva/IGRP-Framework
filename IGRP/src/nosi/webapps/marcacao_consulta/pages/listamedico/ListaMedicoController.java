/*-------------------------*/

/*Create Controller*/

package nosi.webapps.marcacao_consulta.pages.listamedico;
import nosi.core.webapp.Controller;
import java.io.IOException;
import nosi.core.webapp.Response;

/*---- Import your packages here... ----*//*---- End ----*/

public class ListaMedicoController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/		
		ListaMedico model = new ListaMedico();
		ListaMedicoView view = new ListaMedicoView(model);
		return this.renderView(view);
			/*---- End ----*/
	}


	public Response actionNovo_medico() throws IOException{
		/*---- Insert your code here... ----*/		
		return this.redirect("marcacao_consulta","RegistarMedico","index");
			/*---- End ----*/
	}
	

	public Response actionPesquisar() throws IOException{
		/*---- Insert your code here... ----*/		
		return this.redirect("marcacao_consulta","ConsultaPendente","index");
			/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
