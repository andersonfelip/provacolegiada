package br.ifpe.pg.provacolegiada.provacolegiada.constants;

public enum SituacaoTurmaEnum {
	A("Ativo"),I("Inativo");
	
	public String descricao;
	
	SituacaoTurmaEnum(String descricao){
		this.descricao = descricao;
	}
}
