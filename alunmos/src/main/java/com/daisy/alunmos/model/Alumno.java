package com.daisy.alunmos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Alumno {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
private long id;

private String nummerocomtrol;
private String nombre;
private String apellido;
private String email;
private String carrera;
private String telefono; 
public String getNummerocomtrol() { 
return nummerocomtrol;
}
public void setNummerocomtrol(String nummerocomtrol) {
    this.nummerocomtrol = nummerocomtrol;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellido() {
    return apellido;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getCarrera() {
    return carrera;
}
public void setCarrera(String carrera) {
    this.carrera = carrera;
}
public String getTelefono() {
    return telefono;
}
public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public long getid() {
return id;
}
public  void serid (long id){
    this.id= id;
}
}
