package Reto2.BackEnd.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import Reto2.BackEnd.Repositories.Entities.OrderEntity;
import Reto2.BackEnd.Repositories.Entities.OrderProductEntity;
import Reto2.BackEnd.Repositories.Entities.ProductEntity;
import Reto2.BackEnd.Repositories.Interfaces.OrderProductRepository;
import Reto2.BackEnd.Repositories.Interfaces.OrderRepository;
import Reto2.BackEnd.Services.Models.OrderDTO;
import Reto2.BackEnd.Services.Models.OrderProductDTO;
import Reto2.BackEnd.Services.Models.ProductDTO;

public class OrdersServices {
    @Autowired
    private OrderRepository orderRespository;
    @Autowired
    private OrderProductRepository orderProductRespository;
    @Autowired
    private ModelMapper modelMapper;

    public List<OrderDTO> getAll(){
        return orderRespository.findAll().stream().map(x -> modelMapper.map(x, OrderDTO.class)).collect(Collectors.toList());
    }

    public OrderDTO addOrder(OrderDTO order){
        OrderEntity orderToAdd = modelMapper.map(order, OrderEntity.class);
        OrderEntity result = orderRespository.save(orderToAdd);
        return modelMapper.map(result, OrderDTO.class);
    }

    public OrderDTO updateOrder(Long Id, OrderDTO order){
        OrderEntity orderToUpdate = modelMapper.map(order, OrderEntity.class);
        orderToUpdate.setId(Id);
        OrderEntity result = orderRespository.save(orderToUpdate);
        return modelMapper.map(result, OrderDTO.class);
    }

    public void deleteOrder(Long Id){
        Optional<OrderEntity> entityToDelete = orderRespository.findById(Id);
        if (entityToDelete.isPresent()){
            orderRespository.delete(entityToDelete.get());
        }
    }

    // public List<OrderProductDTO> findByOrderId(Long id) {
    //     return orderProductRespository.findByOrderId(id).stream().map(x -> modelMapper.map(x, OrderProductDTO.class))
    //         .collect(Collectors.toList());
    // }

    public List<ProductDTO> getAllByOrderId(Long id) {
        return orderProductRespository.getAllByOrderId(id).stream().map(x -> new ProductDTO(
                modelMapper.map((ProductEntity)x[1], ProductDTO.class), 
                (int)x[0]
            )).collect(Collectors.toList());
    }
    
}
