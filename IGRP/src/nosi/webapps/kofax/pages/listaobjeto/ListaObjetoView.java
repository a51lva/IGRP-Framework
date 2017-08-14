/*-------------------------*/

/*Create View*/

package nosi.webapps.kofax.pages.listaobjeto;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;

public class ListaObjetoView extends View {
	
	
	public Field objeto;
	public Field pagina;
	public Field organica;
	public Field estado;
	public Field p_id;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;
	public ListaObjetoView(ListaObjeto model){
		this.setPageTitle("Listar Objetos");
			
		table_1 = new IGRPTable("table_1");
		objeto = new TextField(model,"objeto");
		objeto.setLabel("Objeto");
		objeto.propertie().add("name","p_objeto").add("type","text").add("maxlength","100").add("align","left").add("lookup_parser","false").add("iskey","false");
		pagina = new TextField(model,"pagina");
		pagina.setLabel("Página");
		pagina.propertie().add("name","p_pagina").add("type","text").add("maxlength","50").add("align","left").add("lookup_parser","false").add("iskey","false");
		organica = new TextField(model,"organica");
		organica.setLabel("Orgânica");
		organica.propertie().add("name","p_organica").add("type","text").add("maxlength","50").add("align","left").add("lookup_parser","false").add("iskey","false");
		estado = new TextField(model,"estado");
		estado.setLabel("Estado");
		estado.propertie().add("name","p_estado").add("type","text").add("maxlength","30").add("align","left").add("lookup_parser","false").add("iskey","false");
		p_id = new HiddenField(model,"p_id");
		p_id.setLabel("");
		p_id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("tag","id");

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");
		btn_novo = new IGRPButton("Novo","kofax","ListaObjeto","novo","_self","success|fa-plus-square","","");
		btn_novo.propertie.add("type","specific").add("code","").add("rel","novo");
		btn_editar = new IGRPButton("Editar","kofax","ListaObjeto","editar","submit","warning|fa-pencil-square-o","","");
		btn_editar.propertie.add("type","specific").add("code","").add("class","warning").add("rel","editar");
		btn_eliminar = new IGRPButton("Eliminar","kofax","ListaObjeto","eliminar","confirm","danger|fa-remove","","");
		btn_eliminar.propertie.add("type","specific").add("code","").add("class","danger").add("rel","eliminar");
		
	
	}
		
	@Override
	public void render(){
		

		table_1.addField(objeto);
		table_1.addField(pagina);
		table_1.addField(organica);
		table_1.addField(estado);
		table_1.addField(p_id);

		toolsbar_1.addButton(btn_novo);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_eliminar);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
}
/*-------------------------*/