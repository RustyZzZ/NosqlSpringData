//package com.example.mongotest.repository;
//
//import com.example.mongotest.documents.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mongodb.core.MongoTemplate;
//import org.springframework.data.mongodb.core.query.Criteria;
//import org.springframework.data.mongodb.core.query.Query;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
////@Repository
//public class CustomUserRepositoryImpl implements CustomUserRepository{
//
////    @Autowired
//    private MongoTemplate mongoTemplate;
//    @Override
//    public User findSomethingBySomething() {
//        int age = 24;
//        Query query = new Query(Criteria.where("age").is(age));
//        query.limit(1);
//       return mongoTemplate.findOne(query, User.class);
//    }
//}
