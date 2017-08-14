package nosi.webapps.kofax.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import nosi.base.ActiveRecord.BaseActiveRecord;
import nosi.webapps.igrp.dao.Organization;

/**
 * @author: Emanuel Pereira
 * 14 Aug 2017
 */
@Entity
@Table(name="tbl_objeto")
public class Objeto extends BaseActiveRecord<Objeto> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "id_organica",foreignKey = @ForeignKey(name="ORGANIZATION_OBJETO_ID_ORGANICA"),nullable=false)
	private Organization organica;
	@Column(nullable=false)
	private String objeto;
	@Column(nullable=false)
	private String link_pagina;
	@Column(nullable=false)
	private Integer default_page;
	@Column(nullable=false)
	private String formato_output;
	@Column(nullable=false)
	private String guardar_em;
	@Column(nullable=false)
	private String estado;
	@Column(nullable = false)
	private int automatico;
	
	public Objeto(){}

	public Objeto(Organization organica, String objeto, String link_pagina, Integer default_page, String formato_output,
			String guardar_em, String estado, int automatico) {
		super();
		this.organica = organica;
		this.objeto = objeto;
		this.link_pagina = link_pagina;
		this.default_page = default_page;
		this.formato_output = formato_output;
		this.guardar_em = guardar_em;
		this.estado = estado;
		this.automatico = automatico;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Organization getOrganica() {
		return organica;
	}

	public void setOrganica(Organization organica) {
		this.organica = organica;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getLink_pagina() {
		return link_pagina;
	}

	public void setLink_pagina(String link_pagina) {
		this.link_pagina = link_pagina;
	}

	public Integer getDefault_page() {
		return default_page;
	}

	public void setDefault_page(Integer default_page) {
		this.default_page = default_page;
	}

	public String getFormato_output() {
		return formato_output;
	}

	public void setFormato_output(String formato_output) {
		this.formato_output = formato_output;
	}

	public String getGuardar_em() {
		return guardar_em;
	}

	public void setGuardar_em(String guardar_em) {
		this.guardar_em = guardar_em;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getAutomatico() {
		return automatico;
	}

	public void setAutomatico(int automatico) {
		this.automatico = automatico;
	}
	
	
}
