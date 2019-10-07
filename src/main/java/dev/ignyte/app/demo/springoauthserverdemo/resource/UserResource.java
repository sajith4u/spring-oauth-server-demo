package dev.ignyte.app.demo.springoauthserverdemo.resource;

import dev.ignyte.app.demo.springoauthserverdemo.domain.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

    @GetMapping("/apps/details")
    public Product user() {
        Product product = new Product();
        product.setId("001");
        product.setName("Sample App");
        return product;
    }
}
