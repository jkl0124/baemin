//package com.example.demo.user;
//
//import jakarta.persistence.EntityManager;
//import java.util.HashMap;
//import java.util.Map;
//import javax.sql.DataSource;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.datasource.DataSourceUtils;
//import org.springframework.stereotype.Repository;
//
//@Repository
//@Slf4j
//public class UserRepository implements UserRepositoryRepository {
//    Map<String,User> userMap = new HashMap<>();
//
//    @Autowired
//    DataSource dataSource;
//    @Autowired
//    EntityManager entityManager;
//
//
////    @Transactional
//    public void save(User user){
////        userMap.put(user.getUserId(),user);
//        entityManager.persist(user);
//    }
//    public User find(String userId){
//        return entityManager.find(User.class,userId);
//    }
//    public User putUser(Map<String,String> user){
//        User resultUser = userMap.get(user.get("userId"));
//        resultUser.setUserId(user.get("userId"));
//        resultUser.setEmail(user.get("email"));
//        resultUser.setPassword(user.get("password"));
//        return resultUser;
//    }
//
//    public User findByUserId(String userId){
//        return entityManager.createQuery("SELECT u FROM User AS u WHERE u.userId = :userid",User.class).setParameter("userid",userId).getSingleResult();
//    }
//    public User findById(int id){
//        return entityManager.find(User.class,id);
//    }
//    public void makeConnection(){
//        DataSourceUtils.getConnection(dataSource);
//    }
//}
