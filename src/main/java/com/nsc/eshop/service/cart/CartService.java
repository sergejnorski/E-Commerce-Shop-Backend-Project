package com.nsc.eshop.service.cart;

import com.nsc.eshop.dto.CartDto;
import com.nsc.eshop.model.Cart;
import com.nsc.eshop.model.User;

import java.math.BigDecimal;

public interface CartService {
    Cart getCart(Long id);
    void clearCart(Long id);
    BigDecimal getTotalPrice(Long id);
    Cart initializeNewCart(User user);
    Cart getCartByUserId(Long userId);
    CartDto convertToDto(Cart cart);
}
