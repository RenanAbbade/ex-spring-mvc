package com.datagram.datagramweb.Controllers;

import com.datagram.datagramweb.Models.Usuario;
import com.datagram.datagramweb.Services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroController {

  @Autowired
  UsuarioService usuarioService;
  
  @RequestMapping(method = RequestMethod.GET, value = "/cadastroUsuario")
    public String index(){
      return "Cadastro/cadastroUsuario";
    }
  
  @RequestMapping(method = RequestMethod.POST, value = "/salvarUsuario")
    public ModelAndView saveUser(Usuario usuario){
      usuarioService.Save(usuario);
      ModelAndView andView = new ModelAndView("login");
      Iterable<Usuario> usuariosIt = usuarioService.findAll();
      andView.addObject("usuarios", usuariosIt);
      return andView;
  
    }  

    
}