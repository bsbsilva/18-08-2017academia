import java.util.Calendar;

public class Venda {
//Atributos
private Comprador compador;
private Vendedor vendedor;
private Veiculo veiculo;
private double preço;
private String formadePagamento;
private Calendar data;


// metodo contrutor
public Venda(Comprador compador, Vendedor vendedor, Veiculo veiculo, double preço, String formadePagamento,
		Calendar data) {
	super();
	this.compador = compador;
	this.vendedor = vendedor;
	this.veiculo = veiculo;
	this.preço = preço;
	this.formadePagamento = formadePagamento;
	this.data = data;
}

    // medoto get e set 
public Comprador getCompador() {
	return compador;
}
public void setCompador(Comprador compador) {
	this.compador = compador;
}
public Vendedor getVendedor() {
	return vendedor;
}
public void setVendedor(Vendedor vendedor) {
	this.vendedor = vendedor;
}
public Veiculo getVeiculo() {
	return veiculo;
}
public void setVeiculo(Veiculo veiculo) {
	this.veiculo = veiculo;
}
public double getPreço() {
	return preço;
}
public void setPreço(double preço) {
	this.preço = preço;
}
public String getFormadePagamento() {
	return formadePagamento;
}
public void setFormadePagamento(String formadePagamento) {
	this.formadePagamento = formadePagamento;
}
public Calendar getData() {
	return data;
}
public void setData(Calendar data) {
	this.data = data;
}



              //metodo para retornar data como string

public String getDataComoString(){
	return this.data.get(Calendar.DAY_OF_MONTH)+ "/" + 
           this.data.get(Calendar.MONTH)+ "/" +
			this.data.get(Calendar.YEAR);
	
	
	
}


              // Metodo para *imprimir* nota fiscal

public String gerarNotaFiscal(){
	return "----------- Nota Fiscal de venda -------------- \n" + "Data da venda" +
    " Data da venda:" + getDataComoString() + "\n" +
    "Valor da venda: R$" + this.Preço() + "\n"  +
    "\n" + 
    "---Dados do /veiculo ---\n" +
    "Modelo:  "  + this.veiculo.getModelo()+  "\n"  +
    "Fabricante :  " + this.veiculo.getFabricante() + "\n"  +
    "Ano: " + this.veiculo.getAno() + "\n"  +
    + "\n"  +
    "--------------- Dados do Comprador ----n" +
    "Nome: " + this.comprador.getNome() + "\n"  +
    "CPF:  " + this.comprador.getCPF () + "\n"  +
    + "\n"  +
    
    "---------------Dados do  Vendedor -----\n"  +
    "nome: "  + this.vendedor.getNome() + "\n"  +
    "Matricula: "  this.vendedor.getMatricula();
	
    
    
    
}

}
