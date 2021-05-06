package enums;

public enum Categoria {
	ELETRONICO("Eletr�nico"),
	ALIMENTO("Alimento"),
	AUTOMOTIVO("Automotivo"),
	ROUPAS("Roupas"),
	FARMACEUTICO("Farmaceutico");
	
	private String descricao;
	
	Categoria(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
}
