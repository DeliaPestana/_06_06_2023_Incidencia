package com.hedima._06_06_2023_incidencia;

import com.hedima._06_06_2023_incidencia.modelo.Incidencia;
import com.hedima._06_06_2023_incidencia.servicio.IIncidenciaService;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Application  {
//public class Application implements CommandLineRunner {
//    @Autowired
//    private IIncidenciaService servicioI;
    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class, args);



    }

//    @Override
//    public void run(String... args) throws Exception {
//        Incidencia i1 = new Incidencia(1,LocalDate.parse("2023-08-30"),"Delia",1);
//        Incidencia i2 = new Incidencia(2,LocalDate.parse("2023-08-28"),"Grey",2);
//        Incidencia i3 = new Incidencia(3,LocalDate.parse("2023-07-15"),"Dhani",3);
//        Incidencia i4 = new Incidencia(4,LocalDate.parse("2023-11-11"),"María",1);
//
//        servicioI.crear(i1);
//        servicioI.crear(i2);
//
//        servicioI.crear(i3);
//        servicioI.crear(i4);

//    }


}
