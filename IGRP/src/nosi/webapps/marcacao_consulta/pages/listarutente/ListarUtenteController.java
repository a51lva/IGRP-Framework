/*-------------------------*/

/*Create Controller*/

package nosi.webapps.marcacao_consulta.pages.listarutente;
import nosi.core.webapp.Controller;
import java.io.IOException;
import nosi.core.webapp.Response;

/*---- Import your packages here... ----*//*---- End ----*/

public class ListarUtenteController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		ListarUtente model = new ListarUtente();
		ListarUtenteView view = new ListarUtenteView(model);
		return this.renderView(view);
		/*---- End ----*/
	}


	public Response actionNovo_utente() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","RegistarUtente","index");
		/*---- End ----*/
	}
	

	public Response actionPesquisar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","ListarUtente","index");
		/*---- End ----*/
	}
	

	public Response actionMarcar_consulta() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","MarcarConsulta","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
