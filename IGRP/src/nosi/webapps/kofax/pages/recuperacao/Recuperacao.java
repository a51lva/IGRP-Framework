/*---------------------- Create Model ----------------------*/
package nosi.webapps.kofax.pages.recuperacao;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import java.util.ArrayList;

public class Recuperacao extends Model{		
	@RParam(rParamName = "p_identificacao")
	private String identificacao;
	@RParam(rParamName = "p_imagem")
	private String imagem;
	@RParam(rParamName = "p_tipo_objeto")
	private int tipo_objeto;
	@RParam(rParamName = "p_n_do_negocio")
	private int n_do_negocio;
	@RParam(rParamName = "p_n_de_processo")
	private int n_de_processo;
	@RParam(rParamName = "p_data_de_registo")
	private String data_de_registo;
	@RParam(rParamName = "p_nome")
	private String nome;
	@RParam(rParamName = "p_tipo_documento")
	private String tipo_documento;
	@RParam(rParamName = "p_n_de_documento")
	private int n_de_documento;
	@RParam(rParamName = "p_localizacao_fisica")
	private String localizacao_fisica;
	@RParam(rParamName = "p_estante")
	private String estante;
	@RParam(rParamName = "p_pasta")
	private String pasta;
	@RParam(rParamName = "p_livro")
	private String livro;
	@RParam(rParamName = "p_folha")
	private String folha;
	@RParam(rParamName = "p_id")
	private int p_id;
	@RParam(rParamName = "p_informacoes_adicionais")
	private String informacoes_adicionais;
	@RParam(rParamName = "p_campo_fk")
	private String[] p_campo_fk;
	@RParam(rParamName = "p_campo_fk_desc")
	private String[] p_campo_fk_desc;
	@RParam(rParamName = "p_valor_fk_desc")
	private String[] p_valor_fk_desc;
	@RParam(rParamName = "p_valor_fk")
	private String[] p_valor_fk;

	private ArrayList<Separatorlist_1> separatorlist_1 = new ArrayList<>();
	public void setSeparatorlist_1(ArrayList<Separatorlist_1> separatorlist_1){
		this.separatorlist_1 = separatorlist_1;
	}
	public ArrayList<Separatorlist_1> getseparatorlist_1(){
		return this.separatorlist_1;
	}
	
	public void setIdentificacao(String identificacao){
		this.identificacao = identificacao;
	}
	public String getIdentificacao(){
		return this.identificacao;
	}
	
	public void setImagem(String imagem){
		this.imagem = imagem;
	}
	public String getImagem(){
		return this.imagem;
	}
	
	public void setData_de_registo(String data_de_registo){
		this.data_de_registo = data_de_registo;
	}
	public String getData_de_registo(){
		return this.data_de_registo;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setTipo_documento(String tipo_documento){
		this.tipo_documento = tipo_documento;
	}
	public String getTipo_documento(){
		return this.tipo_documento;
	}
	
	public void setLocalizacao_fisica(String localizacao_fisica){
		this.localizacao_fisica = localizacao_fisica;
	}
	public String getLocalizacao_fisica(){
		return this.localizacao_fisica;
	}
	
	public void setEstante(String estante){
		this.estante = estante;
	}
	public String getEstante(){
		return this.estante;
	}
	
	public void setPasta(String pasta){
		this.pasta = pasta;
	}
	public String getPasta(){
		return this.pasta;
	}
	
	public void setLivro(String livro){
		this.livro = livro;
	}
	public String getLivro(){
		return this.livro;
	}
	
	public void setFolha(String folha){
		this.folha = folha;
	}
	public String getFolha(){
		return this.folha;
	}
	
	public void setInformacoes_adicionais(String informacoes_adicionais){
		this.informacoes_adicionais = informacoes_adicionais;
	}
	public String getInformacoes_adicionais(){
		return this.informacoes_adicionais;
	}

	public int getTipo_objeto() {
		return tipo_objeto;
	}
	public void setTipo_objeto(int tipo_objeto) {
		this.tipo_objeto = tipo_objeto;
	}
	public int getN_do_negocio() {
		return n_do_negocio;
	}
	public void setN_do_negocio(int n_do_negocio) {
		this.n_do_negocio = n_do_negocio;
	}
	public int getN_de_processo() {
		return n_de_processo;
	}
	public void setN_de_processo(int n_de_processo) {
		this.n_de_processo = n_de_processo;
	}
	public int getN_de_documento() {
		return n_de_documento;
	}
	public void setN_de_documento(int n_de_documento) {
		this.n_de_documento = n_de_documento;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String[] getP_campo_fk() {
		return p_campo_fk;
	}
	public void setP_campo_fk(String[] p_campo_fk) {
		this.p_campo_fk = p_campo_fk;
	}
	public String[] getP_campo_fk_desc() {
		return p_campo_fk_desc;
	}
	public void setP_campo_fk_desc(String[] p_campo_fk_desc) {
		this.p_campo_fk_desc = p_campo_fk_desc;
	}
	public String[] getP_valor_fk_desc() {
		return p_valor_fk_desc;
	}
	public void setP_valor_fk_desc(String[] p_valor_fk_desc) {
		this.p_valor_fk_desc = p_valor_fk_desc;
	}
	public String[] getP_valor_fk() {
		return p_valor_fk;
	}
	public void setP_valor_fk(String[] p_valor_fk) {
		this.p_valor_fk = p_valor_fk;
	}

	public static class Separatorlist_1{
		private Pair informacoes_adicionais;
		private Pair campo;
		private Pair valor;
		public static class Pair{
		
			private String key;
			private String value;
			
			public Pair() {}
			
			public Pair(String key, String value) {
				this.key = key;
				this.value = value;
			}
			
			public String getKey() {
				return key;
			}
			public void setKey(String key) {
				this.key = key;
			}
			public String getValue() {
				return value;
			}
			public void setValue(String value) {
				this.value = value;
			}
		}
 		
		public void setInformacoes_adicionais(Pair informacoes_adicionais){
			this.informacoes_adicionais = informacoes_adicionais;
		}
		public Pair getInformacoes_adicionais(){
			return this.informacoes_adicionais;
		}

		public void setCampo(Pair campo){
			this.campo = campo;
		}
		public Pair getCampo(){
			return this.campo;
		}

		public void setValor(Pair valor){
			this.valor = valor;
		}
		public Pair getValor(){
			return this.valor;
		}

	}
}
/*-------------------------*/