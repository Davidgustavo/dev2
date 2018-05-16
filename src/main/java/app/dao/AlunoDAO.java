package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("AlunoDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AlunoDAO extends JpaRepository<Aluno, java.lang.String> {

  /**
   * Obtém a instância de Aluno utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Aluno entity WHERE entity.id = :id")
  public Aluno findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Aluno utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Aluno entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Matricula entity WHERE entity.aluno.id = :id AND (entity.id like concat('%',coalesce(:search,''),'%'))")
  public Page<Matricula> findMatriculaGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Matricula entity WHERE entity.aluno.id = :id AND (:id is null OR entity.id like concat('%',:id,'%')) AND (:data is null OR entity.data = :data)")
  public Page<Matricula> findMatriculaSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="data") java.util.Date data, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Matricula entity WHERE entity.aluno.id = :id")
  public Page<Matricula> findMatricula(@Param(value="id") java.lang.String id, Pageable pageable);
  
  /**
   * ManyToOne Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity.disciplina FROM Matricula entity WHERE entity.aluno.id = :id AND (entity.disciplina.id like concat('%',coalesce(:search,''),'%') OR entity.disciplina.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<Disciplina> listDisciplinaGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity.disciplina FROM Matricula entity WHERE entity.aluno.id = :id AND (:id is null OR entity.disciplina.id like concat('%',:id,'%')) AND (:nome is null OR entity.disciplina.nome like concat('%',:nome,'%'))")
  public Page<Disciplina> listDisciplinaSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.disciplina FROM Matricula entity WHERE entity.aluno.id = :id")
  public Page<Disciplina> listDisciplina(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM Matricula entity WHERE entity.aluno.id = :instanceId AND entity.disciplina.id = :relationId")
  public int deleteDisciplina(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Aluno entity WHERE entity.id like concat('%',coalesce(:search,''),'%') OR entity.aluno like concat('%',coalesce(:search,''),'%') OR entity.matricula like concat('%',coalesce(:search,''),'%')")
  public Page<Aluno> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Aluno entity WHERE (:id is null OR entity.id like concat('%',:id,'%')) AND (:aluno is null OR entity.aluno like concat('%',:aluno,'%')) AND (:matricula is null OR entity.matricula like concat('%',:matricula,'%'))")
  public Page<Aluno> specificSearch(@Param(value="id") java.lang.String id, @Param(value="aluno") java.lang.String aluno, @Param(value="matricula") java.lang.String matricula, Pageable pageable);
  
}
