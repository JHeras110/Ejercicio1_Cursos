package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CursoDao;
import com.example.model.Curso;

@Service
public class CursoServiceImpl implements CursoService{
    
    @Autowired
    CursoDao cursoDao;

    @Override
    public List<Curso> getCursos(){
        return cursoDao.findAll();
    }

    @Override
    public Optional<Curso> getCurso(int codCurso){
        return cursoDao.findById(codCurso);
    }

    @Override
    public void postCurso(Curso curso){
        cursoDao.save(curso);
    }

    @Override
    public void putCurso(int codcurso, int duracion){
        Curso curso = cursoDao.findById(codcurso).orElseThrow(()-> new IllegalArgumentException("El curso con código " + codcurso + " no fue encontrado."));
        
        curso.setDuracion(duracion);
        cursoDao.save(curso);
    }

    @Override
    public List<Curso> deleteCurso(int codCurso){
        cursoDao.deleteById(codCurso);
        return cursoDao.findAll();
    }
}
