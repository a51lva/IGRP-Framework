/*-------------------------*/

/*Create Controller*/

package nosi.webapps.marcacao_consulta.pages.dashboard;
import nosi.core.webapp.Controller;
import java.io.IOException;
import nosi.core.webapp.Response;

/*---- Import your packages here... ----*//*---- End ----*/

public class DashBoardController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		DashBoard model = new DashBoard();
		DashBoardView view = new DashBoardView(model);
		return this.renderView(view);
		/*---- End ----*/
	}


	public Response actionNova_consulta() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","MarcarConsulta","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
