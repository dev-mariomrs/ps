package com.tst.ps.core.ports;

import com.tst.ps.core.domain.Pedido;
import java.util.Optional;

public interface PedidoRepositoryPort {
    Pedido salvar(Pedido pedido);
    Optional<Pedido> buscarPorId(Long id);
}