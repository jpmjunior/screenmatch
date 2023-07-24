package br.com.alura.screenmatch.domain.filme;

public class Filme {
	
	private String nome;
	private Integer anoLancamento;
	private Integer duracaoEmMinutos;
	private String genero;
	
	
	public Filme(DadosCadastroFilme dados) {
		this.nome = dados.nome();
		this.anoLancamento = dados.ano();
		this.duracaoEmMinutos = dados.duracao();
		this.genero = dados.genero();
	}
	
	@Override
	public String toString() {
		return "Filme [nome=" + nome + ", anoLancamento=" + anoLancamento + ", duracaoEmMinutos=" + duracaoEmMinutos
				+ ", genero=" + genero + "]";
	}
	
	public String getNome() {
		return nome;
	}
	
	public Integer getAnoLancamento() {
		return anoLancamento;
	}
	
	public Integer getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}
	
	public String getGenero() {
		return genero;
	}

}
