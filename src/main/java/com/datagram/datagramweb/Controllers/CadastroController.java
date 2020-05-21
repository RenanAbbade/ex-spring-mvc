package com.datagram.datagramweb.Controllers;

import com.datagram.datagramweb.Models.Usuario;
import com.datagram.datagramweb.Services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CadastroController {

  @Autowired
  UsuarioService usuarioService;
  
  @RequestMapping(method = RequestMethod.GET, value = "/cadastroUsuario")
    public String index(){
      return "Cadastro/cadastroUsuario";
    }
  
  @RequestMapping(method = RequestMethod.POST, value = "/salvarUsuario")
    public String saveUser(Usuario usuario){
      usuarioService.Save(usuario);
      return "Cadastro/cadastroUsuario";
    }  

    
}