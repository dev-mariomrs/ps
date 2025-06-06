package com.tst.ps.infra.rest;

import com.tst.ps.application.CriarPedidoUseCase;
import com.tst.ps.core.domain.Pedido;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/pedidos")
public class PedidoController {
    private final CriarPedidoUseCase useCase;

    public PedidoController(CriarPedidoUseCase useCase) {
        this.useCase = useCase;
    }

    @POST
    public Response criarPedido(Pedido pedido) {
        Pedido pedidoCriado = useCase.executar(pedido);
        return Response.status(201).entity(pedidoCriado).build();
    }
}
