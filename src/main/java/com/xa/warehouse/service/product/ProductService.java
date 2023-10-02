package com.xa.warehouse.service.product;

import com.xa.warehouse.mapper.product.ProductMapper;
import com.xa.warehouse.repository.ProductRepository;
import com.xa.warehouse.service.AbstractService;

public class ProductService extends AbstractService<ProductMapper, ProductRepository> {


    public ProductService(ProductMapper mapper, ProductRepository repository) {
        super(mapper, repository);
    }
}
