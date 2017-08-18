import java.util.Calendar;

public class Principal {

	            public static void main(String[] args) {
	
		        // Criar objeto da classe comprador
		        Comprador c1 = new Comprador ("Daniel","855.501.402-68",99);
		        System.out.println(c1);
		        
		       
		
		       //Preencher atributos de c1
		       /* c1.setNome("Daniel");
		        c1.setCPF("855.501.402-68");
		        c1.setIdade(99);*/
		
		        //recuperar os atributos de c1
		  
		  
		        System.out.println("Nome: " + c1.getNome());
		        System.out.println("CPF: " + c1.getCPF());
		        System.out.println("Idade: " + c1.getIdade()+ "\n");
		
		        //Comprador novo
		        Comprador c2 = new Comprador("Deu o calote", "789.456.123.-00", 99);
		        System.out.println("COMPRADOR 2");
		
		        /*preencher  atributos de c2
		        c2.setNome("Valentina");
		        c2.setCPF("111.111.111.11");
		        c2.setIdade(04);*/
		
		        //recuperar atributos de c2
		        System.out.println("Nome: "  + c2.getNome());
		        System.out.println("CPF: " + c2.getCPF());
		        System.out.println("Idade: " + c2.getIdade()+ "\n");
		 
		
		        // comprador 3		
		        Comprador c3 = new Comprador("João Grilo", "123.456.789.-10",3001);
		       //Preencher atributos de c3
				/*c3.setNome("João Grilo");
				c3.setCPF("123.456.789-10");
				c3.setIdade(3001);*/
				
				//recuperar os atributos de c3
				System.out.println("COMPRADOR 3:  ");
				System.out.println("Nome: " + c3.getNome());
				System.out.println("CPF: " + c3.getCPF());
				System.out.println("Idade: " + c3.getIdade()+ "\n");
				
				// Vendedor 
				//Vendedor a1 = new Vendedor ();
				//preencher atributos de a1
				//a1.setNome("pedro");
				//a1.setMatricula("54321");
				//a1.setSalario(80000.00);
				
				 //Comprador novo
		        Vendedor a1 = new Vendedor(" VENDEDOR DE LEITE", "MATRICULA 21606013", 600 );
		        System.out.println(a1);
				
				//recuperar os atributos de a1
				System.out.println("VENDEDOR:  ");
				System.out.println("Nome: " + a1.getNome());
				System.out.println("Matricula: " + a1.getMatricula());
				System.out.println("Salario: " + a1.getSalarioBase()+ "\n");
				
				System.out.println(a1.calcularSalariodoMes(60, 8));
				
				
				//VEICULOS
				
				
				
			Veiculo v1 = new Veiculo ("2017","uno", "Fiat", "2.0",  100.00,   300.00 );
					System.out.println(v1);
					
					System.out.println("VEICULO");
					
				System.out.println("Ano: " + v1.getAno());
				System.out.println("Modelo: " + v1.getModelo());
				System.out.println("Fabricante: " + v1.getFabricante());
				System.out.println("Potencia: "  + v1.getPotencia());
				System.out.println("Conumo:  "  + v1.getConsumo());
				System.out.println("Preço: "  + v1.getPreço());
				
				
				
				
				//Vendas 
				Calendar data = Calendar.getInstance();
				data.set (Calendar.YEAR,2017);
				data.set(Calendar.MONTH, Calendar.AUGUST);
				data.set(Calendar.DAY_OF_MONTH, 11);
				
				
				
				
				
				
				
			Venda vendido1 = new Venda (c1, a1, v1, 100.00, "A vista", data);
			
			System.out.println(vendido1.getCompador().getNome());
			System.out.println(vendido1.getVendedor().getNome());
			System.out.println(vendido1.getVeiculo().getModelo());
			
				
				System.out.println(vendido1.gerarNotaFiscal());
				
		
		
		
		
		
		
		
		
		

	}

}
