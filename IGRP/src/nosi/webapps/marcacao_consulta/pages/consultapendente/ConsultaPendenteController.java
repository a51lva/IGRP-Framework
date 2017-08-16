/*-------------------------*/

/*Create Controller*/

package nosi.webapps.marcacao_consulta.pages.consultapendente;
import nosi.core.webapp.Controller;
import java.io.IOException;
import nosi.core.webapp.Response;

/*---- Import your packages here... ----*//*---- End ----*/

public class ConsultaPendenteController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		ConsultaPendente model = new ConsultaPendente();
		ConsultaPendenteView view = new ConsultaPendenteView(model);
		return this.renderView(view);
		/*---- End ----*/
	}


	public Response actionNova_consulta() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","MarcarConsulta","index");
		/*---- End ----*/
	}
	

	public Response actionPesquisar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","ConsultaPendente","index");
		/*---- End ----*/
	}
	

	public Response actionConfirmar_consulta() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","ConsultaPendente","index");
		/*---- End ----*/
	}
	

	public Response actionCancelar_consulta() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","ConsultaPendente","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
