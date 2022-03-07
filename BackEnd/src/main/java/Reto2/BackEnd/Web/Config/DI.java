package Reto2.BackEnd.Web.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

import Reto2.BackEnd.Services.ProductsServices;

@Configuration
public class DI {
    @Bean
    ProductsServices createProductService(){
        return new ProductsServices();
    }   

    @Bean
    ModelMapper createModelMapper(){
        return new ModelMapper();
    }
}
