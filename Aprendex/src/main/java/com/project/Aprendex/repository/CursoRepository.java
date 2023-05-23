package com.project.Aprendex.repository;

import com.project.Aprendex.model.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CursoRepository extends MongoRepository<Curso, String> {

    Optional<Curso> findByNomeLikeIgnoreCase(String nome);

    Optional<Curso> findByDescricaoLikeIgnoreCase(String descricao);

    Optional<Curso> findByInstituicaoLikeIgnoreCase(String instituicao);

    Curso findCursoById(String id);




}
