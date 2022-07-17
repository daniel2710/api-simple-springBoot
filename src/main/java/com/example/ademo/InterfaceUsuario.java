package com.example.ademo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaceUsuario extends CrudRepository<User, Integer>{

}
