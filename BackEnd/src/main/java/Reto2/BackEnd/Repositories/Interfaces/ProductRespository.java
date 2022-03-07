package Reto2.BackEnd.Repositories.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import Reto2.BackEnd.Repositories.Entities.ProductEntity;

public interface ProductRespository extends JpaRepository<ProductEntity, Long>{
    
}
