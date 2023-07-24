package br.com.alura.screenmatch.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.screenmatch.domain.filme.DadosCadastroFilme;
import br.com.alura.screenmatch.domain.filme.Filme;

@Controller
@RequestMapping("/filmes")
public class FilmeControler {
	
	private List<Filme> filmes = new ArrayList<>();
	
	@GetMapping
	public String carregaPaginaFormulario() {
		return "filmes/formulario";
	}
	
	@PostMapping
	public String cadastraFilme(DadosCadastroFilme dados) {
		var filme = new Filme(dados);
		filmes.add(filme);
		
		System.out.println(filmes);
		
		return "filmes/formulario";
	}
}
