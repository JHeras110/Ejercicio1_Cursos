package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.model.Curso;

/**
 * Interfaz que hace de intermediario entre el controller y el servicio y obliga al servicio a implementar unos metodos
 */
public interface CursoService {
    List<Curso> getCursos();
    Optional<Curso> getCurso(int codCurso);
    void postCurso(Curso curso);
    void putCurso(int codcurso, int duracion);
    List<Curso> deleteCurso(int codCurso);

}
