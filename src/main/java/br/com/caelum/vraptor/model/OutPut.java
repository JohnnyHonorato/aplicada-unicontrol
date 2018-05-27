package br.com.caelum.vraptor.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OutPut {
	
	private long id;
	private int amount;
	private Date data;
	private long id_product;
	private String setorRequisitante;
	private String requisitante;
	private String finalidade;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public long getId_product() {
		return id_product;
	}

	public void setId_product(long id_product) {
		this.id_product = id_product;
	}

	public String getSetorRequisitante() {
		return setorRequisitante;
	}

	public void setSetorRequisitante(String setorRequisitante) {
		this.setorRequisitante = setorRequisitante;
	}

	public String getRequisitante() {
		return requisitante;
	}

	public void setRequisitante(String requisitante) {
		this.requisitante = requisitante;
	}

	public String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}

}
