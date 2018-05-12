package br.com.caelum.vraptor.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Input {
	private long id;
	private int amount;
	private Date data;
	private Product product;
	private String NumeroDePregao;
	private String notaDeEmpenho;

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

	@Temporal(TemporalType.DATE)
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@ManyToOne
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getNumeroDePregao() {
		return NumeroDePregao;
	}

	public void setNumeroDePregao(String numeroDePregao) {
		NumeroDePregao = numeroDePregao;
	}

	public String getNotaDeEmpenho() {
		return notaDeEmpenho;
	}

	public void setNotaDeEmpenho(String notaDeEmpenho) {
		this.notaDeEmpenho = notaDeEmpenho;
	}

}