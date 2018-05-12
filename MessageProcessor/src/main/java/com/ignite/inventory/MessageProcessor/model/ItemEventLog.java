package com.ignite.inventory.MessageProcessor.model;

import java.time.LocalDateTime;

//import java.sql.LocalDateTime;

/** Table 
 * 
CREATE TABLE IF NOT EXISTS  sample.item_event_log (

    id UUID,

    eventName varchar,

    DC int,

    itemNumber int,

    qty int,

    primary key((id))

);

 */

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("item_event_log")
public class ItemEventLog {

	private static final long serialVersionUID=1;

	@PrimaryKey
	private UUID id ;
	
	@Column("business_unit")
	private String businessUnit;
	@Column("business_unit_number")
	private Integer businessUnitNumber;
	@Column("event_name")
	private String eventName;
	@Column("item_number")
	private Integer itemNumber ;
	@Column("qty")
	private Integer qty ;
	@Column("event_trigger_Ts")
	private LocalDateTime eventTriggerTs;
	public ItemEventLog(UUID id, String businessUnit, Integer businessUnitNumber, String eventName, Integer itemNumber,
			Integer qty, LocalDateTime eventTriggerTs) {
		super();
		this.id = id;
		this.businessUnit = businessUnit;
		this.businessUnitNumber = businessUnitNumber;
		this.eventName = eventName;
		this.itemNumber = itemNumber;
		this.qty = qty;
		this.eventTriggerTs = eventTriggerTs;
	}
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
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
