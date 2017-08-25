/*---------------------- Create Model ----------------------*/
package nosi.webapps.agenda.pages.pontoatendimento;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import java.util.ArrayList;

public class PontoAtendimento extends Model{		
	@RParam(rParamName = "p_page_title_text")
	private String page_title_text;
	@RParam(rParamName = "p_entidade")
	private String entidade;
	@RParam(rParamName = "p_ponto")
	private String ponto;
	@RParam(rParamName = "p_n_de_servicos")
	private String n_de_servicos;
	@RParam(rParamName = "p_localizacao")
	private String localizacao;
	@RParam(rParamName = "p_fuso_horario")
	private String fuso_horario;
	@RParam(rParamName = "p_confirmacao_automatica")
	private String confirmacao_automatica;
	@RParam(rParamName = "p_plaintext_1")
	private String plaintext_1;
	@RParam(rParamName = "p_horario_de_atendimento")
	private String horario_de_atendimento;
	@RParam(rParamName = "p_inicio")
	private String inicio;
	@RParam(rParamName = "p_fim")
	private String fim;
	@RParam(rParamName = "p_id")
	private String p_id;
	@RParam(rParamName = "p_id_organica")
	private String p_id_organica;
	@RParam(rParamName = "p_id_entidade")
	private String p_id_entidade;
	@RParam(rParamName = "p_id_aplicacao")
	private String p_id_aplicacao;
	@RParam(rParamName = "p_id_localizacao")
	private String p_id_localizacao;
	@RParam(rParamName = "p_cordenadas")
	private String p_cordenadas;

	private ArrayList<Table_1> table_1 = new ArrayList<>();
	public void setTable_1(ArrayList<Table_1> table_1){
		this.table_1 = table_1;
	}
	public ArrayList<Table_1> gettable_1(){
		return this.table_1;
	}

	private ArrayList<Table_2> table_2 = new ArrayList<>();
	public void setTable_2(ArrayList<Table_2> table_2){
		this.table_2 = table_2;
	}
	public ArrayList<Table_2> gettable_2(){
		return this.table_2;
	}
	
	public void setPage_title_text(String page_title_text){
		this.page_title_text = page_title_text;
	}
	public String getPage_title_text(){
		return this.page_title_text;
	}
	
	public void setEntidade(String entidade){
		this.entidade = entidade;
	}
	public String getEntidade(){
		return this.entidade;
	}
	
	public void setPonto(String ponto){
		this.ponto = ponto;
	}
	public String getPonto(){
		return this.ponto;
	}
	
	public void setN_de_servicos(String n_de_servicos){
		this.n_de_servicos = n_de_servicos;
	}
	public String getN_de_servicos(){
		return this.n_de_servicos;
	}
	
	public void setLocalizacao(String localizacao){
		this.localizacao = localizacao;
	}
	public String getLocalizacao(){
		return this.localizacao;
	}
	
	public void setFuso_horario(String fuso_horario){
		this.fuso_horario = fuso_horario;
	}
	public String getFuso_horario(){
		return this.fuso_horario;
	}
	
	public void setConfirmacao_automatica(String confirmacao_automatica){
		this.confirmacao_automatica = confirmacao_automatica;
	}
	public String getConfirmacao_automatica(){
		return this.confirmacao_automatica;
	}
	
	public void setPlaintext_1(String plaintext_1){
		this.plaintext_1 = plaintext_1;
	}
	public String getPlaintext_1(){
		return this.plaintext_1;
	}
	
	public void setHorario_de_atendimento(String horario_de_atendimento){
		this.horario_de_atendimento = horario_de_atendimento;
	}
	public String getHorario_de_atendimento(){
		return this.horario_de_atendimento;
	}
	
	public void setInicio(String inicio){
		this.inicio = inicio;
	}
	public String getInicio(){
		return this.inicio;
	}
	
	public void setFim(String fim){
		this.fim = fim;
	}
	public String getFim(){
		return this.fim;
	}
	
	public void setP_id(String p_id){
		this.p_id = p_id;
	}
	public String getP_id(){
		return this.p_id;
	}
	
	public void setP_id_organica(String p_id_organica){
		this.p_id_organica = p_id_organica;
	}
	public String getP_id_organica(){
		return this.p_id_organica;
	}
	
	public void setP_id_entidade(String p_id_entidade){
		this.p_id_entidade = p_id_entidade;
	}
	public String getP_id_entidade(){
		return this.p_id_entidade;
	}
	
	public void setP_id_aplicacao(String p_id_aplicacao){
		this.p_id_aplicacao = p_id_aplicacao;
	}
	public String getP_id_aplicacao(){
		return this.p_id_aplicacao;
	}
	
	public void setP_id_localizacao(String p_id_localizacao){
		this.p_id_localizacao = p_id_localizacao;
	}
	public String getP_id_localizacao(){
		return this.p_id_localizacao;
	}
	
	public void setP_cordenadas(String p_cordenadas){
		this.p_cordenadas = p_cordenadas;
	}
	public String getP_cordenadas(){
		return this.p_cordenadas;
	}


	public static class Table_1{
		private String organica;
		private String ponto_de_atendimento;
		private String p_id_organica_lst;
		private String p_id_entidade_lst;
		private String p_id_aplicacao_lst;
		private String p_id_balcao;
		public void setOrganica(String organica){
			this.organica = organica;
		}
		public String getOrganica(){
			return this.organica;
		}

		public void setPonto_de_atendimento(String ponto_de_atendimento){
			this.ponto_de_atendimento = ponto_de_atendimento;
		}
		public String getPonto_de_atendimento(){
			return this.ponto_de_atendimento;
		}

		public void setP_id_organica_lst(String p_id_organica_lst){
			this.p_id_organica_lst = p_id_organica_lst;
		}
		public String getP_id_organica_lst(){
			return this.p_id_organica_lst;
		}

		public void setP_id_entidade_lst(String p_id_entidade_lst){
			this.p_id_entidade_lst = p_id_entidade_lst;
		}
		public String getP_id_entidade_lst(){
			return this.p_id_entidade_lst;
		}

		public void setP_id_aplicacao_lst(String p_id_aplicacao_lst){
			this.p_id_aplicacao_lst = p_id_aplicacao_lst;
		}
		public String getP_id_aplicacao_lst(){
			return this.p_id_aplicacao_lst;
		}

		public void setP_id_balcao(String p_id_balcao){
			this.p_id_balcao = p_id_balcao;
		}
		public String getP_id_balcao(){
			return this.p_id_balcao;
		}

	}
	public static class Table_2{
		private String servicos;
		private String p_id_serv_balcao;
		private String p_id_servico;
		public void setServicos(String servicos){
			this.servicos = servicos;
		}
		public String getServicos(){
			return this.servicos;
		}

		public void setP_id_serv_balcao(String p_id_serv_balcao){
			this.p_id_serv_balcao = p_id_serv_balcao;
		}
		public String getP_id_serv_balcao(){
			return this.p_id_serv_balcao;
		}

		public void setP_id_servico(String p_id_servico){
			this.p_id_servico = p_id_servico;
		}
		public String getP_id_servico(){
			return this.p_id_servico;
		}

	}
}
/*-------------------------*/