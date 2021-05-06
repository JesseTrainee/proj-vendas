package entities;

import java.time.LocalDate;

import interfaces.FinalizarVendas;

public class Venda implements FinalizarVendas{
	private Produto produto;
	private LocalDate dataCompra;
	private int quantidade;
	private static double totalVenda;
	public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
		totalVenda++;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public static double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public void calcularVenda() {
		System.out.println(quantidade * produto.getValor());
		
	}
	private void mostrarVenda() {
		
	}

	@Override
	public String toString() {
		return "Venda [produto=" + produto + ", dataCompra=" + dataCompra + ", quantidade=" + quantidade + "]";
	}
	
	
}
