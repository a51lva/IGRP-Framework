package nosi.teste;

import nosi.core.gui.fields.CheckBoxListField;
import nosi.core.gui.fields.EmailField;
import nosi.core.gui.fields.Field;
import nosi.core.gui.fields.ListField;
import nosi.core.gui.fields.RadioListField;
import nosi.core.gui.fields.TextField;
import nosi.core.gui.page.Page;

public class MainTest {

	public static void main(String[] args) {
		Field nome = new TextField("nome");
		nome.setValue("Ima");
		
		Field morada = new TextField("morada");
		morada.setValue("VN");
		
		Field select = new ListField("select");
		select.addOption("Option 1", 1);
		select.addOption("Option 2", 2);
		
		Field radiolist = new RadioListField("radiolist");
		radiolist.addOption("Check 1", 1);
		radiolist.addOption("Check 2", 2);
		

		Field checkboxlist = new CheckBoxListField("checkboxlist");
		checkboxlist.addOption("Check 1", 1);
		checkboxlist.addOption("Check 2", 2);
		
		Field email = new EmailField("email");
		email.setValue("ima@gmail.com");
		Page page = new Page();
		
		page.addField(nome);
		page.addField(morada);
		page.addField(select);
		page.addField(radiolist);
		page.addField(checkboxlist);
		page.addField(email);
		
		page.displayForm();
	}

}