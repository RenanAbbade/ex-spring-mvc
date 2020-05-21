package com.datagram.datagramweb.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CadastroController {
  
  @RequestMapping(value = "/cadastroUsuario")
    public String index(){
      return "Cadastro/cadastroUsuario";
    }
}