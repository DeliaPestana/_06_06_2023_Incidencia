package com.hedima._06_06_2023_incidencia.servicio;

import com.hedima._06_06_2023_incidencia.modelo.Incidencia;
import com.hedima._06_06_2023_incidencia.repositorio.IIncidenciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;

import java.util.List;

@Service
public class IncidenciaService implements IIncidenciaService{
    @Autowired
    private IIncidenciaRepo repo;

    //Creamos la incidencia
    @Override
    public Incidencia crear(Incidencia incidencias){

        return repo.save(incidencias);
    }

    @Override
    public Incidencia modificar(Incidencia id_incidencia) {
        return repo.save(id_incidencia);

    }


    @Override
    public void eliminar(Integer id_incidencia) {
        repo.deleteById(id_incidencia);
    }




    @Override
    public Incidencia consultarUno(Integer incidenciaId) {
        return repo.findById(incidenciaId).orElse(new Incidencia());
    }

    @Override
    public List<Incidencia> consultarTodos() {
        Sort sort = Sort.by(Sort.Direction.ASC, "id_incidencia");
        return repo.findAll();
    }


}
