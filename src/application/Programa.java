package application;

import java.time.LocalDate;

import entities.Produto;
import entities.Venda;
import enums.Categoria;

public class Programa {

	public static void main(String[] args) {
	Produto prod1 = new Produto(111,"TV", 3000, Categoria.ELETRONICO);
	Produto prod2 = new Produto(123,"Pneu", 800, Categoria.AUTOMOTIVO);
	Produto prod3 = new Produto(155, "Celular", 2500, Categoria.ELETRONICO);
	
	Venda venda = new Venda(prod1,LocalDate.now(),5);
	venda.calcularVenda();

	}

}
