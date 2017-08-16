/*-------------------------*/

/*Create Controller*/

package nosi.webapps.marcacao_consulta.pages.registarutente;
import nosi.core.webapp.Controller;
import java.io.IOException;
import nosi.core.webapp.Response;

/*---- Import your packages here... ----*//*---- End ----*/

public class RegistarUtenteController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		RegistarUtente model = new RegistarUtente();
		RegistarUtenteView view = new RegistarUtenteView(model);
		return this.renderView(view);
		/*---- End ----*/
	}


	public Response actionGravar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","RegistarUtente","index");
		/*---- End ----*/
	}
	

	public Response actionVoltar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","ListarUtente","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
