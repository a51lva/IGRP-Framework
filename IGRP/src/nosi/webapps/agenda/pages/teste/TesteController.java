/*-------------------------*/

/*Create Controller*/

package nosi.webapps.agenda.pages.teste;
/*---- Import your packages here... ----*/
import nosi.core.webapp.Controller;
import nosi.core.webapp.Igrp;

import java.io.IOException;
import nosi.core.webapp.Response;

/*---- End ----*/

public class TesteController extends Controller {		


	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		/*---- Insert your code here... ----*/
		Teste model = new Teste();
		
		if(Igrp.getInstance().getRequest().getMethod().equalsIgnoreCase("POST")) {
			model.load();  
		}
		
		TesteView view = new TesteView(model);
		
		view.separatorlist_1.addData(model.getList());
		
		return this.renderView(view);
		/*---- End ----*/
	}


	public Response actionSave() throws IOException{
		/*---- Insert your code here... ----*/
		return this.redirect("agenda","Teste","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
