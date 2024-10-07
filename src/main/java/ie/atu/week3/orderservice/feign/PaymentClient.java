package ie.atu.week3.orderservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "payment-service", url = "http://localhost:8081")
public interface PaymentClient {

    @PostMapping("/payments")
    String processPayment(@RequestBody String paymentDetails);
}
