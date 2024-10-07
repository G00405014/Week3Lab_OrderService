package ie.atu.week3.orderservice;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Order {

    @NotNull(message = "Order ID cannot be null")
    private String orderId;

    @Size(min = 5, message = "Description must be at least 5 characters")
    private String description;

    // Getters and Setters
}
