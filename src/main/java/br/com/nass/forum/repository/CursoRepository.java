package br.com.nass.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nass.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    Curso findByNome(String nome);

}
