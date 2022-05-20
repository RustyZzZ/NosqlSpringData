package com.example.mongotest;

//import com.example.mongotest.repository.CompanyRepository;

import com.example.mongotest.labels.Company;
import com.example.mongotest.labels.Person;
import com.example.mongotest.repository.CompanyRepository;
import com.example.mongotest.services.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.core.Neo4jTemplate;

import java.util.List;

@SpringBootApplication
public class MongoTestApplication implements CommandLineRunner {
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private CompanyRepository companyRepository;


//    @Autowired
//    private Neo4jTemplate neo4jTemplate;

    //    @Autowired
//    private RedisUserRepository repository;
    @Autowired
    private DataService ds;


    public static void main(String[] args) {
        SpringApplication.run(MongoTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //6270c69292fd74234be4ff14
//        User user = new User(null, "Rostyslav", "Diachuk", 24);
//        userRepository.save(user);

//        UserProjection user = userRepository.findUserByFirstNameAndLastName("Rostyslav", "Diachuk").orElseThrow();
//        System.out.println(user);


        /*User user = userRepository.queryFindByFirstNameAndLastName("Rostyslav", "Diachuk");
        System.out.println("user = " + user);*/


//        System.out.println("userRepository.findSomethingBySomething() = " + userRepository.findSomethingBySomething());
//        var user = new User();
//        user.setId(2);
//        user.setFirstName("FirstName");
//        user.setLastName("LastName");
//        user.setAge(10L);
//
//        repository.save(user);
//
//        var user1 = new User();
//        user.setId(3);
//        user.setFirstName("FirstName");
//        user.setLastName("LastName");
//        user.setAge(10L);
//
//        repository.save(user1);

//
//        var company = new Company();
//        company.setDesc("MyDesc");
//        company.setName("My Company");
//        var person = new Person();
//        person.setName("Best worker");
//        person.setCompany(List.of(company));
//        company.setPerson(List.of(person));
//        companyRepository.save(company);
//
//        companyRepository.findCompanyByName("My Company");

        ds.process();
        ds.process();
        ds.process();
        ds.process();
        ds.process();
    }
}
