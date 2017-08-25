/*-------------------------*/

/*Create Controller*/

package nosi.webapps.agenda.pages.myagenda;
/*---- Import your packages here... ----*/
import nosi.core.webapp.Controller;
import java.io.IOException;
import nosi.core.webapp.Response;

/*---- End ----*/

public class MyAgendaController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		MyAgenda model = new MyAgenda();
		MyAgendaView view = new MyAgendaView(model);
		return this.renderView(view);
		/*---- End ----*/
	}

	/*---- Insert your actions here... ----*//*---- End ----*/
}
