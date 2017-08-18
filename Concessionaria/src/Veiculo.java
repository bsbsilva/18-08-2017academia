
public class Veiculo {
	
	private String ano;
	private String modelo;
	private String fabricante;
	private String potencia;
	private double consumo;
	private double preço;
	

	//Metodo Construtor
		public Veiculo (String nome, String modelo, String  fabricante, double potencia, double consumo,
				 double preço){
	 
		}
	//	Sobreescrevendo o metodo toString
		public String toString(){
			return "Ano:  " + this.ano + " / Modelo: " + this.modelo +  "/ Fabricante: " + this.fabricante + " / Potencia: " + this.potencia + "/ Consumo:" + this.consumo + "Preço:" + getPreço() ;
			
					
		}
		public Veiculo(String ano, String modelo, String fabricante, String potencia, double consumo, double preço) {
			super();
			this.ano = ano;
			this.modelo = modelo;
			this.fabricante = fabricante;
			this.potencia = potencia;
			this.consumo = consumo;
			this.preço = preço;
		}
		public String getAno() {
			return ano;
		}
		public void setAno(String ano) {
			this.ano = ano;
		}
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		public String getFabricante() {
			return fabricante;
		}
		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}
		public String getPotencia() {
			return potencia;
		}
		public void setPotencia(String potencia) {
			this.potencia = potencia;
		}
		public double getConsumo() {
			return consumo;
		}
		public void setConsumo(double consumo) {
			this.consumo = consumo;
		}
		public String getPreço() {
			return "R$" + preço;
		}
		public void setPreço(double preço) {
			this.preço = preço;
		}
	

}
