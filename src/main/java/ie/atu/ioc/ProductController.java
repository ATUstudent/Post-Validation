package ie.atu.ioc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/product")
public class ProductController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/getproduct")
    public Product getProduct()
    {
        Product myProduct = new Product("Tv",499);
        return myProduct;
    }
}
