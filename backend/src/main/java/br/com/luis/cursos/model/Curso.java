package br.com.luis.cursos.model;
import jakarta.persistence.*; import jakarta.validation.constraints.*; import java.math.BigDecimal;
@Entity public class Curso {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @NotBlank @Column(unique=true) private String titulo; private String descricao;
 @DecimalMin("0.0") private BigDecimal preco; private boolean ativo=true;
 @ManyToOne(optional=false) private Instrutor instrutor;
 public Long getId(){return id;} public String getTitulo(){return titulo;} public void setTitulo(String v){titulo=v;}
 public String getDescricao(){return descricao;} public void setDescricao(String v){descricao=v;} public BigDecimal getPreco(){return preco;} public void setPreco(BigDecimal v){preco=v;}
 public boolean isAtivo(){return ativo;} public void setAtivo(boolean v){ativo=v;} public Instrutor getInstrutor(){return instrutor;} public void setInstrutor(Instrutor v){instrutor=v;}
}
