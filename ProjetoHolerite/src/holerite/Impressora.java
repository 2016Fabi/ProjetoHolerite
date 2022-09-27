package holerite;

public class Impressora {
	
	public static String formatar(double numero) {
		String valor = String.format("%.2f", numero);
		return valor;
	}
	
	
    public static void imprimir(Holerite holerite) {
    	String saida = "";
    	//impressão do funcionario
    	saida += "**************************************";
    	saida += "\nFuncionario: " + holerite.getFuncionario().getNome();
    	saida += "\nEndereco: " + holerite.getFuncionario().getEndereco();
    	saida += "\nNumero da CTPS: " + holerite.getFuncionario().getNumero();
    	saida += "\nSerie da CTPS: " + holerite.getFuncionario().getSerie();
    	saida += "\nCargo: " + holerite.getFuncionario().getCargo();
    	saida += "\nSalario Base: R$ " + holerite.getFuncionario().getValorsalario();
    	
    	//impressão dos creditos
    	saida += "\n************************************";
    	saida += "\nSalario: " + holerite.getFuncionario().getValorsalario();
    	saida += "\nHoras Extras: " + formatar(holerite.getValorhoraextra()) 
    			  + " -> Ref a " + formatar(holerite.getQtddhorasextra()) + "hora(s)";
    	
    	//impressão dos descontos
    	saida += "\n************************************";
    	double inss = holerite.getParcinss() * holerite.getFuncionario().getValorsalario() / 100;
    	double fgts = holerite.getParcfgts() * holerite.getFuncionario().getValorsalario() / 100; 
    	double ir = holerite.getDeducaopadraoir() + (holerite.getParcir() *  
    			holerite.getFuncionario().getValorsalario() / 100);
    	double valeTransporte = holerite.getValetransporte();
    	saida += "\nDescontos";
    	saida += "\nINSS: " + formatar(inss);
    	saida += "\nFGTS: " + formatar(fgts);
    	saida += "\nI.R.: " + formatar(ir);
    	saida += "\nVale Transporte: " + formatar(valeTransporte);
    	
    	//Total  
    	saida += "\n************************************";
    	saida += "\n Salario Bruto:" + holerite.getFuncionario().getValorsalario() ;
    	saida += "\n Acrescimos:" + formatar(holerite.getValorhoraextra()) ;
    	saida += "\n Descontos:" + formatar((inss + fgts + ir + valeTransporte)) ;
    	saida += "\n Salario Liquido:" + formatar((holerite.getFuncionario().getValorsalario() 
    			+ holerite.getValorhoraextra()
    			- (inss + fgts + ir + valeTransporte)));
    	saida += "\n************************************";
    	
    	System.out.println(saida);
    }
}
