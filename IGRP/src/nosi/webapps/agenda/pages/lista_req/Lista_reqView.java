/*-------------------------*/

/*Create View*/

package nosi.webapps.agenda.pages.lista_req;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;

public class Lista_reqView extends View {
	
	
	public Field sectionheader_1_text;
	public Field servicos;
	public Field tipo_de_requisito;
	public Field requisito;
	public Field requisito_item;
	public Field estado;
	public Field nome_requisitos;
	public IGRPSectionHeader sectionheader_1;
	public IGRPTable table_1;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_pesquisar;
	public IGRPButton btn_edit;
	public IGRPButton btn_eliminar;
	public Lista_reqView(Lista_req model){
		this.setPageTitle("Listar os requisitos dos servicos");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1");
		table_1 = new IGRPTable("table_1");
		form_1 = new IGRPForm("form_1");
		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel("");
		sectionheader_1_text.setValue("Requisitos do Serviço");
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("persist","true").add("maxlength","4000");
		servicos = new TextField(model,"servicos");
		servicos.setLabel("Serviços");
		servicos.propertie().add("name","p_servicos").add("type","text").add("maxlength","30").add("align","left").add("lookup_parser","false").add("iskey","false");
		tipo_de_requisito = new TextField(model,"tipo_de_requisito");
		tipo_de_requisito.setLabel("Tipo de requisito");
		tipo_de_requisito.propertie().add("name","p_tipo_de_requisito").add("type","text").add("maxlength","30").add("align","left").add("lookup_parser","false").add("iskey","false");
		requisito = new TextField(model,"requisito");
		requisito.setLabel("Requisito");
		requisito.propertie().add("name","p_requisito").add("type","text").add("maxlength","30").add("align","left").add("lookup_parser","false").add("iskey","false");
		requisito_item = new TextField(model,"requisito_item");
		requisito_item.setLabel("Requisito Item");
		requisito_item.propertie().add("name","p_requisito_item").add("type","text").add("maxlength","30").add("align","left").add("lookup_parser","false").add("iskey","false");
		estado = new TextField(model,"estado");
		estado.setLabel("Estado");
		estado.propertie().add("name","p_estado").add("type","text").add("maxlength","30").add("align","left").add("lookup_parser","false").add("iskey","false");
		nome_requisitos = new TextField(model,"nome_requisitos");
		nome_requisitos.setLabel("Nome Requisitos");
		nome_requisitos.propertie().add("name","p_nome_requisitos").add("type","text").add("maxlength","30").add("required","false").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");
		btn_pesquisar = new IGRPButton("Pesquisar","agenda","Lista_req","pesquisar","submit","default|fa-search","","");
		btn_pesquisar.propertie.add("type","specific").add("code","").add("rel","pesquisar");
		btn_edit = new IGRPButton("Edit","agenda","Lista_req","edit","submit","warning|fa-edit","","");
		btn_edit.propertie.add("type","specific").add("code","").add("class","warning").add("rel","edit");
		btn_eliminar = new IGRPButton("Eliminar","agenda","Lista_req","eliminar","alert_submit","danger|fa-refresh","","");
		btn_eliminar.propertie.add("type","specific").add("code","").add("class","danger").add("rel","eliminar");
		
	
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		table_1.addField(servicos);
		table_1.addField(tipo_de_requisito);
		table_1.addField(requisito);
		table_1.addField(requisito_item);
		table_1.addField(estado);


		form_1.addField(nome_requisitos);

		toolsbar_1.addButton(btn_pesquisar);
		table_1.addButton(btn_edit);
		table_1.addButton(btn_eliminar);
		this.addToPage(sectionheader_1);
		this.addToPage(table_1);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
}
/*-------------------------*/