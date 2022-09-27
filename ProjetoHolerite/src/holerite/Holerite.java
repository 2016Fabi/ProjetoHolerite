package holerite;

public class Holerite {

	// descontos
	private double parcinss;
	private double parcfgts;
	private double parcir = 0.0;
	private double deducaopadraoir = 0.0;
	private double valetransporte = 0.0;

	// acrescimos
	private double valorhoraextra;
	private double qtddhorasextra;
	private Funcionario funcionario = new Funcionario();

	public double getParcinss() {
		if (funcionario.getValorsalario() <= 1045) {
			parcinss = 7.5;
		} else if (funcionario.getValorsalario() <= 2089.60) {
			parcinss = 9d;
		} else if (funcionario.getValorsalario() <= 3134.41) {
			parcinss = 12d;
		} else {
			parcinss = 14d;
		}
		return parcinss;
	}

	public void setParcinss(double parcinss) {
		this.parcinss = parcinss;
	}

	public double getParcfgts() {
		if (funcionario.getValorsalario() <= 1045) {
			parcfgts = 7.5;
		} else if (funcionario.getValorsalario() <= 2089.60) {
			parcfgts = 9d;
		} else if (funcionario.getValorsalario() <= 3134.41) {
			parcfgts = 12d;
		} else {
			parcfgts = 14d;
		}
		return parcfgts;
	}

	public void setParcfgts(double parcfgts) {
		this.parcfgts = parcfgts;
	}

	public double getParcir() {
		if (funcionario.getValorsalario() >= 1903.99 && funcionario.getValorsalario() <= 2826.65) {
			parcir = 7.5;
		} else if (funcionario.getValorsalario() > 2862.65 && funcionario.getValorsalario() <= 3751.05) {
			parcir = 15d;
		} else if (funcionario.getValorsalario() > 3751.05 && funcionario.getValorsalario() <= 4664.68) {
			parcir = 22.5;
		} else if (funcionario.getValorsalario() > 4664.68) {
			parcir = 27.5;
		}
		return parcir;
	}

	public void setParcir(double parcir) {
		this.parcir = parcir;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public double getValorhoraextra() {
		valorhoraextra = (funcionario.getValorsalario() / 30) / 8 * 1.5 * qtddhorasextra;
		return valorhoraextra;
	}

	public void setValorhoraextra(double valorhoraextra) {
		this.valorhoraextra = valorhoraextra;
	}

	public double getValetransporte() {
		return valetransporte * 6/100;
	}

	public void setValetransporte(double valetransporte) {
		this.valetransporte = valetransporte;
	}

	public double getDeducaopadraoir() {
		if (funcionario.getValorsalario() >= 1903.99 && funcionario.getValorsalario() <= 2826.65) {
			deducaopadraoir = 142.80;
		} else if (funcionario.getValorsalario() > 2862.65 && funcionario.getValorsalario() <= 3751.05) {
			deducaopadraoir = 354.80;
		} else if (funcionario.getValorsalario() > 3751.05 && funcionario.getValorsalario() <= 4664.68) {
			deducaopadraoir = 636.13;
		} else if (funcionario.getValorsalario() > 4664.68) {
			deducaopadraoir = 869.36;
		}
		return deducaopadraoir;
	}

	public void setDeducaopadraoir(double deducaopadraoir) {
		this.deducaopadraoir = deducaopadraoir;
	}

	public double getQtddhorasextra() {
		return qtddhorasextra;
	}

	public void setQtddhorasextra(double qtddhorasextra) {
		this.qtddhorasextra = qtddhorasextra;
	}
	
	

}
