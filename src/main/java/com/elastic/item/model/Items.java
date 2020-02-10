package com.elastic.item.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="items",type="item",shards=5)
public class Items {
	@Id
	int id;
	String name;
	String type;
	int cost;
	public Items() {}
	public Items(int id,String name, String type, int cost) {
		super();
		this.id=id;
		this.name = name;
		this.type = type;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
}
