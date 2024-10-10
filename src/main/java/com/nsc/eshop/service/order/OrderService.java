package com.nsc.eshop.service.order;

import com.nsc.eshop.dto.OrderDto;
import com.nsc.eshop.model.Order;

import java.util.List;

public interface OrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
    OrderDto convertToDto(Order order);
}
