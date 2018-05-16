package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ALUNO
 * @generated
 */
@Entity
@Table(name = "\"ALUNO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Aluno")
public class Aluno implements Serializable {

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
  @Column(name = "aluno", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String aluno;

  /**
  * @generated
  */
  @Column(name = "matricula", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String matricula;

  /**
   * Construtor
   * @generated
   */
  public Aluno(){
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
  public Aluno setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém aluno
   * return aluno
   * @generated
   */
  
  public java.lang.String getAluno(){
    return this.aluno;
  }

  /**
   * Define aluno
   * @param aluno aluno
   * @generated
   */
  public Aluno setAluno(java.lang.String aluno){
    this.aluno = aluno;
    return this;
  }

  /**
   * Obtém matricula
   * return matricula
   * @generated
   */
  
  public java.lang.String getMatricula(){
    return this.matricula;
  }

  /**
   * Define matricula
   * @param matricula matricula
   * @generated
   */
  public Aluno setMatricula(java.lang.String matricula){
    this.matricula = matricula;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Aluno object = (Aluno)obj;
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
