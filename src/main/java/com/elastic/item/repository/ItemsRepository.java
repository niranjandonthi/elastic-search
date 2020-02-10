package com.elastic.item.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.elastic.item.model.Items;
@Repository
public interface ItemsRepository extends ElasticsearchRepository<Items,Integer> {
	
}
