//package com.elastic.item.load;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.elastic.item.model.Items;
//import com.elastic.item.repository.ItemsRepository;
//
//import javax.annotation.PostConstruct;
//import java.util.ArrayList;
//import java.util.List;
//@Component
//public class Loaders {
//
//    @Autowired
//    ElasticsearchOperations operations;
//
//    @Autowired
//    ItemsRepository usersRepository;
//
//    @PostConstruct
//    @Transactional
//    public void loadAll(){
//
//        operations.putMapping(Items.class);
//        System.out.println("Loading Data");
//        usersRepository.save(getData());
//        System.out.printf("Loading Completed");
//
//    }
//
//    private List<Items> getData() {
//        List<Items> userses = new ArrayList<>();
//        userses.add(new Items(2,"Fan","home",2321));
//        userses.add(new Items(3,"Electronics","Bulb",123));
//        return userses;
//    }
//}
