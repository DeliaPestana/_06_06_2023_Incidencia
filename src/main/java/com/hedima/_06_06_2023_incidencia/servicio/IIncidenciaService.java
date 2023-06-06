package com.hedima._06_06_2023_incidencia.servicio;

import com.hedima._06_06_2023_incidencia.modelo.Incidencia;

import java.util.List;

public interface IIncidenciaService {
    Incidencia crear(Incidencia incidencia);

    Incidencia modificar(Incidencia id_incidencia);

    void eliminar(Integer id_incidencia);

    Incidencia consultarUno(Integer incidenciaId);

    List<Incidencia> consultarTodos();


}
