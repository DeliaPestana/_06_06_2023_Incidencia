package com.hedima._06_06_2023_incidencia.repositorio;


import com.hedima._06_06_2023_incidencia.modelo.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIncidenciaRepo extends JpaRepository<Incidencia,Integer> {

}
