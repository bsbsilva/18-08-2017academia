
public class Aluno {
	// Atributos de aluno
	private String nome;
	private String RA;
	private int idade;
	private String curso;
	private String turno;
	private String sexo;
	
	
	// metodo construtor
	
	public Aluno(String nome, String RA, int idade, String curso, String turno, String sexo) {
		super();
		this.nome = nome;
		this.RA = RA;
		this.idade = idade;
		this.curso = curso;
		this.turno = turno;
		this.sexo = sexo;
	}
		
		public String imprimirAluno (){
			return "Dados do Aluno\n" +
		           "Nome:   " + getNome()  +  "\n"  +
				   "RA:     " + getRA()     +  "\n"  +
		           "Idade:  " + getIdade()  +  "\n"  +
				   "Curso:  " + getCurso()  +  "\n"  +
		           "Turno:  " + getTurno()  +  "\n"  +
				   "SExo:   " + getSexo();
			
				   
	}
	// toString 
		
		
	/*public String toString() {
		return "Aluno [nome=" + nome + ", RA=" + RA + ", idade=" + idade + ", curso=" + curso + ", turno=" + turno
				+ ", sexo=" + sexo + "]";
	}*/
	

	
	
	// gets e set da classe aluno
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRA() {
		return RA;
	}
	public void setRA(String RA) {
		this.RA = RA;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	

}
