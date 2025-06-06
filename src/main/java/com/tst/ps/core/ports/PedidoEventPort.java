package com.tst.ps.core.ports;

import com.tst.ps.core.domain.Pedido;

public interface PedidoEventPort {
    void publicarPedidoCriado(Pedido pedido);
}
