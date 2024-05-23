package com.example.demo.product;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    @Transactional
    public Product save(Product product){
        productRepository.save(product);
        Optional<Product> product1 = productRepository.findByName(product.getName());
        return product1.orElse(null);
    }
    @Transactional
    public Product findById(int id){
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null);
    }
    @Transactional
    public List<Product> findProductsById(int page,int size){

    }

//    public Product findProductById(int id){
//        return productRepository.findProductById(id);
//    }
//    public List<Product> findProducts(int size,int page){return productRepository.findProducts(size,page);}
//    public List<Product> findProductsByCategory(int size,int page,int categoryId){return productRepository.findProductsByCategory(size,page,categoryId);}
//    public boolean deleteProductById(int id){return productRepository.deleteById(id);}
//    public boolean deleteProductByIds(List<Integer> list){return productRepository.deleteByIds(list);}
//    public List<Product> findProductsByCategory(int size, int page,int category){return productRepository.findProductsByCategory(size,page,category);}
}
