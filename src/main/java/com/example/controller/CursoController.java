package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Curso;
import com.example.services.CursoService;

/**
 * Controlador que recoge las diferentes url que puede meter el usuario con los posibles parametros
 * @param curso
 * @param codCurso
 * y ejecuta la accion correspondiente.
 */
@RestController
public class CursoController {

    @Autowired
    CursoService cursoService;

    @GetMapping(value = "cursos", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> getCursos(){
        return cursoService.getCursos();
    }

    @GetMapping(value = "curso/{codcurso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Curso> getCurso(@PathVariable("codcurso") int codCurso){
        return cursoService.getCurso(codCurso);
    }

    @PostMapping(value = "curso", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void agregarCurso(@RequestBody Curso curso){
        cursoService.postCurso(curso);
    }

    @PutMapping(value = "curso/{codcurso}/{duracion}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void actulizarCurso(@PathVariable("codcurso") int codcurso, @PathVariable("duracion") int duracion){
        cursoService.putCurso(codcurso, duracion);
    }

    @DeleteMapping(value = "curso/{codcurso}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> deleteCurso(@PathVariable("codcurso") int codcurso){
        return cursoService.deleteCurso(codcurso);
    }


}
