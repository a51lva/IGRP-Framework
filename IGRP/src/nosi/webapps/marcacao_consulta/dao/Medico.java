package nosi.webapps.marcacao_consulta.dao;

import java.io.Serializable;
import java.util.HashMap;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import nosi.base.ActiveRecord.BaseActiveRecord;
import nosi.webapps.kofax.dao.Campos;

@Entity
@Table(name="tbl_medico")
public class Medico extends BaseActiveRecord<Campos> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(nullable=false)
	private String nome;
	@Column(nullable=false)
	private String morada;
	@Column(nullable=false)
	private int num_consulta;
	
	public Medico() {
	}	
	
	public Medico( String nome, String morada, int num_consulta) {
		super();
		this.nome = nome;
		this.morada = morada;
		this.num_consulta = num_consulta;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMorada() {
		return morada;
	}


	public void setMorada(String morada) {
		this.morada = morada;
	}


	public int getNum_consulta() {
		return num_consulta;
	}


	public void setNum_consulta(int num_consulta) {
		this.num_consulta = num_consulta;
	}


	public HashMap<Integer,String> getListMedico(){
		HashMap<Integer,String> lista = new HashMap<>();
		lista.put(null, "--- Selecionar Medico ---");
		for(Object obj:this.findAll()){
			Medico m = (Medico) obj;
			lista.put(m.getId(), m.getNome());
		}
		return lista;
	}
}
