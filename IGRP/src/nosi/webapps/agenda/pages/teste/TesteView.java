/*-------------------------*/

/*Create View*/

package nosi.webapps.agenda.pages.teste;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;

public class TesteView extends View {
	
	
	public Field cod;
	public Field name;
	public Field email;
	public IGRPSeparatorList separatorlist_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_save;
	public TesteView(Teste model){
		this.setPageTitle("");
			
		separatorlist_1 = new IGRPSeparatorList("separatorlist_1");
		cod = new TextField(model,"cod");
		cod.setLabel("Cod");
		cod.propertie().add("name","p_cod").add("type","text").add("maxlength","30").add("required","false").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false").add("visible","true").add("desc","true");
		name = new TextField(model,"name");
		name.setLabel("Name");
		name.propertie().add("name","p_name").add("type","text").add("maxlength","100").add("required","false").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false").add("visible","true").add("desc","true");
		email = new TextField(model,"email");
		email.setLabel("Email");
		email.propertie().add("name","p_email").add("type","text").add("maxlength","100").add("required","false").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false").add("visible","true").add("desc","true");

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");
		btn_save = new IGRPButton("Save","agenda","Teste","index","submit","default|fa-angle-right","","");
		btn_save.propertie.add("type","specific").add("code","").add("rel","save");
		
	
	}
		
	@Override
	public void render(){
		
		separatorlist_1.addField(cod);
		separatorlist_1.addField(name);
		separatorlist_1.addField(email);


		toolsbar_1.addButton(btn_save);
		this.addToPage(separatorlist_1);
		this.addToPage(toolsbar_1);
	}
}
/*-------------------------*/