package com.deliverytech.delivery.Service;

import java.util.List;
import java.util.Optional;

import com.deliverytech.delivery.model.Restaurante;

public interface RestauranteService {
    Restaurante cadastrar(Restaurante restaurante);

    Optional<Restaurante> buscarPorId (long id);

    List<Restaurante> listarTodos();

    
}
