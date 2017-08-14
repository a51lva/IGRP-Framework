/*-------------------------*/

/*Create View*/

package nosi.webapps.kofax.pages.recuperacao;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;

public class RecuperacaoView extends View {
	
	
	public Field identificacao;
	public Field tipo_objeto;
	public Field n_no_negocio;
	public Field n_de_processo;
	public Field data_de_registo;
	public Field nome;
	public Field tipo_documento;
	public Field n_de_documento;
	public Field localizacao_fisica;
	public Field estante;
	public Field pasta;
	public Field livro;
	public Field folha;
	public Field p_id;
	public Field informacoes_adicionais;
	public Field campo;
	public Field valor;
	public IGRPForm form_1;
	public IGRPSeparatorList separatorlist_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar;
	public RecuperacaoView(Recuperacao model){
		this.setPageTitle("Recuperacao de Arquivo");
			
		form_1 = new IGRPForm("form_1");
		separatorlist_1 = new IGRPSeparatorList("separatorlist_1");
		identificacao = new SeparatorField(model,"identificacao");
		identificacao.setLabel("Identifica��o");
		identificacao.propertie().add("name","p_identificacao").add("type","separator").add("maxlength","30").add("placeholder","").add("right","false");
		tipo_objeto = new ListField(model,"tipo_objeto");
		tipo_objeto.setLabel("Tipo Objeto");
		tipo_objeto.propertie().add("name","p_tipo_objeto").add("type","select").add("multiple","false").add("domain","").add("maxlength","30").add("required","true").add("change","false").add("disabled","false").add("right","false");
		n_no_negocio = new NumberField(model,"n_no_negocio");
		n_no_negocio.setLabel("N� no neg�cio");
		n_no_negocio.propertie().add("name","p_n_no_negocio").add("type","number").add("min","").add("max","").add("maxlength","30").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		n_de_processo = new NumberField(model,"n_de_processo");
		n_de_processo.setLabel("N� de processo");
		n_de_processo.propertie().add("name","p_n_de_processo").add("type","number").add("min","").add("max","").add("maxlength","30").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		data_de_registo = new DateField(model,"data_de_registo");
		data_de_registo.setLabel("Data de registo");
		data_de_registo.propertie().add("name","p_data_de_registo").add("type","date").add("format","IGRP_datePicker").add("maxlength","30").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false").add("class","default");
		nome = new TextField(model,"nome");
		nome.setLabel("Nome");
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","30").add("required","false").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		tipo_documento = new ListField(model,"tipo_documento");
		tipo_documento.setLabel("Tipo Documento");
		tipo_documento.propertie().add("name","p_tipo_documento").add("type","select").add("multiple","false").add("domain","").add("maxlength","30").add("required","false").add("change","false").add("disabled","false").add("right","false");
		n_de_documento = new NumberField(model,"n_de_documento");
		n_de_documento.setLabel("N� de Documento");
		n_de_documento.propertie().add("name","p_n_de_documento").add("type","number").add("min","").add("max","").add("maxlength","30").add("required","false").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		localizacao_fisica = new SeparatorField(model,"localizacao_fisica");
		localizacao_fisica.setLabel("Localiza��o F�sica");
		localizacao_fisica.propertie().add("name","p_localizacao_fisica").add("type","separator").add("maxlength","30").add("placeholder","").add("right","false");
		estante = new TextField(model,"estante");
		estante.setLabel("Estante");
		estante.propertie().add("name","p_estante").add("type","text").add("maxlength","30").add("required","false").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		pasta = new TextField(model,"pasta");
		pasta.setLabel("Pasta");
		pasta.propertie().add("name","p_pasta").add("type","text").add("maxlength","30").add("required","false").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		livro = new TextField(model,"livro");
		livro.setLabel("Livro");
		livro.propertie().add("name","p_livro").add("type","text").add("maxlength","30").add("required","false").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		folha = new TextField(model,"folha");
		folha.setLabel("Folha");
		folha.propertie().add("name","p_folha").add("type","text").add("maxlength","30").add("required","false").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		p_id = new HiddenField(model,"p_id");
		p_id.setLabel("");
		p_id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("tag","id");
		informacoes_adicionais = new SeparatorField(model,"informacoes_adicionais");
		informacoes_adicionais.setLabel("Informa��es Adicionais");
		informacoes_adicionais.propertie().add("name","p_informacoes_adicionais").add("type","separator").add("maxlength","30").add("placeholder","").add("right","false").add("visible","true").add("desc","true");
		campo = new ListField(model,"campo");
		campo.setLabel("Campo");
		campo.propertie().add("name","p_campo").add("type","select").add("multiple","false").add("domain","").add("maxlength","30").add("required","true").add("change","false").add("disabled","false").add("right","false").add("visible","true").add("desc","true");
		valor = new TextAreaField(model,"valor");
		valor.setLabel("Valor");
		valor.propertie().add("name","p_valor").add("type","textarea").add("maxlength","30").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false").add("visible","true").add("desc","true");

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");
		btn_gravar = new IGRPButton("Gravar","kofax","Recuperacao","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("code","").add("rel","gravar");
		
	
	}
		
	@Override
	public void render(){
		

		form_1.addField(identificacao);
		form_1.addField(tipo_objeto);
		form_1.addField(n_no_negocio);
		form_1.addField(n_de_processo);
		form_1.addField(data_de_registo);
		form_1.addField(nome);
		form_1.addField(tipo_documento);
		form_1.addField(n_de_documento);
		form_1.addField(localizacao_fisica);
		form_1.addField(estante);
		form_1.addField(pasta);
		form_1.addField(livro);
		form_1.addField(folha);
		form_1.addField(p_id);

		separatorlist_1.addField(informacoes_adicionais);
		separatorlist_1.addField(campo);
		separatorlist_1.addField(valor);

		toolsbar_1.addButton(btn_gravar);
		this.addToPage(form_1);
		this.addToPage(separatorlist_1);
		this.addToPage(toolsbar_1);
	}
}
/*-------------------------*/