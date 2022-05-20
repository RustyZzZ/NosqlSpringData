package com.example.mongotest.labels;

import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Person {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@Relationship(type = "worker", direction = Relationship.Direction.INCOMING)
	private List<Company> company;



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Company> getCompany() {
		return company;
	}

	public void setCompany(List<Company> company) {
		this.company = company;
	}

	public Person() {
	}

	public Person(Long id, String name, List<Company> company) {
		this.id = id;
		this.name = name;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				",name='" + name + '\'';
	}
}
