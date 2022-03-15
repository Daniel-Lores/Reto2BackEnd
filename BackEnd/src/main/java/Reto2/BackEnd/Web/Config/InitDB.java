package Reto2.BackEnd.Web.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Reto2.BackEnd.Repositories.Entities.OrderEntity;
import Reto2.BackEnd.Repositories.Entities.OrderProductEntity;
import Reto2.BackEnd.Repositories.Entities.ProductEntity;
import Reto2.BackEnd.Repositories.Interfaces.OrderProductRepository;
import Reto2.BackEnd.Repositories.Interfaces.OrderRepository;
import Reto2.BackEnd.Repositories.Interfaces.ProductRespository;

@Configuration
public class InitDB {
    @Bean
    CommandLineRunner initDatabase(ProductRespository productRepository, OrderRepository orderRepository, OrderProductRepository orderProductRepository){
        return args -> {
            productRepository.save(new ProductEntity("Ordenador", 1000, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTizK1HOv_Y9FqLSSnrf2uhS0ksP1psJdSqzA&usqp=CAU"));
            productRepository.save(new ProductEntity("Monitor", 250, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMQzB8NHdykI2tQabg593aEp0KNzc8cKMhQw&usqp=CAU"));

            orderRepository.save(new OrderEntity("08/03/2022", "Ana", "Activo"));
            orderRepository.save(new OrderEntity("03/08/2021", "Visco", "En Espera"));

            orderProductRepository.save(new OrderProductEntity((long)1, (long)1, 1));
            orderProductRepository.save(new OrderProductEntity((long)2, (long)1, 2));
            orderProductRepository.save(new OrderProductEntity((long)1, (long)2, 2));
            orderProductRepository.save(new OrderProductEntity((long)2, (long)2, 1));

        };
    }
}
