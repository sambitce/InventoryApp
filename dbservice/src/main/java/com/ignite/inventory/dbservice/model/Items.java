package com.ignite.inventory.dbservice.model;


import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

/**
 * 
 * @author sam
 * CREATE TABLE IF NOT EXISTS  sample.items (

    item_number int,

    qty int,

    primary key((item_number))

);
insert into sample.items(item_number,qty) values (100,1)
 *
 */

@Table(value="items")
public class Items {

    
    @PrimaryKeyColumn(name="item_number" ,type = PrimaryKeyType.PARTITIONED)
    private Integer itemNumber;

    public Items(Integer itemNumber, Integer qty) {
        this.itemNumber = itemNumber;
        this.qty = qty;
    }

    public Integer getItemNumber() {

        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Column("qty")
    private Integer qty;


}
