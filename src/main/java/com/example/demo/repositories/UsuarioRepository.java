package com.example.demo.repositories;

import com.example.demo.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Long> {
//aca se hacen realmente las conexiones con la BD, hace uso del modelo para ubicar
//que tipo de dato traer

public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
}
