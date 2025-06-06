package com.tst.ps.core.domain;

import java.math.BigDecimal;
import java.util.List;

public class Pedido {
    private Long id;
    private Cliente cliente;
    //private List<ItemPedido> itens;
    private StatusPedido status = StatusPedido.CRIADO;

    //public BigDecimal getValorTotal() {
    //    return itens.stream()
    //            .map(ItemPedido::getSubtotal)
    //            .reduce(BigDecimal.ZERO, BigDecimal::add);
}
