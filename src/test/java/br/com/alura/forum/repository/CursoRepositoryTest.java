package br.com.alura.forum.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.alura.forum.modelo.Curso;

@DataJpaTest
@RunWith(SpringRunner.class)
//opção para usar um banco diferente do h2, configurações seram lidas do applications.properties
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CursoRepositoryTest {

	@Autowired
	private CursoRepository repository;
	
	
	@Test
	public void deveriaCarregarUmCursoAoBuscarPeloNome() {
		String nomeCurso = "HTML 5";
		Curso curso = repository.findByNome(nomeCurso);
		Assert.assertNotNull(curso);
		Assert.assertEquals(nomeCurso, curso.getNome());
	}
	
	@Test
	public void naoDeveriaCarregarCurso() {
		String nomeCurso = "JPA";
		Curso curso = repository.findByNome(nomeCurso);
		Assert.assertNull(curso);
	}

}
