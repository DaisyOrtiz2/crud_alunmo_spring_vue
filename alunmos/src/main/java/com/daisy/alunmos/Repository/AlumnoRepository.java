package com.daisy.alunmos.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.daisy.alunmos.model.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
    

}
