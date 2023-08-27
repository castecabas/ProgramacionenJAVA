package co.edu.uts.appdemo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import co.edu.uts.appdemo.models.Usuario;


@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping({"/index","/home"})
    public String index(Model model){
        model.addAttribute("titulo", "Hola Spring Framework");
        return "index";
    }

    @GetMapping("/perfil")
    public String  perfil(Model model) {
        model.addAttribute("titulo", "Perfil usuario");
        //atrae los usuarios del metodo
       List<Usuario> usuarios=getAllUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "perfil";
    }


private List<Usuario> getAllUsuarios(){

    List<Usuario> usuarios= new ArrayList<>();
    
    usuarios.add(new Usuario("Camilo", "Rodriguez", "crodrigrg@gmail.com"));
    usuarios.add(new Usuario("Arley", "Henao", "ArleyHenao@gmail.com"));
    usuarios.add(new Usuario("Yeff", "Mendoza", "YeffMendoza@gmail.com"));
    usuarios.add(new Usuario("Gustavo", "Petro", "GustavoPetrog@gmail.com"));
    usuarios.add(new Usuario("Uribe", "Velez", "UribeVelez@gmail.com"));
    usuarios.add(new Usuario("Pancho", "Villa", "PanchoVilla@gmail.com"));
    usuarios.add(new Usuario("Rick", "Sanchez", "RickSanchez@gmail.com"));

    return usuarios;
}


    
    
}
