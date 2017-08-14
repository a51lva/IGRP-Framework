/*-------------------------*/

/*Create Controller*/

package nosi.webapps.kofax.pages.listaobjeto;
import nosi.core.webapp.Controller;
import java.io.IOException;
import nosi.core.webapp.Response;

/*---- Import your packages here... ----*//*---- End ----*/

public class ListaObjetoController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		ListaObjeto model = new ListaObjeto();
		ListaObjetoView view = new ListaObjetoView(model);
		return this.renderView(view);
		/*---- End ----*/
	}


	public Response actionNovo() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("kofax","NovoObjeto","index");
		/*---- End ----*/
	}
	

	public Response actionEditar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("kofax","NovoObjeto","index");
		/*---- End ----*/
	}
	

	public Response actionEliminar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("kofax","ListaObjeto","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
