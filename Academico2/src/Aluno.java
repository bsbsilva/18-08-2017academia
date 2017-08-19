import java.util.Calendar;

public class Aluno {
	private String nome;
	private String RA;
	private Calendar datadeNascimento;
	private String sexo;
	
	
	public Aluno(String nome, String RA, Calendar datadeNascimento, String sexo) {
		super();
		this.nome = nome;
		this.RA = RA;
		this.datadeNascimento = datadeNascimento;
		this.sexo = sexo;
	}
	
	
	
	
	  //----------------------------------------------------------------------------
	
	
	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getRA() {
		return RA;
	}




	public void setRA(String RA, String RA1) {
		this.RA = RA1;
	}




	public Calendar getDatadeNascimento() {
		return datadeNascimento;
	}




	public void setDatadeNascimento(Calendar datadeNascimento) {
		this.datadeNascimento = datadeNascimento;
	}




	public String getSexo() {
		return sexo;
	}




	public void setSexo(String sexo) {
		this.sexo = sexo;
	}




	public String imprimirAluno (){
		return "Dados do Aluno\n" +
	           "Nome:   " + getNome()  +  "\n"  +
			   "RA:     " + getRA()     +  "\n"  +
	           "Idade:  " + getDatadeNascimentoComoString()  +  "\n"  +
			   "SExo:   " + getSexo();
		
			   
}




	private String getDatadeNascimentoComoString() {
		return this.datadeNascimento.get(Calendar.DAY_OF_MONTH)+ "/" + 
		           this.datadeNascimento.get(Calendar.MONTH)+ "/" +
					this.datadeNascimento.get(Calendar.YEAR);
	}
	
	
	
}
