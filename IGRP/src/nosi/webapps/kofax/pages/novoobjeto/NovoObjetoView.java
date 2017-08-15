/*-------------------------*/

/*Create View*/

package nosi.webapps.kofax.pages.novoobjeto;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;

public class NovoObjetoView extends View {
	
	
	public Field organica;
	public Field objeto;
	public Field default_page;
	public Field preencher_automatico;
	public Field pagina;
	public Field formato_output;
	public Field guardar_em;
	public Field p_id;
	public Field campo;
	public Field p_estado;
	public IGRPForm form_1;
	public IGRPSeparatorList separatorlist_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar;
	public NovoObjetoView(NovoObjeto model){
		this.setPageTitle("Registar Novo Objeto");
			
		form_1 = new IGRPForm("form_1");
		separatorlist_1 = new IGRPSeparatorList("separatorlist_1");
		organica = new ListField(model,"organica");
		organica.setLabel("Organica");
		organica.propertie().add("name","p_organica").add("type","select").add("multiple","false").add("domain","").add("maxlength","30").add("required","true").add("change","false").add("disabled","false").add("right","false");
		objeto = new TextField(model,"objeto");
		objeto.setLabel("Objeto");
		objeto.propertie().add("name","p_objeto").add("type","text").add("maxlength","30").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		default_page = new RadioListField(model,"default_page");
		default_page.setLabel("Default Page");
		default_page.propertie().add("name","p_default_page").add("type","radiolist").add("domain","").add("maxlength","30").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("child_size","12").add("right","false");
		preencher_automatico = new RadioListField(model,"preencher_automatico");
		preencher_automatico.setLabel("Preencher autom√°tico");
		preencher_automatico.propertie().add("name","p_preencher_automatico").add("type","radiolist").add("domain","").add("maxlength","30").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("child_size","12").add("right","false");
		pagina = new TextField(model,"pagina");
		pagina.setLabel("P·gina");
		pagina.propertie().add("name","p_pagina").add("type","text").add("maxlength","30").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		formato_output = new ListField(model,"formato_output");
		formato_output.setLabel("Formato output");
		formato_output.propertie().add("name","p_formato_output").add("type","select").add("multiple","false").add("domain","").add("maxlength","30").add("required","true").add("change","false").add("disabled","false").add("right","false");
		guardar_em = new TextField(model,"guardar_em");
		guardar_em.setLabel("Guardar Em");
		guardar_em.propertie().add("name","p_guardar_em").add("type","text").add("maxlength","30").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		p_id = new HiddenField(model,"p_id");
		p_id.setLabel("");
		p_id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("tag","id");
		campo = new TextField(model,"campo");
		campo.setLabel("Campo");
		campo.propertie().add("name","p_campo").add("type","text").add("maxlength","50").add("required","false").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false").add("visible","true").add("desc","true");
		p_estado = new HiddenField(model,"p_estado");
		p_estado.setLabel("");
		p_estado.propertie().add("name","p_estado").add("type","hidden").add("maxlength","30").add("visible","true").add("tag","estado").add("desc","true");

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");
		btn_gravar = new IGRPButton("Gravar","kofax","NovoObjeto","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("code","").add("rel","gravar");
		
	
	}
		
	@Override
	public void render(){
		

		form_1.addField(organica);
		form_1.addField(objeto);
		form_1.addField(default_page);
		form_1.addField(preencher_automatico);
		form_1.addField(pagina);
		form_1.addField(formato_output);
		form_1.addField(guardar_em);
		form_1.addField(p_id);

		separatorlist_1.addField(campo);
		separatorlist_1.addField(p_estado);

		toolsbar_1.addButton(btn_gravar);
		this.addToPage(form_1);
		this.addToPage(separatorlist_1);
		this.addToPage(toolsbar_1);
	}
}
/*-------------------------*/