package com.example.mongotest.labels;


import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
@Data
public class Company {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String desc;
	@Relationship(type = "worker", direction = Relationship.Direction.OUTGOING)
	private List<Person> person;


}
