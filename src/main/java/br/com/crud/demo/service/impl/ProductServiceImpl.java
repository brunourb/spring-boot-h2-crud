package br.com.crud.demo.service.impl;

import br.com.crud.demo.model.Product;
import br.com.crud.demo.repository.ProductRepository;
import br.com.crud.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired //injetando dependência da camada de persistencia
    ProductRepository productRepository;

    @Override
    public Product post(Product entity) {
        Product p = productRepository.save(entity);
        return p;
    }

    @Override
    public List<Product> get() {
        return productRepository.findAll();
    }

    @Override
    public void put(Product entity) {
        productRepository.save(entity);

    }

    @Override
    public void delete(Product entity) {
        productRepository.delete(entity);

    }

    public List<Product> findProductsByName(Integer id){
        return productRepository.findProductsByName(id);
    }
}
