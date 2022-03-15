package Reto2.BackEnd.Repositories.Interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Reto2.BackEnd.Repositories.Entities.OrderProductEntity;

public interface OrderProductRepository extends JpaRepository<OrderProductEntity, Long>{
    /*@Query(value = "SELECT o FROM OrderProduct o WHERE idOrder = :idOrder")
    Collection<OrderProductEntity> findByOrderId(@Param("idOrder") Long idOrder);*/

    @Query(value = "SELECT o.quantity, p FROM OrderProduct o INNER JOIN Product p ON o.idProduct = p.id WHERE o.idOrder = :idOrder ")
    List<Object[]> getAllByOrderId(@Param("idOrder") Long idOrder);
    
}
