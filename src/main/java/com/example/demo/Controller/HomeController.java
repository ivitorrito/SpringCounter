
package com.example.demo.Controller;

import com.example.demo.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
   
    @GetMapping("/")
    public String goHome(Model model){
        model.addAttribute("titulo", "Hola");
    return "inicio";
    }
    
    @GetMapping("/Presupuestos")
    public String Presupuestos(Model model){
       
      
        
    return "Presupuestos";
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
