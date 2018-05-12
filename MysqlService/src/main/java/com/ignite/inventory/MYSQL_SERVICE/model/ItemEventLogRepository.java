package com.ignite.inventory.MYSQL_SERVICE.model;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ignite.inventory.MYSQL_SERVICE.model.ItemEventLog;
public interface ItemEventLogRepository extends JpaRepository<ItemEventLog, Integer> {
	

}
