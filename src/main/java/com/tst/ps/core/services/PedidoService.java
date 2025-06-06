package com.tst.ps.core.services;

import com.tst.ps.core.domain.Pedido;
import com.tst.ps.core.ports.PedidoEventPort;
import com.tst.ps.core.ports.PedidoRepositoryPort;

public class PedidoService {
    private final PedidoRepositoryPort repository;
    private final PedidoEventPort eventPort;

    public PedidoService(PedidoRepositoryPort repository, PedidoEventPort eventPort) {
        this.repository = repository;
        this.eventPort = eventPort;
    }

    public Pedido criarPedido(Pedido pedido) {
        pedido = repository.salvar(pedido);
        eventPort.publicarPedidoCriado(pedido);
        return pedido;
    }
}
