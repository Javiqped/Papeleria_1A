package room4.papeleriaUnoA.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @GetMapping
    public String leerUsuario(){
        return "Eliza Rivera";

    }
    
    @PostMapping
    public String crearUsuario(){
        return "Usuario creado con exito";
        
    }
}
