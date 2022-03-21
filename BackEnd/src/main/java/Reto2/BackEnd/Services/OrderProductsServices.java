package Reto2.BackEnd.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import Reto2.BackEnd.Repositories.Entities.OrderProductEntity;
import Reto2.BackEnd.Repositories.Interfaces.OrderProductRepository;
import Reto2.BackEnd.Services.Models.OrderProductDTO;

public class OrderProductsServices {
    @Autowired
    private OrderProductRepository orderProductRepository;
    @Autowired
    private ModelMapper modelMapper;

    public List<OrderProductDTO> getAll() {
        return orderProductRepository.findAll().stream().map(x -> modelMapper.map(x, OrderProductDTO.class))
                .collect(Collectors.toList());
    }

<<<<<<< Updated upstream
    public OrderProductDTO addOrder(OrderProductDTO orderProduct){
=======
    public OrderProductDTO add(OrderProductDTO orderProduct) {
>>>>>>> Stashed changes
        OrderProductEntity orderProductToAdd = modelMapper.map(orderProduct, OrderProductEntity.class);
        OrderProductEntity result = orderProductRepository.save(orderProductToAdd);
        return modelMapper.map(result, OrderProductDTO.class);
    }

<<<<<<< Updated upstream
    public OrderProductDTO updateOrder(Long Id, OrderProductDTO orderProduct){
=======
    public OrderProductDTO update(Long Id, OrderProductDTO orderProduct) {
>>>>>>> Stashed changes
        OrderProductEntity orderProductToUpdate = modelMapper.map(orderProduct, OrderProductEntity.class);
        orderProductToUpdate.setId(Id);
        OrderProductEntity result = orderProductRepository.save(orderProductToUpdate);
        return modelMapper.map(result, OrderProductDTO.class);
    }

<<<<<<< Updated upstream
    public void deleteOrder(Long Id){
=======
    public void deleteOrderProduct(Long Id) {
>>>>>>> Stashed changes
        Optional<OrderProductEntity> entityToDelete = orderProductRepository.findById(Id);
        if (entityToDelete.isPresent()) {
            orderProductRepository.delete(entityToDelete.get());
        }
    }

    public Optional<OrderProductDTO> findById(Long id) {
        Optional<OrderProductEntity> entity = orderProductRepository.findById(id);
        if (entity.isPresent()) {
            return Optional.of(modelMapper.map(entity.get(), OrderProductDTO.class));
        }
        return Optional.empty();
    }
}
