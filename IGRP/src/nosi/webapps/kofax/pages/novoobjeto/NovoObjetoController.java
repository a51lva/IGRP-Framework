/*-------------------------*/

/*Create Controller*/

package nosi.webapps.kofax.pages.novoobjeto;
import nosi.core.webapp.Controller;
import nosi.core.webapp.Igrp;

import java.io.IOException;
import java.util.HashMap;

import nosi.core.webapp.Response;
import nosi.core.webapp.helpers.IgrpHelper;
import nosi.core.webapp.helpers.Permission;
import nosi.webapps.igrp.dao.Organization;
import nosi.webapps.kofax.dao.Campos;
import nosi.webapps.kofax.dao.Objeto;

/*---- Import your packages here... ----*//*---- End ----*/

public class NovoObjetoController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		NovoObjeto model = new NovoObjeto();
		NovoObjetoView view = new NovoObjetoView(model);
		view.organica.setValue(IgrpHelper.toMap(new Organization().find().andWhere("application.dad", "=",Permission.getCurrentEnv()).all(), "id", "name"));
		
		HashMap<Integer,String> sim_nao = new HashMap<>();
		sim_nao.put(1, "Sim");
		sim_nao.put(0, "Não");
		view.default_page.setValue(sim_nao);
		view.preencher_automatico.setValue(sim_nao);
		
		HashMap<String,String> formato = new HashMap<>();
		formato.put("xml", "XML");
		formato.put("pdf", "PDF");
		formato.put("excel", "Excel");
		view.default_page.setValue(sim_nao);
		view.preencher_automatico.setValue(sim_nao);
		view.formato_output.setValue(formato);
		return this.renderView(view);
		/*---- End ----*/
	}


	public Response actionGravar() throws IOException, IllegalArgumentException, IllegalAccessException{
		/*---- Insert your code here... ----*/
		NovoObjeto model = new NovoObjeto();
		model.load();
		Organization o = new Organization().findOne(model.getOrganica());
		Objeto obj = new Objeto(o, model.getObjeto(), model.getPagina(), model.getDefault_page(), model.getFormato_output(), model.getGuardar_em(), model.getP_estado(), model.getPreencher_automatico());
		obj.setEstado("Ativo");
		obj = obj.insert();
		if(obj != null) {
			Igrp.getInstance().getFlashMessage().addMessage("success", "Operacao efetuada com sucesso");
		}else {
			Igrp.getInstance().getFlashMessage().addMessage("error", "Operacao falhada");
		}
		for(int i = 0; i< model.getP_campo_fk().length; i++) {
			Campos campo = new Campos(obj, model.getP_campo_fk_desc()[i], model.getP_estado());
			campo.setEstado("Ativo");
			campo.insert();
		}
		return this.redirect("kofax","NovoObjeto","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}