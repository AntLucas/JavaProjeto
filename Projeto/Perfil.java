package Projeto;

public class Perfil extends Usuario {
	private float tempoFilme;
	private float tempoSerie;

	public Perfil(String nome, String pais, String email, int idade, float tempoFilme, float tempoSerie) {
		super(nome, pais, email, idade);
		this.tempoFilme = tempoFilme;
		this.tempoSerie = tempoSerie;
	
	}

	public void imprimirPerfil() {
		System.out.println("-----------------------------------------------------------\n\t\t\tPERFIL");
		System.out.println("\nNome: " + getNome() + "\t\tPaís: " + getPais() + "\t\tE-mail: " + getEmail()
				+ "\t\tIdade: " + getIdade() + "\n\nEsse é o tempo que você se divertiu vendo filmes: " + tempoFilme + " minutos"
				+ "\t\tEsse foi o tempo que você passou assistindo suas Séries: " + tempoSerie + " minutos");
	}
	
	void imprimeArrayList () {
		System.out.println("\nFilmes Favoritos");
		for (String lista:filmesFav) {
			System.out.println(lista);
		}
		System.out.println("\nFilmes Assistidos");
		for (String lista:filmesConc) {
			System.out.println(lista);
		}
		System.out.println("\nSéries Favoritos");
		for (String lista:seriesFav) {
			System.out.println(lista);
		}
		System.out.println("\nSéries Assistidas");
		for (String lista:seriesConc) {
			System.out.println(lista);
		}
	}
	
	

	public float getTempoFilme() {
		return tempoFilme;
	}

	public void setTempoFilme(float tempoFilme) {
		this.tempoFilme = tempoFilme;
	}

	public float getTempoSerie() {
		return tempoSerie;
	}

	public void setTempoSerie(float tempoSerie) {
		this.tempoSerie = tempoSerie;
	}

	

}