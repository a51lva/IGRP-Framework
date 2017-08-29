/*-------------------------*/

/*Create Controller*/

package nosi.webapps.agenda.pages.lista_req;
/*---- Import your packages here... ----*/
import nosi.core.webapp.Controller;
import java.io.IOException;
import nosi.core.webapp.Response;

/*---- End ----*/

public class Lista_reqController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/				
		Lista_req model = new Lista_req();
		Lista_reqView view = new Lista_reqView(model);
		return this.renderView(view);
				/*---- End ----*/
	}


	public Response actionPesquisar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","Lista_req","index");
		/*---- End ----*/
	}
	

	public Response actionEdit() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","Lista_req","index");
		/*---- End ----*/
	}
	

	public Response actionEliminar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","Lista_req","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
