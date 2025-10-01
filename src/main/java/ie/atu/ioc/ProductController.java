package ie.atu.ioc;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    List<Product> myList=new ArrayList<>();

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/getproducts")
    public List<Product> getProduct()
    {
        Product myProduct = new Product("Tv",498);
        return myList;
    }
    @PostMapping("/addProduct")
    public Product addProduct(@Valid @RequestBody Product myProduct)
    {
        myList.add(myProduct);

    @GetMapping("/getproduct")
    public Product getProduct()
    {
        Product myProduct = new Product("Tv",499);

        return myProduct;
    }
}
