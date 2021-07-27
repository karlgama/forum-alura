package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.DTO.TopicoDTO;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoDTO> lista() {
		Topico topico = new Topico("teste 1", "teste texto", new Curso("spring","programação"));
		
		
		return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
	}
	
	
}
