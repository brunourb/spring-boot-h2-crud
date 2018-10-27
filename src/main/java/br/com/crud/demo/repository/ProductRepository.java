package br.com.crud.demo.repository;

import br.com.crud.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends
        JpaRepository<Product,Integer> {

    List<Product> findProductsByName(Integer id);

}
