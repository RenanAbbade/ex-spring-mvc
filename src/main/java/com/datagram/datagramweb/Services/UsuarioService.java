package com.datagram.datagramweb.Services;

import java.util.Optional;

import com.datagram.datagramweb.Models.Usuario;
import com.datagram.datagramweb.Repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioRepository repo;

  public Usuario find(Integer id) {
    Optional<Usuario> obj = repo.findById(id);
    return obj.orElse(null);
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

  public boolean validaLogin(Usuario usuario){
    Usuario newUsuario = find(usuario.getId());

    if(newUsuario == null){
      return false;
    }
    
    return true;
    
  }

public Iterable<Usuario> findAll() {
  return repo.findAll();
}

  
}