package Reto2.BackEnd.Web.Api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Reto2.BackEnd.Services.OrdersServices;
import Reto2.BackEnd.Services.Models.OrderDTO;

@RestController
@RequestMapping("orders/v1")
public class OrderController {
    private final OrdersServices ordersServices;

    OrderController(OrdersServices _ordersServices){
        ordersServices = _ordersServices;
    }

    @GetMapping()
    public List<OrderDTO> GetOrders(){
        return ordersServices.getAll();
    }
<<<<<<< Updated upstream
=======

    @GetMapping("/{id}")
    public List<ProductDTO> GetOrderProductByOrderId(@PathVariable("id") Long id){
        var result = ordersServices.getAllByOrderId(id);
        return result;
    }
    
    @PostMapping
    public OrderDTO addOrder(@RequestBody OrderDTO order){
        return ordersServices.add(order);
    }

    @PutMapping("/{id}")
    public OrderDTO updatOrder(@PathVariable("id") Long id, @RequestBody OrderDTO order){
        return ordersServices.update(id, order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") Long id){
        ordersServices.delete(id);
    }
>>>>>>> Stashed changes
}
