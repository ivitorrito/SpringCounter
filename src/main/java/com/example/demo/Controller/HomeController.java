
package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String goHome(Model model){
        model.addAttribute("titulo", "welcome");
    return "inicio";
    }
    
    @GetMapping("/AgregaMaquinas")
    public String AgregaMaquinas(Model model){
   
    return "AgregaMaquinas";
    }
    
    @GetMapping("/Listado")
    public String Listado(Model model){
    model.addAttribute("mensaje","Listado de Máquinas");
    return "Listado";
    }
     @GetMapping("/Reportes")
    public String Reportes(Model model){
    model.addAttribute("mensaje","Listado de Máquinas");
    return "Reportes";
    }
}
