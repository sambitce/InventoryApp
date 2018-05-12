package com.ignite.inventory.MYSQL_SERVICE.model;

import java.sql.Timestamp;
/**
CREATE TABLE item_event_log (
	    id 	INT NOT NULL AUTO_INCREMENT,
	businessUnit varchar(100),
	businessUnitNumber int,
	    eventName varchar(100),
	    itemNumber int,
	    qty int,
	    primary key(id)
	);

***/
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item_event_log")
public class ItemEventLog {

	private static final long serialVersionUID = 1;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	
	private String businessUnit;

	private Integer businessUnitNumber;

	private String eventName;

	private Integer itemNumber;

	private Integer qty;

	private LocalDateTime eventTriggerTs;

	public ItemEventLog(Integer id, String businessUnit, Integer businessUnitNumber, String eventName,
			Integer itemNumber, Integer qty, LocalDateTime eventTriggerTs) {
		super();
		this.id = id;
		this.businessUnit = businessUnit;
		this.businessUnitNumber = businessUnitNumber;
		this.eventName = eventName;
		this.itemNumber = itemNumber;
		this.qty = qty;
		this.eventTriggerTs = eventTriggerTs;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public Integer getBusinessUnitNumber() {
		return businessUnitNumber;
	}

	public void setBusinessUnitNumber(Integer businessUnitNumber) {
		this.businessUnitNumber = businessUnitNumber;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
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

	public LocalDateTime getEventTriggerTs() {
		return eventTriggerTs;
	}

	public void setEventTriggerTs(LocalDateTime eventTriggerTs) {
		this.eventTriggerTs = eventTriggerTs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
