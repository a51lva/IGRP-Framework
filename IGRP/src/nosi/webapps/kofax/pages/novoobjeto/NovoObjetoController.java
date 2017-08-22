/*Create Controller*/
package nosi.webapps.kofax.pages.novoobjeto;
import nosi.core.webapp.Controller;
import nosi.core.webapp.Igrp;
import java.io.IOException;

/*---- Import your packages here... ----*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import nosi.core.webapp.Response;
import nosi.core.webapp.helpers.IgrpHelper;
import nosi.core.webapp.helpers.Permission;
import nosi.webapps.igrp.dao.Organization;
import nosi.webapps.kofax.dao.Campos;
import nosi.webapps.kofax.dao.Objeto;
/*---- End ----*/

public class NovoObjetoController extends Controller {		


	public Response actionIndex() throws IOException{
		/*---- Insert your code here... ----*/
		NovoObjeto model = new NovoObjeto();		
		String id = Igrp.getInstance().getRequest().getParameter("id");
		Objeto obj = new Objeto();
		if(id != null) {
			obj = obj.findOne(id);
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
		view.organica.setValue(IgrpHelper.toMap(new Organization().find().andWhere("application.dad", "=",Permission.getCurrentEnv()).all(), "id", "name"));
		HashMap<Integer,String> sim_nao = new HashMap<>();
		sim_nao.put(1, "Sim");
		sim_nao.put(0, "Não");
		view.default_page.setValue(sim_nao);
		view.preencher_automatico.setValue(sim_nao);

		HashMap<String,String> formato = new HashMap<>();
		formato.put("xml", "XML");
		formato.put("pdf", "PDF");
		formato.put("excel", "PNG");
		view.formato_output.setValue(formato);
		
		if(id != null && obj!=null) {
			view.btn_gravar.setLink("gravar&p_id="+id);
			List<NovoObjeto.Separatorlist_1> list = new ArrayList<>();
			Collection<Campos> campos = obj.getCampos();
			if(campos!=null){
				for(Campos c:campos){
					if(c.getEstado().toUpperCase().equals("ATIVO")){
						NovoObjeto.Separatorlist_1 t = new NovoObjeto.Separatorlist_1();
						t.setCampo(new NovoObjeto.Separatorlist_1.Pair(c.getCampo(),c.getCampo()));
						t.setP_estado(new NovoObjeto.Separatorlist_1.Pair(c.getEstado(),c.getEstado()));
						list.add(t);
					}
				}
			}
			view.separatorlist_1.addData(list);
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
		obj.setEstado("ATIVO");
		Collection<Campos> campos = new LinkedHashSet<>();
		for(int i = 0; i< model.getP_campo_fk().length; i++) {
			Campos campo = new Campos(obj, model.getP_campo_fk_desc()[i], model.getP_estado());
			campo.setEstado("ATIVO");
			campos.add(campo);
		}
		obj.setCampos(campos);
		String id = Igrp.getInstance().getRequest().getParameter("p_id");
		boolean isNewRecord = true;
		if(id != null && !id.equals("")){
			obj.setId(Integer.parseInt(id));
			for(Campos c:new Objeto().findOne(Integer.parseInt(id)).getCampos()){
				c.setEstado("INATIVO");
				c = c.update();
			}
			obj = obj.update();
			isNewRecord = false;
		}else{
			obj = obj.insert();
		}
		if(obj != null) {
			Igrp.getInstance().getFlashMessage().addMessage("success", "Operacao efetuada com sucesso");
		}else {
			Igrp.getInstance().getFlashMessage().addMessage("error", "Operacao falhada");
		}
		
		if(!isNewRecord) {
			return this.redirect("kofax","NovoObjeto","index", new String[] {"id"}, new String[] {obj.getId().intValue() + ""});
		}
		
		return this.redirect("kofax","NovoObjeto","index");
		/*---- End ----*/
	}
	
	/*---- Insert your actions here... ----*//*---- End ----*/
}