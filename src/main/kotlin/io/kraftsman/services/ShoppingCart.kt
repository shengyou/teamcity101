package io.kraftsman.services

import io.kraftsman.models.Product

class ShoppingCart {
    private val products = mutableListOf<Product>()

    fun add(product: Product) {
        products.add(product)
    }

    fun totalPrice(): Int = products.sumOf { it.price }
}