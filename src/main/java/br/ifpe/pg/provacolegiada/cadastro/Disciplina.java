package br.ifpe.pg.provacolegiada.cadastro;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Disciplina {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	@ManyToMany
	private List<Disciplina> preRequisito;
	private String periodo;
	@ManyToOne
	private Curso curso;
	private int cargaHoraria;
	private String ementa;
	
	public Disciplina() {
		super();
	}
	public Disciplina(Integer id, String nome, Curso curso, int cargaHoraria, String ementa, List<Disciplina> preRequisito, String periodo) {
		super();
		this.id = id;
		this.nome = nome;
		this.curso = curso;
		this.cargaHoraria = cargaHoraria;
		this.ementa = ementa;
		this.preRequisito = preRequisito;
		this.periodo = periodo;
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
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public List<Disciplina> getPreRequisito() {
		return preRequisito;
	}
	public void setPreRequisito(List<Disciplina> preRequisito) {
		this.preRequisito = preRequisito;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
}
