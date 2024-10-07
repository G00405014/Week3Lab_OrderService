package ie.atu.week3.orderservice.controller;

import ie.atu.week3.orderservice.feign.PaymentClient;
import ie.atu.week3.orderservice.model.Order;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final PaymentClient paymentClient;

    public OrderController(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    @PostMapping
    public String createOrder(@Valid @RequestBody Order order) {
        // Call PaymentService via Feign to process payment
        String paymentResponse = paymentClient.processPayment("Payment for order: " + order.getOrderId());
        return "Order created. " + paymentResponse;
    }
}
