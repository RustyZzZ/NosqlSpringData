package com.example.mongotest.repository;

import com.example.mongotest.labels.Company;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends Neo4jRepository<Company, Long> {
    @Query("MATCH (c:Company {name: $companyName})-[Worker]->(p:Person) RETURN *")
    List<Company> findCompanyByName1(String companyName);


    List<Company> findCompanyByName(String companyName);
}
