package com.music.store.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.music.store.daos.ProductDao;
import com.music.store.entities.Product;
import com.music.store.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Transactional
    public List<Product> findAll() {
        return productDao.findAll();
    }

    public Product findId(long id) {
        return null;
    }

    public Product findBy(String field, Object value) {
        return null;
    }

    public List<Product> search(String keyword) {
        return null;
    }

    public boolean insert(Product product) {
        return false;
    }

    public boolean update(Product product) {
        return false;
    }

    public boolean delete(Product product) {
        return false;
    }
}
