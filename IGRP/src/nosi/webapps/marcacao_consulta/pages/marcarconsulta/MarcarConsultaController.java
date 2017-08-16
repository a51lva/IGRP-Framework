/*-------------------------*/

/*Create Controller*/

package nosi.webapps.marcacao_consulta.pages.marcarconsulta;
import nosi.core.webapp.Controller;
import java.io.IOException;
import nosi.core.webapp.Response;

/*---- Import your packages here... ----*//*---- End ----*/

public class MarcarConsultaController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		MarcarConsulta model = new MarcarConsulta();
		MarcarConsultaView view = new MarcarConsultaView(model);
		return this.renderView(view);
		/*---- End ----*/
	}


	public Response actionGravar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","ConsultaPendente","index");
		/*---- End ----*/
	}
	

	public Response actionVoltar() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("marcacao_consulta","ConsultaPendente","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
