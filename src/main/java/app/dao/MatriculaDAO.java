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
@Repository("MatriculaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface MatriculaDAO extends JpaRepository<Matricula, java.lang.String> {

  /**
   * Obtém a instância de Matricula utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Matricula entity WHERE entity.id = :id")
  public Matricula findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Matricula utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Matricula entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Matricula entity WHERE entity.id like concat('%',coalesce(:search,''),'%')")
  public Page<Matricula> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Matricula entity WHERE (:id is null OR entity.id like concat('%',:id,'%')) AND (:data is null OR entity.data = :data)")
  public Page<Matricula> specificSearch(@Param(value="id") java.lang.String id, @Param(value="data") java.util.Date data, Pageable pageable);
  
  /**
   * Foreign Key aluno
   * @generated
   */
  @Query("SELECT entity FROM Matricula entity WHERE entity.aluno.id = :id")
  public Page<Matricula> findMatriculasByAluno(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key disciplina
   * @generated
   */
  @Query("SELECT entity FROM Matricula entity WHERE entity.disciplina.id = :id")
  public Page<Matricula> findMatriculasByDisciplina(@Param(value="id") java.lang.String id, Pageable pageable);

}
