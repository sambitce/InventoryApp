package com.ignite.inventory.EventGateway.model;

import java.sql.Timestamp;

public class ItemEvent {

		private String businessUnit;
		private Integer businessUnitNumber;
		private String eventName;
		private Integer itemNumber ;
		private Integer qty ;
		private Timestamp event_trigger_Ts;
		
		
		public ItemEvent(String businessUnit, Integer businessUnitNumber, String eventName, Integer itemNumber,
				Integer qty, Timestamp event_trigger_Ts) {
			super();
			this.businessUnit = businessUnit;
			this.businessUnitNumber = businessUnitNumber;
			this.eventName = eventName;
			this.itemNumber = itemNumber;
			this.qty = qty;
			this.event_trigger_Ts = event_trigger_Ts;
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
		public Timestamp getEvent_trigger_Ts() {
			return event_trigger_Ts;
		}
		public void setEvent_trigger_Ts(Timestamp event_trigger_Ts) {
			this.event_trigger_Ts = event_trigger_Ts;
		}	
		
		
		
}
