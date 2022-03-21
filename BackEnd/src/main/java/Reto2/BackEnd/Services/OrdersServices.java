package Reto2.BackEnd.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import Reto2.BackEnd.Repositories.Entities.OrderEntity;
import Reto2.BackEnd.Repositories.Interfaces.OrderRepository;
import Reto2.BackEnd.Services.Models.OrderDTO;

public class OrdersServices {
    @Autowired
    private OrderRepository orderRespository;
    @Autowired
    private ModelMapper modelMapper;

    public List<OrderDTO> getAll(){
        return orderRespository.findAll().stream().map(x -> modelMapper.map(x, OrderDTO.class)).collect(Collectors.toList());
    }

    public OrderDTO add(OrderDTO order){
        OrderEntity orderToAdd = modelMapper.map(order, OrderEntity.class);
        OrderEntity result = orderRespository.save(orderToAdd);
        return modelMapper.map(result, OrderDTO.class);
    }

    public OrderDTO update(Long Id, OrderDTO order){
        OrderEntity orderToUpdate = modelMapper.map(order, OrderEntity.class);
        orderToUpdate.setId(Id);
        OrderEntity result = orderRespository.save(orderToUpdate);
        return modelMapper.map(result, OrderDTO.class);
    }

    public void delete(Long Id){
        Optional<OrderEntity> entityToDelete = orderRespository.findById(Id);
        if (entityToDelete.isPresent()){
            orderRespository.delete(entityToDelete.get());
        }
    }
<<<<<<< Updated upstream
=======

    public List<ProductDTO> getAllByOrderId(Long id) {
        return orderProductRespository.getAllByOrderId(id).stream().map(x -> new ProductDTO(
                modelMapper.map((ProductEntity)x[1], ProductDTO.class), 
                (int)x[0]
            )).collect(Collectors.toList());
    }
    
>>>>>>> Stashed changes
}
