
public class Veiculo {
	
	private String ano;
	private String modelo;
	private String fabricante;
	private String potencia;
	private double consumo;
	private double pre�o;
	

	//Metodo Construtor
		public Veiculo (String nome, String modelo, String  fabricante, double potencia, double consumo,
				 double pre�o){
	 
		}
	//	Sobreescrevendo o metodo toString
		public String toString(){
			return "Ano:  " + this.ano + " / Modelo: " + this.modelo +  "/ Fabricante: " + this.fabricante + " / Potencia: " + this.potencia + "/ Consumo:" + this.consumo + "Pre�o:" + getPre�o() ;
			
					
		}
		public Veiculo(String ano, String modelo, String fabricante, String potencia, double consumo, double pre�o) {
			super();
			this.ano = ano;
			this.modelo = modelo;
			this.fabricante = fabricante;
			this.potencia = potencia;
			this.consumo = consumo;
			this.pre�o = pre�o;
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
		public String getPre�o() {
			return "R$" + pre�o;
		}
		public void setPre�o(double pre�o) {
			this.pre�o = pre�o;
		}
	

}
