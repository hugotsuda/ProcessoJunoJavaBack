package br.com.bb.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.bb.entity.CategoryEntity;
import br.com.bb.entity.ProductEntity;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {

	
	public List<ProductEntity> findByCategory(@Param("category") CategoryEntity category);
}
