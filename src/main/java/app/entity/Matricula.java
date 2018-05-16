package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela MATRICULA
 * @generated
 */
@Entity
@Table(name = "\"MATRICULA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Matricula")
public class Matricula implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="aluno", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Aluno aluno;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="disciplina", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Disciplina disciplina;

  /**
   * Construtor
   * @generated
   */
  public Matricula(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Matricula setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém aluno
   * return aluno
   * @generated
   */
  
  public Aluno getAluno(){
    return this.aluno;
  }

  /**
   * Define aluno
   * @param aluno aluno
   * @generated
   */
  public Matricula setAluno(Aluno aluno){
    this.aluno = aluno;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public Matricula setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém disciplina
   * return disciplina
   * @generated
   */
  
  public Disciplina getDisciplina(){
    return this.disciplina;
  }

  /**
   * Define disciplina
   * @param disciplina disciplina
   * @generated
   */
  public Matricula setDisciplina(Disciplina disciplina){
    this.disciplina = disciplina;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Matricula object = (Matricula)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
