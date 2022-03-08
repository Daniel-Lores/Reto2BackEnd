package Reto2.BackEnd.Web.Api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Reto2.BackEnd.Services.ProductsServices;
import Reto2.BackEnd.Services.Models.ProductDTO;

@RestController
@RequestMapping("products/v1")
public class ProductController {
    private final ProductsServices productsServices;

    ProductController(ProductsServices _productsServices){
        productsServices = _productsServices;
    }

    @GetMapping()
    public List<ProductDTO> GetProducts(){
        return productsServices.getAll();
    }
}
