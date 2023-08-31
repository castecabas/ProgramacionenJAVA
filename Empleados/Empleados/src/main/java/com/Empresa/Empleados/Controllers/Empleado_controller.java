package com.Empresa.Empleados.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Empresa.Empleados.Models.Empleado;

import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/APP")
public class Empleado_controller {
    
    @GetMapping({"/index","/home","/"})
    public String Index(Model model)
    {
        model.addAttribute("titulo", "Bienvenidos a la pagina");
        return "Index";
    }

    @GetMapping("/Empleados")
    public String Empleados(Model model){

        List<Empleado> empleados = getAllEmpleados();
        model.addAttribute("empleado", empleados);

        return "Empleados";
    }

    private List<Empleado> getAllEmpleados(){
        List<Empleado> empleados = new ArrayList<>(); 

        /*
         * tipo contrato
         * 
         * Horas = 100.000
         * Timpo Completo= 2.300.000
         * Tiempo Completo + Bonificaciones 
         */


        empleados.add(new Empleado("Juan","Rodriguez","jrodriguez@gmail.com","Horas",20,0,0));
        empleados.add(new Empleado("Pedro","Perez","pperez@gmail.com","Tiempo Completo",0,1,0));
        empleados.add(new Empleado("Diana","Tarazona","dtarazona@gmail.com","Tiempo Completo nas Bonificaciones",0,1,2000000));
        return empleados;
    };
}
