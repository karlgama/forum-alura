package br.com.alura.forum.controller.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Optional<Usuario> findByEmail(String email);
	
}
