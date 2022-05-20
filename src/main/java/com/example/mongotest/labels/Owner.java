//package com.example.mongotest.labels;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.neo4j.core.schema.GeneratedValue;
//
//@RelationshipEntity(type = "OWNER")
//public class Owner {
//    @Id
//    @GeneratedValue
//    private Long id;
//    @EndNode
//    private Company company;
//    @StartNode
//    private Person person;
//
//    public Owner() {
//    }
//
//    public Owner(Long id, Company company, Person person) {
//        this.id = id;
//        this.company = company;
//        this.person = person;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Owner(Company company, Person person) {
//        this.company = company;
//        this.person = person;
//    }
//
//    public Company getCompany() {
//        return company;
//    }
//
//    public void setCompany(Company company) {
//        this.company = company;
//    }
//
//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }
//
//    @Override
//    public String toString() {
//        return "Owner{" +
//                "company=" + company +
//                ", person=" + person +
//                '}';
//    }
//}
