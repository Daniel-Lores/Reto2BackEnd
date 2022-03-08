package Reto2.BackEnd.Web.Config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Reto2.BackEnd.Services.OrderProductsServices;
import Reto2.BackEnd.Services.OrdersServices;
import Reto2.BackEnd.Services.ProductsServices;

@Configuration
public class DI {
    @Bean
    ProductsServices createProductService(){
        return new ProductsServices();
    }

    @Bean
    OrdersServices createOrderService(){
        return new OrdersServices();
    } 
    
    @Bean
    OrderProductsServices createOrderProductService(){
        return new OrderProductsServices();
    } 

    @Bean
    ModelMapper createModelMapper(){
        return new ModelMapper();
    }
}
