/*-------------------------*/

/*Create View*/

package nosi.webapps.agenda.pages.lista_req;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;

public class Lista_reqView extends View {
	
	
	public Field sectionheader_1_text;
	public Field tipo_de_requisito;
	public Field requisito;
	public Field requisito_item;
	public IGRPSectionHeader sectionheader_1;
	public IGRPTable table_1;

	public Lista_reqView(Lista_req model){
		this.setPageTitle("Listar os requisitos dos servicos");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1");
		table_1 = new IGRPTable("table_1");
		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel("");
		sectionheader_1_text.setValue("Requisitos do Serviço");
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("persist","true").add("maxlength","4000");
		tipo_de_requisito = new TextField(model,"tipo_de_requisito");
		tipo_de_requisito.setLabel("Tipo de requisito");
		tipo_de_requisito.propertie().add("name","p_tipo_de_requisito").add("type","text").add("maxlength","30").add("align","left").add("lookup_parser","false").add("iskey","false");
		requisito = new TextField(model,"requisito");
		requisito.setLabel("Requisito");
		requisito.propertie().add("name","p_requisito").add("type","text").add("maxlength","30").add("align","left").add("lookup_parser","false").add("iskey","false");
		requisito_item = new TextField(model,"requisito_item");
		requisito_item.setLabel("Requisito Item");
		requisito_item.propertie().add("name","p_requisito_item").add("type","text").add("maxlength","30").add("align","left").add("lookup_parser","false").add("iskey","false");

		
	
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		table_1.addField(tipo_de_requisito);
		table_1.addField(requisito);
		table_1.addField(requisito_item);

		this.addToPage(sectionheader_1);
		this.addToPage(table_1);
	}
}
/*-------------------------*/