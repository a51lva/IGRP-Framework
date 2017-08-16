package nosi.core.igrp.mingrations;
/**
 * @author: Emanuel Pereira
 * 30 Jun 2017
 */
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.igrp.dao.*;
import nosi.webapps.igrp.dao.views.CreateViews;

public class MigrationIGRPInitConfig {

	public static void start(){
		Application app = new Application();
		app.setDad("igrp");
		app.setDescription("IGRP Open Source");
		app.setName("IGRP Open Source");
		app.setImg_src("app_casacidadao.png");
		app.setStatus(1);
		app = app.insert();
		
		if(app!=null){
			User user0 = new User("IGRP", "igrp@nosi.cv", "fe01ce2a7fbac8fafaed7c982a04e229", "ADMIN", null, 1, null, 123456789, "admin",null, null, null, null, null,null, 2017, 2017);
			user0 = user0.insert();
			user0 = user0.updateTozero();
			User user1 = new User("Nositeste", "nositeste@nosi.cv", "fe01ce2a7fbac8fafaed7c982a04e229", "ADMIN", null, 1, null, 123456789, "demo",null, null, null, null, null,null, 2017, 2017);
			user1 = user1.insert();
			
			Organization org = new Organization("01.03", "NOSI", 1, app, user0, null);
			org = org.insert();
			
			ProfileType prof0 = new ProfileType("ALL PROFILE", "ALL", 1, null, app, null);
			prof0 = prof0.insert();
			prof0 = prof0.updateToZero();
			
			ProfileType prof1 = new ProfileType("Administrador", "ADMIN", 1, org, app, null);
			prof1 = prof1.insert();
			
			List<Action> actions = new ArrayList<>();
			actions.add(new Action("ListaPage", "index", "nosi.core.webapp.pages.listapage", "igrp/listapage/ListaPage.xsl", "Lista de Paginas", "Lista de Paginas", "2.3", 1, app));
			actions.add(new Action("Env", "index", "nosi.core.webapp.pages.env", "igrp/env/Env.xsl", "Registar Aplicacao", "Registar Aplicacao", "2.3", 1, app));
			actions.add(new Action("ListaEnv", "index", "nosi.core.webapp.pages.listaenv", "igrp/listaenv/ListaEnv.xsl", "Lista de Aplicacao", "Lista de Aplicacao", "2.3", 1, app));
			actions.add(new Action("Dominio", "index", "nosi.core.webapp.pages.dominio", "igrp/dominio/Dominio.xsl", "Lista de Dominio", "Lista de Dominio", "2.3", 1, app));
			actions.add(new Action("NovoDominio", "index", "nosi.core.webapp.pages.novodominio", "igrp/novodominio/NovoDominio.xsl", "Registar Dominio", "Registar Dominio", "2.3", 1, app));
			actions.add(new Action("PesquisarOrganica", "index", "nosi.core.webapp.pages.pesquisarorganica", "igrp/pesquisarorganica/PesquisarOrganica.xsl", "Lista de Organica", "Lista de Organica", "2.3", 1, app));
			actions.add(new Action("NovaOrganica", "index", "nosi.core.webapp.pages.novaorganica", "igrp/novaorganica/NovaOrganica.xsl", "Registar Organica", "Registar Organica", "2.3", 1, app));
			actions.add(new Action("NovoMenu", "index", "nosi.core.webapp.pages.novomenu", "igrp/novomenu/NovoMenu.xsl", "Registar Menu", "Registar Menu", "2.3", 1, app));
			actions.add(new Action("PesquisarMenu", "index", "nosi.core.webapp.pages.pesquisarmenu", "igrp/pesquisarmenu/PesquisarMenu.xsl", "Lista de Menu", "Lista de Menu", "2.3", 1, app));
			actions.add(new Action("NovoPerfil", "index", "nosi.core.webapp.pages.novoperfil", "igrp/novoperfil/NovoPerfil.xsl", "Registar Perfil", "Registar Perfil", "2.3", 1, app));
			actions.add(new Action("PesquisarPerfil", "index", "nosi.core.webapp.pages.pesquisarperfil", "igrp/pesquisarperfil/PesquisarPerfil.xsl", "Lista de Perfil", "Lista de Perfil", "2.3", 1, app));
			actions.add(new Action("PesquisarUtilizador", "index", "nosi.core.webapp.pages.pesquisarutilizador", "igrp/pesquisarutilizador/PesquisarUtilizador.xsl", "Lista de Utilizador", "Lista de Utilizador", "2.3", 1, app));
			actions.add(new Action("NovoUtilizador", "index", "nosi.core.webapp.pages.novoutilizador", "igrp/novoutilizador/NovoUtilizador.xsl", "Registar Utilizador", "Registar Utilizador", "2.3", 1, app));
			actions.add(new Action("Settings", "index", "nosi.core.webapp.pages.settings", "igrp/settings/Settings.xsl", "Settings", "Settings", "2.3", 1, app));
			actions.add(new Action("RegistarUtilizador", "index", "nosi.core.webapp.pages.registarutilizador", "igrp/registarutilizador/RegistarUtilizador.xsl", "Registar Utilizador", "Registar Utilizador", "2.3", 1, app));
			actions.add(new Action("Transaccao", "index", "nosi.core.webapp.pages.transaccao", "igrp/transaccao/Transaccao.xsl", "Transaccao", "Transaccao", "2.3", 1, app));
			actions.add(new Action("Page", "index", "nosi.core.webapp.pages.page", "igrp/page/Page.xsl", "Registar Pagina", "Registar Pagina", "2.3", 1, app));
			actions.add(new Action("MenuOrganica", "index", "nosi.core.webapp.pages.menuorganica", "igrp/menuorganica/MenuOrganica.xsl", "Associar Menu a Organica", "Associar Menu a Organica", "2.3", 1, app));
			actions.add(new Action("ErrorPage", "index", "nosi.core.webapp.pages.errorpage", "igrp/errorpage/ErrorPage.xsl", "Pagina de Erro", "Pagina de Erro", "2.3", 1, app));
			actions.add(new Action("TransacaoOrganica", "index", "nosi.core.webapp.pages.transacaoorganica", "igrp/transacaoorganica/TransacaoOrganica.xsl", "Associar Transacao a Organica", "Associar Transacao a Organica", "2.3", 1, app));
			actions.add(new Action("EditarTransacao", "index", "nosi.core.webapp.pages.editartransacao", "igrp/editartransacao/EditarTransacao.xsl", "Editar Transacao", "Editar Transacao", "2.3", 1, app));
			actions.add(new Action("Session", "index", "nosi.core.webapp.pages.session", "igrp/session/Session.xsl", "Gestao de Sessao", "Gestao de Sessao", "2.3", 1, app));
			actions.add(new Action("WebReport", "index", "nosi.core.webapp.pages.webreport", "igrp/webreport/WebReport.xsl", "Report Builder", "Report Builder", "2.2", 1, app));
			actions.add(new Action("DataSource", "index", "nosi.core.webapp.pages.datasource", "igrp/datasource/DataSource.xsl", "Registar Data Source", "Registar Data Source", "2.3", 1, app));
			actions.add(new Action("LookupListPage", "index", "nosi.core.webapp.pages.lookuplistpage", "igrp/lookuplistpage/LookupListPage.xsl", "Lista de Pagina Para Lookup", "Lista de Pagina Para Lookup", "2.3", 1, app));
			actions.add(new Action("Migrate", "index", null, "igrp/migrate/Migrate.xsl", "Migrate IGRP", "Migrate IGRP", "2.3", 1, app));

			
			for(Action ac:actions){
				ac.insert();
			}
			
			List<Menu> menus = new ArrayList<>();			
			menus.add(new Menu("Gest�o de Aplica��o", 1, 1, 0, null, null, app, null));
			menus.add(new Menu("Par�metros Gerais", 1, 1, 0, null, null, app, null));
			menus.add(new Menu("Auditoria", 1, 1, 0, null, null, app, null));
			
			menus.add(new Menu("Detalhes de Aplica��o", 1, 1, 0, "_self", actions.get(2), app, menus.get(0)));
			menus.add(new Menu("Gest�o de Pagina", 1, 1, 0, "_self", actions.get(0), app, menus.get(0)));
			menus.add(new Menu("Gest�o de Menu", 1, 1, 0, "_self", actions.get(8), app, menus.get(0)));
			menus.add(new Menu("Gest�o de Transa��o", 1, 1, 0, "_self", actions.get(15), app, menus.get(0)));
			menus.add(new Menu("Report Design", 1, 1, 0, "_self", actions.get(22), app, menus.get(0)));
			
			menus.add(new Menu("Gest�o de Organica", 1, 1, 0, "_self", actions.get(5), app, menus.get(1)));
			menus.add(new Menu("Gest�o de Perfil", 1, 1, 0, "_self", actions.get(10), app, menus.get(1)));
			menus.add(new Menu("Gest�o de Utilizador", 1, 1, 0, "_self", actions.get(11), app, menus.get(1)));
			menus.add(new Menu("Settings", 1, 1, 1, "_self", actions.get(13), app, menus.get(1)));
			menus.add(new Menu("Gest�o de Sess�o", 1, 1, 0, "_self", actions.get(21), app, menus.get(2)));
			menus.add(new Menu("Migra��o IGRP", 1, 1, 0, "_self", actions.get(25), app, menus.get(0)));
			
			for(Menu m:menus){
				m.insert();
			}
			
			List<Profile> profiles = new ArrayList<>();
			profiles.add(new Profile(1, "ENV", prof1, user1, org));
			profiles.add(new Profile(1, "PROF", prof1, user1, org));
			profiles.add(new Profile(4, "MEN", prof0, user0, org));
			profiles.add(new Profile(5, "MEN", prof0, user0, org));
			profiles.add(new Profile(6, "MEN", prof0, user0, org));
			profiles.add(new Profile(7, "MEN", prof0, user0, org));
			profiles.add(new Profile(8, "MEN", prof0, user0, org));
			profiles.add(new Profile(9, "MEN", prof0, user0, org));
			profiles.add(new Profile(10, "MEN", prof0, user0, org));
			profiles.add(new Profile(11, "MEN", prof0, user0, org));
			profiles.add(new Profile(12, "MEN", prof0, user0, org));
			profiles.add(new Profile(13, "MEN", prof0, user0, org));
			profiles.add(new Profile(14, "MEN", prof0, user0, org));
			profiles.add(new Profile(4, "MEN", prof1, user0, org));
			profiles.add(new Profile(5, "MEN", prof1, user0, org));
			profiles.add(new Profile(6, "MEN", prof1, user0, org));
			profiles.add(new Profile(7, "MEN", prof1, user0, org));
			profiles.add(new Profile(8, "MEN", prof1, user0, org));
			profiles.add(new Profile(9, "MEN", prof1, user0, org));
			profiles.add(new Profile(10, "MEN", prof1, user0, org));
			profiles.add(new Profile(11, "MEN", prof1, user0, org));
			profiles.add(new Profile(12, "MEN", prof1, user0, org));
			profiles.add(new Profile(13, "MEN", prof1, user0, org));
			profiles.add(new Profile(14, "MEN", prof1, user0, org));
			
			for(Profile p:profiles){
				p.insert();
			}
			profiles = null;
			menus = null;
			actions = null;
			new CreateViews();
			configAppAgenda(user0,user1,prof0);
			configAppKofax(user0,user1,prof0);
			configAppMarcacaoConsulta(user0,user1,prof0);
		}
	}
	
	
	private static void configAppAgenda(User user0,User user,ProfileType prof0){
		Application app = new Application();
		app.setDad("agenda");
		app.setDescription("Agenda Eletronica");
		app.setName("Agenda Eletronica");
		app.setImg_src("default.png");
		app.setStatus(1);
		app = app.insert();
		Organization org = new Organization("Org.Agenda", "Agenda", 1, app, user, null);
		org = org.insert();
		
		ProfileType prof = new ProfileType("Administrador", "Agenda.Admin", 1, org, app, null);
		prof = prof.insert();
		
		List<Action> actions = new ArrayList<>();
		actions.add(new Action("AddServicos", "index", null, "agenda/addservicos/AddServicos.xsl", "Adicionar Servi�os", "Adicionar Servi�os", "2.3", 1, app));
		actions.add(new Action("AGDashboard", "index", null, "agenda/agdashboard/AGDashboard.xsl", "Dashboard Agenda Eletronica", "Dashboard Agenda Eletronica", "2.3", 1, app));
		actions.add(new Action("Agenda", "index", null, "agenda/agenda/Agenda.xsl", "Efetuar uma agenda", "Efetuar uma agenda", "2.3", 1, app));
		actions.add(new Action("Agendamentos", "index", null, "agenda/agendamentos/Agendamentos.xsl", "Lista de Agendamentos", "Lista de Agendamentos", "2.3", 1, app));
		actions.add(new Action("Agendar", "index", null, "agenda/agendar/Agendar.xsl", "Agendar", "Agendar", "2.3", 1, app));
		actions.add(new Action("AGENDA_PRESENCA", "index", null, "agenda/agenda_presenca/AGENDA_PRESENCA.xsl", "Marcar Presen�a do Cidadao", "Marcar Presen�a do Cidadao", "2.3", 1, app));
		actions.add(new Action("CONFIG_BALCAO", "index", null, "agenda/config_balcao/CONFIG_BALCAO.xsl", "Configura��o de Balcao", "Configura��o de Balcao", "2.3", 1, app));
		actions.add(new Action("ENTIDADE", "index", null, "agenda/entidade/ENTIDADE.xsl", "Adicionar Entidades", "Adicionar Entidades", "2.3", 1, app));
		actions.add(new Action("LST_BALCAO", "index", null, "agenda/lst_balcao/LST_BALCAO.xsl", "Lista de Balcao", "Lista de Balcao", "2.3", 1, app));
		actions.add(new Action("LST_ENTIDADE", "index", null, "agenda/lst_entidade/LST_ENTIDADE.xsl", "Lista de Entidades", "Lista de Entidades", "2.3", 1, app));
		actions.add(new Action("LST_SERV", "index", null, "agenda/lst_serv/LST_SERV.xsl", "Lista de Servi�os", "Lista de Servi�os", "2.3", 1, app));
		actions.add(new Action("NOTIFICACAO", "index", null, "agenda/notificacao/NOTIFICACAO.xsl", "Notifica��es", "Notifica��es", "2.3", 1, app));
		actions.add(new Action("REQ_SERVICOS", "index", null, "agenda/req_servicos/REQ_SERVICOS.xsl", "Requisi��es de Servi�os", "Requisi��es de Servi�os", "2.3", 1, app));
		actions.add(new Action("MyAgenda", "index", null, "agenda/myagenda/MyAgenda.xsl", "Minha Agenda", "Minha Agenda", "2.3", 1, app));
		for(Action ac:actions){
			ac.insert();
		}
		List<Menu> menus = new ArrayList<>();			
		menus.add(new Menu("Gest�o de Agenda", 1, 1, 0, null, null, app, null));		
		menus.add(new Menu("Agendar", 1, 1, 0, "_self", actions.get(4), app, menus.get(0)));
		menus.add(new Menu("Configurar Balcao", 1, 1, 0, "_self", actions.get(6), app, menus.get(0)));
		menus.add(new Menu("Adicionar Entidade", 1, 1, 0, "_self", actions.get(7), app, menus.get(0)));
		menus.add(new Menu("Adicionar Servi�os", 1, 1, 0, "_self", actions.get(0), app, menus.get(0)));
		menus.add(new Menu("Agendamentos", 1, 1, 0, "_self", actions.get(3), app, menus.get(0)));
		menus.add(new Menu("Confirmar Presen�a", 1, 1, 0, "_self", actions.get(5), app, menus.get(0)));
		menus.add(new Menu("Dash Board", 1, 1, 0, "_self", actions.get(1), app, menus.get(0)));
		
		for(Menu m:menus){
			m.insert();
		}
		
		List<Profile> profiles = new ArrayList<>();
		profiles.add(new Profile(2, "ENV", prof, user, org));
		profiles.add(new Profile(2, "PROF", prof, user, org));
		profiles.add(new Profile(16, "MEN", prof0, user0, org));
		profiles.add(new Profile(17, "MEN", prof0, user0, org));
		profiles.add(new Profile(18, "MEN", prof0, user0, org));
		profiles.add(new Profile(19, "MEN", prof0, user0, org));
		profiles.add(new Profile(20, "MEN", prof0, user0, org));
		profiles.add(new Profile(21, "MEN", prof0, user0, org));
		profiles.add(new Profile(22, "MEN", prof0, user0, org));
		profiles.add(new Profile(16, "MEN", prof, user0, org));
		profiles.add(new Profile(17, "MEN", prof, user0, org));
		profiles.add(new Profile(18, "MEN", prof, user0, org));
		profiles.add(new Profile(19, "MEN", prof, user0, org));
		profiles.add(new Profile(20, "MEN", prof, user0, org));
		profiles.add(new Profile(21, "MEN", prof, user0, org));
		profiles.add(new Profile(22, "MEN", prof, user0, org));
		
		for(Profile p:profiles){
			p.insert();
		}

		profiles = null;
		menus = null;
		actions = null;
	}
	
