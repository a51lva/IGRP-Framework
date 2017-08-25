/*-------------------------*/

/*Create View*/

package nosi.webapps.agenda.pages.pontoatendimento;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;

public class PontoAtendimentoView extends View {
	
	
	public Field page_title_text;
	public Field entidade;
	public Field organica;
	public Field ponto_de_atendimento;
	public Field p_id_organica_lst;
	public Field p_id_entidade_lst;
	public Field p_id_aplicacao_lst;
	public Field p_id_balcao;
	public Field ponto;
	public Field n_de_servicos;
	public Field localizacao;
	public Field fuso_horario;
	public Field confirmacao_automatica;
	public Field plaintext_1;
	public Field horario_de_atendimento;
	public Field hora_inicio;
	public Field hora_fim;
	public Field p_id;
	public Field p_id_organica;
	public Field p_id_entidade;
	public Field p_id_aplicacao;
	public Field p_id_localizacao;
	public Field p_cordenadas;
	public Field servicos;
	public Field p_id_serv_balcao;
	public Field p_id_servico;
	public IGRPSectionHeader page_title;
	public IGRPForm form_2;
	public IGRPTable table_1;
	public IGRPForm form_1;
	public IGRPTable table_2;

	public IGRPToolsBar toolsbar_2;
	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar;
	public IGRPButton btn_novo;
	public IGRPButton btn_configurar;
	public IGRPButton btn_remover;
	public IGRPButton btn_requisitos;
	public IGRPButton btn_eliminar;
	public PontoAtendimentoView(PontoAtendimento model){
		this.setPageTitle("Ponto de Atendimento");
			
		page_title = new IGRPSectionHeader("page_title");
		form_2 = new IGRPForm("form_2");
		table_1 = new IGRPTable("table_1");
		form_1 = new IGRPForm("form_1");
		table_2 = new IGRPTable("table_2");
		page_title_text = new TextField(model,"page_title_text");
		page_title_text.setLabel("");
		page_title_text.setValue("Ponto de Atendimento");
		page_title_text.propertie().add("type","text").add("name","p_page_title_text").add("persist","true").add("maxlength","4000");
		entidade = new ListField(model,"entidade");
		entidade.setLabel("Entidade");
		entidade.propertie().add("name","p_entidade").add("type","select").add("multiple","false").add("domain","").add("maxlength","30").add("required","true").add("change","true").add("disabled","false").add("right","false");
		organica = new LinkField(model,"organica");
		organica.setLabel("Orgânica");
		organica.propertie().add("name","p_organica").add("type","link").add("target","_self").add("target_fields","").add("action","index").add("page","AddServicos").add("app","agenda").add("class","link").add("btnSize","[object Object]").add("iconColor","#333").add("iconClass","").add("img","fa-link").add("maxlength","300").add("align","left").add("lookup_parser","false").add("iskey","false").add("desc","true");
		ponto_de_atendimento = new TextField(model,"ponto_de_atendimento");
		ponto_de_atendimento.setLabel("Ponto de Atendimento");
		ponto_de_atendimento.propertie().add("name","p_ponto_de_atendimento").add("type","text").add("maxlength","300").add("align","left").add("lookup_parser","false").add("iskey","false");
		p_id_organica_lst = new HiddenField(model,"p_id_organica_lst");
		p_id_organica_lst.setLabel("");
		p_id_organica_lst.propertie().add("name","p_id_organica_lst").add("type","hidden").add("maxlength","30").add("tag","id_organica_lst");
		p_id_entidade_lst = new HiddenField(model,"p_id_entidade_lst");
		p_id_entidade_lst.setLabel("");
		p_id_entidade_lst.propertie().add("name","p_id_entidade_lst").add("type","hidden").add("maxlength","30").add("tag","id_entidade_lst");
		p_id_aplicacao_lst = new HiddenField(model,"p_id_aplicacao_lst");
		p_id_aplicacao_lst.setLabel("");
		p_id_aplicacao_lst.propertie().add("name","p_id_aplicacao_lst").add("type","hidden").add("maxlength","30").add("tag","id_aplicacao_lst");
		p_id_balcao = new HiddenField(model,"p_id_balcao");
		p_id_balcao.setLabel("");
		p_id_balcao.propertie().add("name","p_id_balcao").add("type","hidden").add("maxlength","30").add("tag","id_balcao");
		ponto = new TextField(model,"ponto");
		ponto.setLabel("Ponto de Atendimento");
		ponto.propertie().add("name","p_ponto").add("type","text").add("maxlength","300").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		n_de_servicos = new ListField(model,"n_de_servicos");
		n_de_servicos.setLabel("Nº de Serviços");
		n_de_servicos.propertie().add("name","p_n_de_servicos").add("type","select").add("multiple","false").add("domain","").add("maxlength","2").add("required","true").add("change","false").add("disabled","false").add("right","false");
		localizacao = new TextField(model,"localizacao");
		localizacao.setLabel("Localização");
		localizacao.propertie().add("name","p_localizacao").add("type","text").add("maxlength","300").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		fuso_horario = new TextField(model,"fuso_horario");
		fuso_horario.setLabel("Fuso Horário");
		fuso_horario.propertie().add("name","p_fuso_horario").add("type","text").add("maxlength","300").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false");
		confirmacao_automatica = new RadioListField(model,"confirmacao_automatica");
		confirmacao_automatica.setLabel("Confirmação Automática");
		confirmacao_automatica.propertie().add("name","p_confirmacao_automatica").add("type","radiolist").add("domain","YES_NO").add("maxlength","30").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("child_size","12").add("right","false");
		plaintext_1 = new PlainTextField(model,"plaintext_1");
		plaintext_1.setLabel("Plaintext");
		plaintext_1.propertie().add("name","p_plaintext_1").add("type","plaintext").add("clear","false").add("maxlength","30").add("right","false");
		horario_de_atendimento = new SeparatorField(model,"horario_de_atendimento");
		horario_de_atendimento.setLabel("Horário de Atendimento");
		horario_de_atendimento.propertie().add("name","p_horario_de_atendimento").add("type","separator").add("maxlength","30").add("placeholder","").add("right","false");
		hora_inicio = new DateField(model,"hora_inicio");
		hora_inicio.setLabel("Hora Inicio");
		hora_inicio.propertie().add("name","p_hora_inicio").add("type","date").add("format","IGRP_timePicker").add("maxlength","30").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false").add("class","default");
		hora_fim = new DateField(model,"hora_fim");
		hora_fim.setLabel("Hora Fim");
		hora_fim.propertie().add("name","p_hora_fim").add("type","date").add("format","IGRP_timePicker").add("maxlength","30").add("required","true").add("change","false").add("readonly","false").add("disabled","false").add("placeholder","").add("right","false").add("class","default");
		p_id = new HiddenField(model,"p_id");
		p_id.setLabel("");
		p_id.propertie().add("name","p_id").add("type","hidden").add("maxlength","30").add("tag","id");
		p_id_organica = new HiddenField(model,"p_id_organica");
		p_id_organica.setLabel("");
		p_id_organica.propertie().add("name","p_id_organica").add("type","hidden").add("maxlength","30").add("tag","id_organica");
		p_id_entidade = new HiddenField(model,"p_id_entidade");
		p_id_entidade.setLabel("");
		p_id_entidade.propertie().add("name","p_id_entidade").add("type","hidden").add("maxlength","30").add("tag","id_entidade");
		p_id_aplicacao = new HiddenField(model,"p_id_aplicacao");
		p_id_aplicacao.setLabel("");
		p_id_aplicacao.propertie().add("name","p_id_aplicacao").add("type","hidden").add("maxlength","30").add("tag","id_aplicacao");
		p_id_localizacao = new HiddenField(model,"p_id_localizacao");
		p_id_localizacao.setLabel("");
		p_id_localizacao.propertie().add("name","p_id_localizacao").add("type","hidden").add("maxlength","30").add("tag","id_localizacao");
		p_cordenadas = new HiddenField(model,"p_cordenadas");
		p_cordenadas.setLabel("");
		p_cordenadas.propertie().add("name","p_cordenadas").add("type","hidden").add("maxlength","200").add("tag","cordenadas");
		servicos = new TextField(model,"servicos");
		servicos.setLabel("Serviços");
		servicos.propertie().add("name","p_servicos").add("type","text").add("maxlength","30").add("align","left").add("lookup_parser","false").add("iskey","false");
		p_id_serv_balcao = new HiddenField(model,"p_id_serv_balcao");
		p_id_serv_balcao.setLabel("");
		p_id_serv_balcao.propertie().add("name","p_id_serv_balcao").add("type","hidden").add("maxlength","30").add("tag","id_serv_balcao");
		p_id_servico = new HiddenField(model,"p_id_servico");
		p_id_servico.setLabel("");
		p_id_servico.propertie().add("name","p_id_servico").add("type","hidden").add("maxlength","30").add("tag","id_servico");

		toolsbar_2 = new IGRPToolsBar("toolsbar_2");
		toolsbar_1 = new IGRPToolsBar("toolsbar_1");
		btn_gravar = new IGRPButton("Gravar","agenda","PontoAtendimento","gravar","submit_form","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("code","").add("rel","gravar");
		btn_novo = new IGRPButton("Novo","agenda","PontoAtendimento","novo","submit_popup","success|fa-plus-square","","");
		btn_novo.propertie.add("type","specific").add("code","").add("rel","novo");
		btn_configurar = new IGRPButton("Configurar","agenda","PontoAtendimento","configurar","submit_popup","info|fa-certificate","","");
		btn_configurar.propertie.add("type","specific").add("code","").add("rel","configurar");
		btn_remover = new IGRPButton("Remover","agenda","PontoAtendimento","remover","alert_submit","danger|fa-close","","");
		btn_remover.propertie.add("type","specific").add("code","").add("class","danger").add("rel","remover");
		btn_requisitos = new IGRPButton("Requisitos","agenda","PontoAtendimento","requisitos","_blank","warning|fa-info","","");
		btn_requisitos.propertie.add("type","specific").add("code","").add("class","warning").add("rel","requisitos");
		btn_eliminar = new IGRPButton("Eliminar","agenda","PontoAtendimento","eliminar","alert_submit","danger|fa-close","","");
		btn_eliminar.propertie.add("type","specific").add("code","").add("class","danger").add("rel","eliminar");
		
	
	}
		
	@Override
	public void render(){
		
		page_title.addField(page_title_text);

		form_2.addField(entidade);

		table_1.addField(organica);
		table_1.addField(ponto_de_atendimento);
		table_1.addField(p_id_organica_lst);
		table_1.addField(p_id_entidade_lst);
		table_1.addField(p_id_aplicacao_lst);
		table_1.addField(p_id_balcao);


		form_1.addField(ponto);
		form_1.addField(n_de_servicos);
		form_1.addField(localizacao);
		form_1.addField(fuso_horario);
		form_1.addField(confirmacao_automatica);
		form_1.addField(plaintext_1);
		form_1.addField(horario_de_atendimento);
		form_1.addField(hora_inicio);
		form_1.addField(hora_fim);
		form_1.addField(p_id);
		form_1.addField(p_id_organica);
		form_1.addField(p_id_entidade);
		form_1.addField(p_id_aplicacao);
		form_1.addField(p_id_localizacao);
		form_1.addField(p_cordenadas);


		table_2.addField(servicos);
		table_2.addField(p_id_serv_balcao);
		table_2.addField(p_id_servico);

		toolsbar_2.addButton(btn_gravar);
		toolsbar_1.addButton(btn_novo);
		toolsbar_1.addButton(btn_configurar);
		table_1.addButton(btn_remover);
		table_2.addButton(btn_requisitos);
		table_2.addButton(btn_eliminar);
		this.addToPage(page_title);
		this.addToPage(form_2);
		this.addToPage(table_1);
		this.addToPage(form_1);
		this.addToPage(table_2);
		this.addToPage(toolsbar_2);
		this.addToPage(toolsbar_1);
	}
}
/*-------------------------*/