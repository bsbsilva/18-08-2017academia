
public class Vendedor {
	//Atributos 
	
	private String nome;
	private String matricula;
	private double salarioBase;
	
	
	
	//Metodo Construtor
		public Vendedor (String nome, String CPF, int idade){
			this.nome = nome;
			this.matricula = CPF;
			this.salarioBase = idade;
		}
		//Sobreescrevendo o metoso toString
		public String toString(){
			return "Nome:  " + this.nome + " / matricula: " + this.matricula +  "/ salario: " + this.salarioBase;
		}
		
	public String getNome (){
		return nome;		
	}
		public String getMatricula (){
		return matricula;		
	}
		public double getSalarioBase(){
			return salarioBase;
	}
		public void setNome (String nome){
			this.nome = nome;
		}
		public void setMatricula (String matricula){
			this.matricula = matricula;
		}
		public void setSalario (double salario){
			this.salarioBase = salario;
		}
		
	
		//CALCULAR SALARIO DO MES 

	       public String calcularSalariodoMes (double percentual, int qtdeVendas){
	    	  
	    	   
	    	   //o salario do mes é calculado usando o salario base
	    	   // mais um percentual do salario mulptiplicado pela qauntidade de vendas 
	    	   
	    	   double salarioPercentual = salarioBase * (percentual/100);
	    	   double salarioVariavel = salarioPercentual * qtdeVendas;
	    	   double salariodoMes = salarioBase * salarioVariavel;
	    	   return "R$" + salariodoMes;
	       }

	
}

