package com.TransactionManagement.helpzee.declarative.TransactionalAnnotation;

import org.springframework.transaction.annotation.Transactional;

public interface ProductInterface {
    @Transactional
    boolean buyProduct(String username, int productId);
}
