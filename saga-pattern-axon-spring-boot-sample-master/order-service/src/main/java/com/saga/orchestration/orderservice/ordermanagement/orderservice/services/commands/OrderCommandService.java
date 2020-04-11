package com.saga.orchestration.orderservice.ordermanagement.orderservice.services.commands;

import java.util.concurrent.CompletableFuture;

import com.saga.orchestration.orderservice.ordermanagement.orderservice.dto.commands.OrderCreateDTO;

public interface OrderCommandService {

    public CompletableFuture<String> createOrder(OrderCreateDTO orderCreateDTO);

}
