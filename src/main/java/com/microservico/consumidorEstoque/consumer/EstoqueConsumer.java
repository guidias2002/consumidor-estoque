package com.microservico.consumidorEstoque.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import constantes.RabbitMQConstantes;
import dto.EstoqueDto;
import org.springframework.stereotype.Component;

@Component
public class EstoqueConsumer {

    @RabbitListener(queues = RabbitMQConstantes.FILA_ESTOQUE)
    public void consumidor(EstoqueDto estoqueDto) {
        System.out.println(estoqueDto.codigoProduto);
        System.out.println(estoqueDto.quantidade);
        System.out.println("------------------------------------");
    }
}
