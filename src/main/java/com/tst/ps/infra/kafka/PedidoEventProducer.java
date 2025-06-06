package com.tst.ps.infra.kafka;

import com.tst.ps.core.domain.Pedido;
import com.tst.ps.core.ports.PedidoEventPort;
import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

@ApplicationScoped
public class PedidoEventProducer implements PedidoEventPort {
    @Channel("pedidos-criados")
    Emitter<String> emitter;

    @Override
    public void publicarPedidoCriado(Pedido pedido) {
        emitter.send(pedido.toString());
    }
}
