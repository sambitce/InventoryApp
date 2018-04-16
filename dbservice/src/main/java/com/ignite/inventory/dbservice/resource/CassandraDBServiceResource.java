package com.ignite.inventory.dbservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ignite.inventory.dbservice.model.Items;

@RestController
@RequestMapping("/rest/cassandradb")
public class CassandraDBServiceResource {


	@Autowired
    ItemsRepository itemsRepository;

    @GetMapping("/{itemNumber}")
    public Integer getCurrentInventory(@PathVariable ("itemNumber") final Integer itemNumber){

    	System.out.println("Item number is " + itemNumber);
    	Items item = itemsRepository.findByitemNumber(itemNumber);
        return item.getQty();
    }
}
