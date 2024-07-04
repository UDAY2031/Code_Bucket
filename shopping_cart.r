# Define product list
products <- list(
    list(name = "apple", price = 0.5),
    list(name = "banana", price = 0.3),
    list(name = "milk", price = 2),
    list(name = "bread", price = 1.5),
    list(name = "egg", price = 2.5)
)

# Initialize shopping cart and items to be added
shopping_cart <- list()
item_cart <- list(
    list(name = "apple", quantity = 3),
    list(name = "milk", quantity = 2)
)

# Add items to the shopping cart
for (item in item_cart) {
    product <- Filter(function(p) p$name == item$name, products)
    if (length(product) > 0) {
        product <- product[[1]]
        cart_item <- list(name = product$name, price = product$price, quantity = item$quantity)
        shopping_cart <- c(shopping_cart, list(cart_item))
        cat("Added\n")
    } else {
        cat("!Added\n")
    }
}

# Calculate and display receipt
subtotal <- 0
cat("\nReceipt:\n")
for (item in shopping_cart) {
    item_subtotal <- item$price * item$quantity
    cat(sprintf("%s (%d units) - Price: $%.2f - Subtotal: $%.2f\n", item$name, item$quantity, item$price, item_subtotal))
    subtotal <- subtotal + item_subtotal
}

tax_rate <- 0.08
tax_amount <- subtotal * tax_rate
total_cost <- subtotal + tax_amount

cat(sprintf("\nSubtotal: $%.2f\n", subtotal))
cat(sprintf("Tax Amount (8%%): $%.2f\n", tax_amount))
cat(sprintf("Total Cost: $%.2f\n", total_cost))

