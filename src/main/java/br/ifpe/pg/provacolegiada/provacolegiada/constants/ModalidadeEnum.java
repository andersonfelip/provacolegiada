package br.ifpe.pg.provacolegiada.provacolegiada.constants;

public enum ModalidadeEnum {
	EAD("E"),Presencial("P");
	
	public String descricao;
	
	ModalidadeEnum(String descricao){
		this.descricao = descricao;
	}
}
