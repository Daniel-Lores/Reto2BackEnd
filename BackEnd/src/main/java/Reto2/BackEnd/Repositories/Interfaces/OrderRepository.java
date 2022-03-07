package Reto2.BackEnd.Repositories.Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import Reto2.BackEnd.Repositories.Entities.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long>{
    
}
