import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
			
		Calendar datadeNascimento = Calendar.getInstance();
		datadeNascimento.set (Calendar.YEAR,2017);
		datadeNascimento.set(Calendar.MONTH, Calendar.AUGUST);
		datadeNascimento.set(Calendar.DAY_OF_MONTH, 18);
		
 Aluno a1=new Aluno("Silva","21606013",datadeNascimento,"Masculino");
 Disciplina b1= new Disciplina ("LTP1","Ci�ncia da Computa��o", 10);
 Professor c1 = new Professor ("Marcos","333","Mestre","123.456.789-10");
 Turma d1 = new Turma(03, "Marcos","Disciplina");

 
 
           //Aluno
	System.out.println(a1.imprimirAluno());
 
	// /disciplina
	
	System.out.println("Nome:  "  + b1.getNome());
	System.out.println("Curso:  "   + b1.getCurso());
	System.out.println("Carga hor�ria:  "  + b1.getCargaHoraria());
	
	        // Professor
	
	System.out.println("Nome:  "   + c1.getNome());
	System.out.println("Matr�cula:   "   + c1.getMatricula());
	System.out.println("Titula��o: "  + c1.getTitula��o());
	System.out.println("CPF:  "+ c1.getCPF());
	
	          // Turma 
	System.out.println("C�digo:  "  + d1.codigo);
	System.out.println("Professor:  " + d1.professor);
	System.out.println("Discplina:  "  + d1.getDisciplina());
	
		
		
		
	}
	

}
