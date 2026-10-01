package br.com.luis.cursos.repository;

import br.com.luis.cursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepository extends JpaRepository<Curso, Long> {
    List<Curso> findByAtivoTrue();
}
