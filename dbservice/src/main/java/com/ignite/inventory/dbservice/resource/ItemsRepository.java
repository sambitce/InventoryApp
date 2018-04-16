package com.ignite.inventory.dbservice.resource;


import com.ignite.inventory.dbservice.model.Items;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ItemsRepository extends CassandraRepository<Items,Integer> {

     Items findByitemNumber(Integer itemNumber);
}
