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

import Reto2.BackEnd.Services.OrderProductsServices;
import Reto2.BackEnd.Services.Models.OrderProductDTO;

@RestController
@RequestMapping("orderProducts/v1")
public class OrderProductController {
    private final OrderProductsServices orderProductsServices;

    public OrderProductController(OrderProductsServices _orderProductsServices) {
        orderProductsServices = _orderProductsServices;
    }

    @GetMapping()
    public List<OrderProductDTO> GetOrders(){
        return orderProductsServices.getAll();
    }

    @PostMapping
    public OrderProductDTO addOrderProduct(@RequestBody OrderProductDTO orderProduct){
        return orderProductsServices.addOrderProduct(orderProduct);
    }

    @PutMapping("/{id}")
    public OrderProductDTO updatOrderProduct(@PathVariable("id") Long id, @RequestBody OrderProductDTO orderProduct){
        return orderProductsServices.updateOrderProduct(id, orderProduct);
    }

    @DeleteMapping("/{id}")
    public void deleteOrderProduct(@PathVariable("id") Long id){
        orderProductsServices.deleteOrderProduct(id);
    }

    
}
