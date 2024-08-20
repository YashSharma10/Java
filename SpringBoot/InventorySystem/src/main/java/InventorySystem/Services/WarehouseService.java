package InventorySystem.Services;

import java.util.List;

import InventorySystem.Entities.Warehouse;


public interface WarehouseService {
	List<Warehouse> getAllWarehouse();

	Warehouse getWarehouseById(long id);

	Warehouse createWarehouse(Warehouse warehouse);

	Warehouse updateWarehouse(long id, Warehouse warehouse);

	void deleteWarehouse(long id);
} 