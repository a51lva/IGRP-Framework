/*-------------------------*/

/*Create Controller*/

package nosi.webapps.kofax.pages.novoobjeto;
import nosi.core.webapp.Controller;
import nosi.core.webapp.Igrp;

import java.io.IOException;
import java.util.HashMap;

import nosi.core.webapp.Response;
import nosi.core.webapp.helpers.IgrpHelper;
import nosi.webapps.igrp.dao.Organization;
import nosi.webapps.kofax.dao.Campos;
import nosi.webapps.kofax.dao.Objeto;

/*---- Import your packages here... ----*//*---- End ----*/

public class NovoObjetoController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		NovoObjeto model = new NovoObjeto();
		
		String id = Igrp.getInstance().getRequest().getParameter("p_id");
		if(id != null) {
			Objeto obj = new Objeto().findOne(id);
			if(obj != null) {
				model.setDefault_page(obj.getDefault_page());
				model.setP_estado(obj.getEstado());
				model.setFormato_output(obj.getFormato_output());
				model.setGuardar_em(obj.getGuardar_em());
				model.setPagina(obj.getLink_pagina());
				model.setObjeto(obj.getObjeto());
				model.setOrganica(obj.getOrganica().getId());
				model.setPreencher_automatico(obj.getAutomatico());
			}
		}
		NovoObjetoView view = new NovoObjetoView(model);
		
		
		
		view.organica.setValue(IgrpHelper.toMap(new Organization().findAll(), "id", "name"));
		
		
		HashMap<Integer,String> def_pag = new HashMap<>();
		def_pag.put(1, "Sim");
		def_pag.put(0, "Não");
		view.default_page.setValue(def_pag);
		
		HashMap<Integer,String> prencher_aut = new HashMap<>();
		prencher_aut.put(1, "Sim");
		prencher_aut.put(0, "Não");
		view.preencher_automatico.setValue(prencher_aut);
		
		if(id != null) {
			view.btn_gravar.setLink("gravar&p_id="+id);
		}
		
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
			System.out.println(model.getP_campo_fk_desc()[i]);
			Campos campo = new Campos(obj, model.getP_campo_fk_desc()[i], model.getP_estado());
			campo.setEstado("Ativo");
			campo.insert();
		}
		return this.redirect("kofax","NovoObjeto","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}
