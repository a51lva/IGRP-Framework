package nosi.webapps.agenda.dao;
/**
 * Marcel Iekiny
 * Aug 25, 2017
 */
public class ServBalcao {
	
	private Integer id;
	private int id_balcao;
	private int id_servico;
	private String estado;
	private int porton;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getId_balcao() {
		return id_balcao;
	}
	public void setId_balcao(int id_balcao) {
		this.id_balcao = id_balcao;
	}
	public int getId_servico() {
		return id_servico;
	}
	public void setId_servico(int id_servico) {
		this.id_servico = id_servico;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getPorton() {
		return porton;
	}
	public void setPorton(int porton) {
		this.porton = porton;
	}
}
