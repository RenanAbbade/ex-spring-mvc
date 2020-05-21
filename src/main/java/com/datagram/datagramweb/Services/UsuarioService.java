package com.datagram.datagramweb.Services;

import com.datagram.datagramweb.Models.Usuario;
import com.datagram.datagramweb.Repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioRepository repo;

  public Usuario find(Integer id){
    Usuario obj = repo.findById(id).get();
    return obj;
  }

  public boolean Save(Usuario usuario){

    try{
      repo.save(usuario);
      return true;
    }catch(Exception e){
      e.printStackTrace();
      return false;
    }

  }

  
}