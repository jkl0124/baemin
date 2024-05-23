//package com.example.demo.product;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class ProductRepository {
//    Map<Integer,Product> product_table = new HashMap<>();
//
//    int id = 0;
//    public Product findProductById(int id){
//        return product_table.get(id);
//    }
//
//    public Product save(Product product){
////        product.setId(id++);
////        product_table.put(product.getId(),product);
//
//        return product_table.get(product.getId());
//    }
//
//    public List<Product> findProducts(int size,int page){
//        List<Product> list = new ArrayList<>();
//        for(int i=size*(page-1);i<size*(page-1)+size;i++){
//            list.add(product_table.get(i));
//        }
//
//        return list;
//    }
//
//    public List<Product> findProductsByCategory(int size , int page , int category){
//        List<Product> list = new ArrayList<>();
//        int tempKey = 0;
//        for(int i=0;i< product_table.size();i++){
//            if(product_table.get(i).getCategory()==category){
//                tempKey++;
//                if(tempKey>size*(page-1)&&tempKey<=size*(page-1)+size)
//                    list.add(product_table.get(i));
//                if(tempKey>=size*(page-1)+size)
//                    break;
//            }
//        }
//        return list;
//    }
//
//    public boolean deleteById(int id){
//        product_table.remove(id);
//        if(product_table.get(id)==null)
//            return true;
//        else
//            return false;
//    }
//    public boolean deleteByIds(List<Integer> list){
//        for(int i=0;i<list.size();i++){
//            product_table.remove(list.get(i));
//        }
//        return true;
//    }
//}
