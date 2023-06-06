package com.hedima._06_06_2023_incidencia.controlador;

import com.hedima._06_06_2023_incidencia.modelo.Incidencia;
import com.hedima._06_06_2023_incidencia.servicio.IIncidenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/incidencias")
public class ControladorIncidencia {
    @Autowired
    private IIncidenciaService servicio;
    @GetMapping
    public String mostrarTodos(Model modelo) {
        List<Incidencia> incidencias = servicio.consultarTodos();
        modelo.addAttribute("incidencias",incidencias);
        return "mostrar";

    }


    @GetMapping("/formulario")
    public String mostrarFormulario(Model modelo) {
        Incidencia incidencias = new Incidencia();
        modelo.addAttribute("incidencias",incidencias);
        return "formulario";
    }

    @PostMapping("/alta")
    public String guardarIncidencia(Incidencia m, RedirectAttributes ra) {
        Incidencia i1 = servicio.crear(m);
        System.out.println(i1.toString());
        return "redirect:/incidencias";
    }

    @PostMapping("/alta/{id}")
    public String modificaarIncidencia(Incidencia m, RedirectAttributes ra) {
        Incidencia i1 = servicio.crear(m);
        System.out.println(i1.toString());
        return "redirect:/incidencias";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarIncidencia(@PathVariable("id") Integer id){
        servicio.eliminar(id);
        return "redirect:/incidencias";
    }
}
