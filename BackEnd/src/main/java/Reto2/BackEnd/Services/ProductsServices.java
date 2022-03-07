package Reto2.BackEnd.Services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import Reto2.BackEnd.Repositories.Entities.ProductEntity;
import Reto2.BackEnd.Repositories.Interfaces.ProductRespository;
import Reto2.BackEnd.Services.Models.ProductDTO;

public class ProductsServices {
    @Autowired
    private ProductRespository productRespository;
    @Autowired
    private ModelMapper modelMapper;

    public List<ProductDTO> getAll(){
        return productRespository.findAll().stream().map(x -> modelMapper.map(x, ProductDTO.class)).collect(Collectors.toList());
    }

    public ProductDTO addProduct(ProductDTO product){
        ProductEntity productToAdd = modelMapper.map(product, ProductEntity.class);
        ProductEntity result = productRespository.save(productToAdd);
        return modelMapper.map(result, ProductDTO.class);
    }

    public ProductDTO updateProduct(Long Id, ProductDTO product){
        ProductEntity productToUpdate = modelMapper.map(product, ProductEntity.class);
        productToUpdate.setId(Id);
        ProductEntity result = productRespository.save(productToUpdate);
        return modelMapper.map(result, ProductDTO.class);
    }

    public void deleteProduct(Long Id){
        Optional<ProductEntity> entityToDelete = productRespository.findById(Id);
        if (entityToDelete.isPresent()){
            productRespository.delete(entityToDelete.get());
        }
    }
}