
public class Disciplina {
              // Atributos da disciplina
	private String nome;
	private String curso;
	private int cargaHoraria;
	
	            //metodo Construtor
	public Disciplina(String nome, String curso, int cargaHoraria) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.cargaHoraria = cargaHoraria;
	}

	             // ToString
	public String toString() {
		return "Disciplina [nome=" + nome +  ", curso=" + curso + ", cargaHoraria="
				+ cargaHoraria + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
