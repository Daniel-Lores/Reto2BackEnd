package Reto2.BackEnd.Web.Api;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Reto2.BackEnd.Services.OrdersServices;
import Reto2.BackEnd.Services.Models.OrderDTO;
import Reto2.BackEnd.Services.Models.OrderProductDTO;
import Reto2.BackEnd.Services.Models.ProductDTO;

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

    @GetMapping("/{id}")
    public List<ProductDTO> GetOrderProductByOrderId(@PathVariable("id") Long id){
        var result = ordersServices.getAllByOrderId(id);
        return result;
    }
    
    @PostMapping
    public OrderDTO addOrderProduct(@RequestBody OrderDTO order){
        return ordersServices.addOrder(order);
    }

    @PutMapping("/{id}")
    public OrderDTO updatOrderProduct(@PathVariable("id") Long id, @RequestBody OrderDTO order){
        return ordersServices.updateOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable("id") Long id){
        ordersServices.deleteOrder(id);
    }
}
