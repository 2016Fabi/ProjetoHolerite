package holerite;

import java.util.List;

public class Funcionario {
	private String nome;
	private String endereco;
	private String numero;
	private String serie;
	private String cargo;
	private String naturezadafuncao;
	private double valorsalario;
    private List<Holerite> holerites;
    
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNaturezadafuncao() {
		return naturezadafuncao;
	}

	public void setNaturezadafuncao(String naturezadafuncao) {
		this.naturezadafuncao = naturezadafuncao;
	}

	public double getValorsalario() {
		return valorsalario;
	}

	public void setValorsalario(double valorsalario) {
		this.valorsalario = valorsalario;
	}

	public List<Holerite> getHolerites() {
		return holerites;
	}

	public void setHolerites(List<Holerite> holerites) {
		this.holerites = holerites;
	}

	
	
	

}
