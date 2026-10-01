package br.com.luis.cursos.repository;
import br.com.luis.cursos.model.Aluno; import org.springframework.data.jpa.repository.JpaRepository;
public interface AlunoRepository extends JpaRepository<Aluno,Long>{}
