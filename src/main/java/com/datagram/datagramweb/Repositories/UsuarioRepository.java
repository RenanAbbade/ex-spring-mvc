package com.datagram.datagramweb.Repositories;

import com.datagram.datagramweb.Models.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
  
  //@Query("SELECT u from Usuario u WHERE u.nome = ?1")
  //Usuario findUserByUserName(String login);

}