package br.com.luis.cursos.repository;
import br.com.luis.cursos.model.*; import org.springframework.data.jpa.repository.JpaRepository; import java.util.List;
public interface MatriculaRepository extends JpaRepository<Matricula,Long>{List<Matricula> findByStatus(StatusMatricula status);}
