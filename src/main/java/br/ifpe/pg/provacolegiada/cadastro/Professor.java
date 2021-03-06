package br.ifpe.pg.provacolegiada.cadastro;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Professor {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String areasDePesquisa;
	
	public Professor() {
		super();
	}
	public Professor(Integer id, String nome, String email,String areasDePesquisa) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.areasDePesquisa = areasDePesquisa;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAreasDePesquisa() {
		return areasDePesquisa;
	}
	public void setAreasDePesquisa(String areasDePesquisa) {
		this.areasDePesquisa = areasDePesquisa;
	}
	
	
	
}
