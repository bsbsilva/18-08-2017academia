
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		     //variavel Aluno
	Aluno a1  = new Aluno("Luiz","21606013",7, "Ciência da computação","Noturno", "Masculino");
	/*System.out.println("Nome: " +a1.getNome());
	System.out.println("RA:  " + a1.getRA() );
	System.out.println("Idade: " + a1.getIdade());
	System.out.println("Curso: " + a1.getCurso());
	System.out.println("Turno: "  + a1.getTurno());
	System.out.println("Sexo: " + a1.getSexo());*/
	
	System.out.println(a1.imprimirAluno());
	
	
	         //Variavel disciplina
	Disciplina d1 = new Disciplina("LTP1", "Ciencia da computação",75);
	
	System.out.println("Nome: " +d1.getNome());
	System.out.println("Curso:  " + d1.getCurso() );
	System.out.println("Carga Horária: " + d1.getCargaHoraria());
	
	
	System.out.println("Daniel quer commitar");
	
	System.out.println("Estamos perdidos");
	

	
	
		
		
		

	}

}
