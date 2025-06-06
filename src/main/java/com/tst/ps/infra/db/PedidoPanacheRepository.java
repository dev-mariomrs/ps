package com.tst.ps.infra.db;

import com.tst.ps.core.domain.Pedido;
import com.tst.ps.core.ports.PedidoRepositoryPort;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Optional;

@ApplicationScoped
public abstract class PedidoPanacheRepository implements PedidoRepositoryPort, PanacheRepository<Pedido> {

    @Override
    public Pedido salvar(Pedido pedido) {
        persist(pedido);
        return pedido;
    }
}

