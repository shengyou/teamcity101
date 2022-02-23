package io.kraftsman

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kraftsman.models.Product
import io.kraftsman.services.ShoppingCart

class ShoppingCartTest : FunSpec({

    context("一個購物車") {
        test("當 2 個 100 元商品相加時，總價為 200") {
            // Arrange
            val apple = Product(id = 1, name = "Apple", price = 100)
            val banana = Product(id = 2, name = "Banana", price = 100)
            val cart = ShoppingCart()

            // Act
            cart.add(apple)
            cart.add(banana)

            // Assert
            cart.totalPrice() shouldBe 200
        }
    }
})
