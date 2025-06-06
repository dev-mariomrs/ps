package com.tst.ps.application;

import com.tst.ps.core.domain.Pedido;
import com.tst.ps.core.services.PedidoService;

public class CriarPedidoUseCase {
    private final PedidoService pedidoService;

    public CriarPedidoUseCase(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public Pedido executar(Pedido pedido) {
        return pedidoService.criarPedido(pedido);
    }
}