	private static void configAppKofax(User user0,User user,ProfileType prof0){
		Application app = new Application();
		app.setDad("kofax");
		app.setDescription("Kofax - Recupera��o de Arquivo");
		app.setName("Kofax");
		app.setImg_src("default.png");
		app.setStatus(1);
		app = app.insert();
		Organization org = new Organization("Org.Kofax", "Kofax", 1, app, user, null);
		org = org.insert();
		
		ProfileType prof = new ProfileType("Administrador", "Kofax.Admin", 1, org, app, null);
		prof = prof.insert();
		
		List<Action> actions = new ArrayList<>();
		actions.add(new Action("ListaObjeto", "index", null, "kofax/listaobjeto/ListaObjeto.xsl", "Listar Objetos", "Listar Objetos", "2.3", 1, app));
		actions.add(new Action("NovoObjeto", "index", null, "kofax/novoobjeto/NovoObjeto.xsl", "Registar Novo Objeto", "Registar Novo Objeto", "2.3", 1, app));
		actions.add(new Action("Recuperacao", "index", null, "kofax/recuperacao/Recuperacao.xsl", "Recuperacao de Arquivo", "Recuperacao de Arquivo", "2.3", 1, app));
		
		for(Action ac:actions){
			ac.insert();
		}
		List<Menu> menus = new ArrayList<>();			
		menus.add(new Menu("Recupera��o de Arquivo", 1, 1, 0, null, null, app, null));		
		menus.add(new Menu("Listar Objetos", 1, 1, 0, "_self", actions.get(0), app, menus.get(0)));
		menus.add(new Menu("Configurar Objeto", 1, 1, 0, "_self", actions.get(1), app, menus.get(0)));
		menus.add(new Menu("Configurar Recupera��o de Arquivo", 1, 1, 0, "_self", actions.get(2), app, menus.get(0)));
		
		for(Menu m:menus){
			m.insert();
		}
		
		List<Profile> profiles = new ArrayList<>();
		profiles.add(new Profile(3, "ENV", prof, user, org));
		profiles.add(new Profile(3, "PROF", prof, user, org));
		profiles.add(new Profile(24, "MEN", prof0, user0, org));
		profiles.add(new Profile(25, "MEN", prof0, user0, org));
		profiles.add(new Profile(26, "MEN", prof0, user0, org));
		profiles.add(new Profile(24, "MEN", prof, user0, org));
		profiles.add(new Profile(25, "MEN", prof, user0, org));
		profiles.add(new Profile(26, "MEN", prof, user0, org));
		
		for(Profile p:profiles){
			p.insert();
		}

		profiles = null;
		menus = null;
		actions = null;
	}
	
