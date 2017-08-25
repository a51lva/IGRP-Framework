/*-------------------------*/

/*Create Controller*/

package nosi.webapps.agenda.pages.pontoatendimento;
/*---- Import your packages here... ----*/
import nosi.core.webapp.Controller;
import java.io.IOException;
import nosi.core.webapp.Response;

/*---- End ----*/

public class PontoAtendimentoController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		PontoAtendimento model = new PontoAtendimento();
		PontoAtendimentoView view = new PontoAtendimentoView(model);
		return this.renderView(view);
		/*---- End ----*/
	}


	public Response actionGravar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","PontoAtendimento","index");
		/*---- End ----*/
	}
	

	public Response actionNovo() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","AddServicos","index");
		/*---- End ----*/
	}
	

	public Response actionConfigurar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","AddServicos","index");
		/*---- End ----*/
	}
	

	public Response actionRemover() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","PontoAtendimento","index");
		/*---- End ----*/
	}
	

	public Response actionRequisitos() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","REQ_SERVICOS","index");
		/*---- End ----*/
	}
	

	public Response actionEliminar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","PontoAtendimento","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
