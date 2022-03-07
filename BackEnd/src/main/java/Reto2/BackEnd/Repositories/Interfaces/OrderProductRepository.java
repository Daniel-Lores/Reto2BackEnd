package Reto2.BackEnd.Repositories.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import Reto2.BackEnd.Repositories.Entities.OrderProductEntity;

public interface OrderProductRepository extends JpaRepository<OrderProductEntity, Long>{
    
}
