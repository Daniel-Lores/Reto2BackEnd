package Reto2.BackEnd.Web.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Reto2.BackEnd.Repositories.Entities.ProductEntity;
import Reto2.BackEnd.Repositories.Interfaces.ProductRespository;

@Configuration
public class InitDB {
    @Bean
    CommandLineRunner initDatabase(ProductRespository respository){
        return args -> {
            respository.save(new ProductEntity("Ordenador", 1000, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTizK1HOv_Y9FqLSSnrf2uhS0ksP1psJdSqzA&usqp=CAU"));
            respository.save(new ProductEntity("Monitor", 250, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRMQzB8NHdykI2tQabg593aEp0KNzc8cKMhQw&usqp=CAU"));
        };
    }
}
