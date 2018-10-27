package br.com.crud.demo.controller;

import br.com.crud.demo.interfaces.GenericOperations;
import br.com.crud.demo.model.Product;
import br.com.crud.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Fala que o controlador vai trabalhar com REST
@RequestMapping(path = "/product")
public class ProductController implements GenericOperations<Product> {

    @Autowired //injetando dependência da camada de serviço
    public ProductService productService;

    /**
     * Consumes é o que o serviço vai receber (json ou xml)
     * Produces é o que o serviço vai entregar (json ou xml)
     * @param entity
     * @return
     */
    @Override
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE}
    )
    public Product post(@RequestBody Product entity) {
        return productService.post(entity);
    }

    @Override
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public List<Product> get() {
        return productService.get();
    }

    @Override
    @PutMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public void put(@RequestBody Product entity) {
        productService.put(entity);
    }

    @Override
    @DeleteMapping(consumes = {MediaType.APPLICATION_JSON_VALUE,
            MediaType.APPLICATION_XML_VALUE})
    public void delete(@RequestBody Product entity) {
        productService.delete(entity);
    }
}
