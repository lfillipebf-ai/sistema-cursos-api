package br.com.luis.cursos.model;
import jakarta.persistence.*; import java.time.LocalDate;
@Entity public class Matricula {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @ManyToOne(optional=false) private Aluno aluno; @ManyToOne(optional=false) private Curso curso;
 private LocalDate dataMatricula=LocalDate.now(); @Enumerated(EnumType.STRING) private StatusMatricula status=StatusMatricula.ATIVA;
 public Long getId(){return id;} public Aluno getAluno(){return aluno;} public void setAluno(Aluno v){aluno=v;} public Curso getCurso(){return curso;} public void setCurso(Curso v){curso=v;}
 public LocalDate getDataMatricula(){return dataMatricula;} public void setDataMatricula(LocalDate v){dataMatricula=v;} public StatusMatricula getStatus(){return status;} public void setStatus(StatusMatricula v){status=v;}
}
