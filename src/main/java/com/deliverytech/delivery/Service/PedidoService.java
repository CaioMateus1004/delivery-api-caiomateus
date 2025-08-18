package com.deliverytech.delivery.Service;

import java.util.List;

import com.deliverytech.delivery.model.Pedido;
import com.deliverytech.delivery.model.StatusPedido;

public interface PedidoService {
    Pedido criar(Pedido pedido);
    Pedido atualizarStatus(Long id, StatusPedido status);
    void cancelar(Long id);

    List<Pedido> ListarPorCliente(Long ClienteId);
    List<Pedido> listarPorRestaurante(Long restauranteId);
}
