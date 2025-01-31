package com.microservico.consumidorEstoque.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import constantes.RabbitMQConstantes;
import dto.PrecoDto;

@Component
public class PrecoConsumer {

    @RabbitListener(queues = RabbitMQConstantes.FILA_PRECO)
    private void consumirPreco(PrecoDto precoDto) {
        System.out.println(precoDto.codigoProduto);
        System.out.println(precoDto.preco);
        System.out.println("-----------");

    }
}
