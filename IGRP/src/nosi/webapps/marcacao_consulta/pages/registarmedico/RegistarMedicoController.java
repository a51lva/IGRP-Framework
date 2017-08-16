/*-------------------------*/

/*Create Controller*/

package nosi.webapps.marcacao_consulta.pages.registarmedico;
import nosi.core.webapp.Controller;
import java.io.IOException;
import nosi.core.webapp.Response;

/*---- Import your packages here... ----*//*---- End ----*/

public class RegistarMedicoController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		RegistarMedico model = new RegistarMedico();
		RegistarMedicoView view = new RegistarMedicoView(model);
		return this.renderView(view);
		/*---- End ----*/
	}


	public Response actionGravar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","RegistarMedico","index");
		/*---- End ----*/
	}
	

	public Response actionVoltar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","ListaMedico","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
