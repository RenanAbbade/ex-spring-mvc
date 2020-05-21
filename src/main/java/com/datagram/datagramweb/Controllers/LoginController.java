package com.datagram.datagramweb.Controllers;

import com.datagram.datagramweb.Models.Usuario;
import com.datagram.datagramweb.Services.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

  @Controller
  public class LoginController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "/")
    public String index(){
      return "login";
    }

    

    @RequestMapping(method = RequestMethod.POST, value = "/acessoAplicacao")
    public String validaUser(Usuario usuario){
      if(usuarioService.validaLogin(usuario) == true){
        return "Feed/feed";
      }else{
        return "Cadastro/cadastroInvalido";
      }
    }  

    @RequestMapping(method = RequestMethod.GET, value = "/listaPessoas")
    public ModelAndView usuarios(){
      ModelAndView andView = new ModelAndView("login");
      Iterable<Usuario> usuariosIt = usuarioService.findAll();
      andView.addObject("usuarios", usuariosIt);
      return andView;
      
    }

 


  
}