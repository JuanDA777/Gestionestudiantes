/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jd.proyecto;

import Mundo.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juand
 */
public class Proyecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean activo = true;
        ArrayList<Alumno> misAlumnos = new ArrayList<Alumno>();
        
        do {            
           System.out.println("------------------- Menu de opciones -------------------");
           System.out.println("1. Insertar alumno");
           System.out.println("2. Modificar alumno");
           System.out.println("3. Eliminar alumno");
           System.out.println("4. Consultar alumno");
           System.out.println("5. terminar Programa");
           System.out.println("---------------------------------------------------------");
           
           int opcion = sc.nextInt();
            switch (opcion) {
                case 1 ->{
                    try {
                        System.out.println("Bienvenid@ a registro de nuevo alumno");
                        System.out.println("Introduce cedula del almunno");
                        String cedula = sc.next();
                        System.out.println("Introduce nombre del almunno");
                        String nombre = sc.next();
                        System.out.println("Introduce apellido del almunno");
                        String apellido = sc.next();
                        System.out.println("Introduce semestre del almunno");
                        int semestre = sc.nextInt();
                        System.out.println("Introduce correo del almunno");
                        String correo = sc.next();
                        System.out.println("Introduce celular del almunno");
                        String celular = sc.next();

                        Alumno a = new Alumno();
                        a.setCedula(cedula);
                        a.setNombre(nombre);
                        a.setApellido(apellido);
                        a.setSemestre(semestre);
                        a.setCorreo(correo);
                        a.setCelular(celular);

                        misAlumnos.add(a);
                    
                    } catch (Exception e) {
                        System.out.println("Datos erroneos");
                    }
                    
                }
                case 2 -> {
                    
                    System.out.println("Bienvenid@ a modificar información de alumno");
                    System.out.println("Introduce cédula del alumno");
                    String cedula = sc.next();
                    int lugar = -1;
                    for (int i = 0; i < misAlumnos.size(); i++) {
                        if (cedula.equals(misAlumnos.get(i).getCedula())) {
                            lugar = i;
                            break;
                        }
                    }

                    if (lugar != -1) {
                        Alumno alumnoModificado = misAlumnos.get(lugar);

                        System.out.println("Introduce el nuevo nombre del alumno");
                        String nuevoNombre = sc.next();
                        alumnoModificado.setNombre(nuevoNombre);

                        System.out.println("Introduce el nuevo apellido del alumno");
                        String nuevoApellido = sc.next();
                        alumnoModificado.setApellido(nuevoApellido);

                        System.out.println("Introduce el nuevo semestre del alumno");
                        int nuevoSemestre = sc.nextInt();
                        alumnoModificado.setSemestre(nuevoSemestre);

                        System.out.println("Introduce el nuevo correo del alumno");
                        String nuevoCorreo = sc.next();
                        alumnoModificado.setCorreo(nuevoCorreo);

                        System.out.println("Introduce el nuevo celular del alumno");
                        String nuevoCelular = sc.next();
                        alumnoModificado.setCelular(nuevoCelular);

                    } else {
                        System.out.println("No se encontró ningún alumno con la cédula ingresada.");
                    }
                    break;
                    
                }
                case 3 -> {
                    int lugar = -1;
                    System.out.println("Bienvenid@ a eliminar alumno");
                    System.out.println("Introduce la cédula del alumno que deseas eliminar:");
                    String cedulaEliminar = sc.next();
                    
    
                    for (int i = 0; i < misAlumnos.size(); i++) {
                        if (cedulaEliminar.equals(misAlumnos.get(i).getCedula())) {
                            lugar = i;
                            break;
                        }
                    }
    
                    if (lugar != -1) {
                        Alumno alumnoEliminado = misAlumnos.remove(lugar);
                        System.out.println("Alumno eliminado:");
                        
                    } else {
                        System.out.println("No se encontró ningún alumno con la cédula ingresada.");
                    }
                    break;
                    
                    
                }
                case 4 -> {
                    System.out.println("Bienvenid@ a Consulta de alumno");
                    for(int i = 0; i < misAlumnos.size(); i++){
                        System.out.println("Cedula: " + misAlumnos.get(i).getCedula());
                        System.out.println("Nombre: " + misAlumnos.get(i).getNombre());
                        System.out.println("Apellido: " + misAlumnos.get(i).getApellido());
                        System.out.println("Semestre: " + misAlumnos.get(i).getSemestre());
                        System.out.println("Correo: " + misAlumnos.get(i).getCorreo());
                        System.out.println("Celular: " + misAlumnos.get(i).getCelular());
                    }
                }
                case 5 ->{
                    System.out.println("Opcion Cinco ");
                    activo = false;
                }  
                default -> System.out.println("Opción invalda");
            }
           
        } while (activo);
        
        
    }
}
