package com.daisy.alunmos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daisy.alunmos.Repository.AlumnoRepository;
import com.daisy.alunmos.model.Alumno;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/alumnos")
public class AlumnoControllers {

    @Autowired 
    private AlumnoRepository alumnoRepository;
    
    @GetMapping( "/traer-alumno" )
    public List<Alumno> TraerAlumnos() {
        return alumnoRepository.findAll();
    }

   
}
