package InventorySystem.DAO;

import java.util.List;

import InventorySystem.Entities.Warehouse;


public interface WarehouseDao {
	List<Warehouse> getAllStudents();

	Warehouse getWarehouseById(Long id);

	Warehouse addWarehouse(Warehouse warehouse);

	Warehouse updateWarehouse(Warehouse warehouse , long id);

	void deleteWarehouse(Long id);
}