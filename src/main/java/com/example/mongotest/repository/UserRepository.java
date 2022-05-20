//package com.example.mongotest.repository;
//
//import com.example.mongotest.documents.User;
//import com.example.mongotest.projection.UserProjection;
//import org.bson.types.ObjectId;
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//import org.springframework.stereotype.Repository;
//
//import java.util.Optional;
//
////@Repository
//public interface UserRepository extends MongoRepository<User, ObjectId>, CustomUserRepository {
//
//    Optional<UserProjection> findUserByFirstNameAndLastName(String fistName, String lastName);
//
//    @Query(value = "{$and: [{firstName:?0}, {lastName:?1}]}")
//    User queryFindByFirstNameAndLastName(String fistName, String lastName);
//}