	private static void configAppMarcacaoConsulta(User user0,User user,ProfileType prof0){
		Application app = new Application();
		app.setDad("marcacao_consulta");
		app.setDescription("Marca��o de Consulta");
		app.setName("Marca��o de Consulta");
		app.setImg_src("saude.png");
		app.setStatus(1);
		app = app.insert();
		Organization org = new Organization("Org.M.Consulta", "Marcacao Consulta", 1, app, user, null);
		org = org.insert();
		
		ProfileType prof = new ProfileType("Administrador", "M.Consulta.Admin", 1, org, app, null);
		prof = prof.insert();
		
		List<Action> actions = new ArrayList<>();
		actions.add(new Action("ConsultaPendente", "index", null, "marcacao_consulta/consultapendente/ConsultaPendente.xsl	", "Lista de Consultas Pendentes", "Lista de Consultas Pendentes", "2.3", 1, app));
		actions.add(new Action("DashBoard", "index", null, "	marcacao_consulta/dashboard/DashBoard.xsl", "Dashboard", "Dashboard", "2.3", 1, app));
		actions.add(new Action("ListaMedico", "index", null, "marcacao_consulta/listamedico/ListaMedico.xsl", "Lista de Medicos", "Lista de Medicos", "2.3", 1, app));
		actions.add(new Action("ListarUtente", "index", null, "marcacao_consulta/listarutente/ListarUtente.xsl", "Lista de Utentes", "Lista de Utentes", "2.3", 1, app));
		actions.add(new Action("MarcarConsulta", "index", null, "	marcacao_consulta/marcarconsulta/MarcarConsulta.xsl", "Marcar Consulta", "Marcar Consulta", "2.3", 1, app));
		actions.add(new Action("RegistarMedico", "index", null, "marcacao_consulta/registarmedico/RegistarMedico.xsl", "Registar Medico", "Registar Medico", "2.3", 1, app));
		actions.add(new Action("RegistarUtente", "index", null, "marcacao_consulta/registarutente/RegistarUtente.xsl", "Registar Utente", "Registar Utente", "2.3", 1, app));
		
		for(Action ac:actions){
			ac.insert();
		}
		List<Menu> menus = new ArrayList<>();			
		menus.add(new Menu("Gest�o de Consulta", 1, 1, 0, null, null, app, null));		
		menus.add(new Menu("Registar Medico", 1, 1, 0, "_self", actions.get(5), app, menus.get(0)));
		menus.add(new Menu("Registar Utente", 1, 1, 0, "_self", actions.get(6), app, menus.get(0)));
		menus.add(new Menu("Marcar Consulta", 1, 1, 0, "_self", actions.get(4), app, menus.get(0)));
		menus.add(new Menu("Consultas Pendentes", 1, 1, 0, "_self", actions.get(0), app, menus.get(0)));
		menus.add(new Menu("Dashboard", 1, 1, 0, "_self", actions.get(1), app, menus.get(0)));
		
		for(Menu m:menus){
			m.insert();
		}
		
		List<Profile> profiles = new ArrayList<>();
		profiles.add(new Profile(4, "ENV", prof, user, org));
		profiles.add(new Profile(4, "PROF", prof, user, org));
		profiles.add(new Profile(28, "MEN", prof0, user0, org));
		profiles.add(new Profile(29, "MEN", prof0, user0, org));
		profiles.add(new Profile(30, "MEN", prof0, user0, org));
		profiles.add(new Profile(31, "MEN", prof0, user0, org));
		profiles.add(new Profile(32, "MEN", prof0, user0, org));
		profiles.add(new Profile(28, "MEN", prof, user0, org));
		profiles.add(new Profile(29, "MEN", prof, user0, org));
		profiles.add(new Profile(30, "MEN", prof, user0, org));
		profiles.add(new Profile(31, "MEN", prof, user0, org));
		profiles.add(new Profile(32, "MEN", prof, user0, org));
		
		for(Profile p:profiles){
			p.insert();
		}

		profiles = null;
		menus = null;
		actions = null;
	}
}

	
