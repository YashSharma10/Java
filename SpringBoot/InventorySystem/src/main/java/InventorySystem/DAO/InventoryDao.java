package InventorySystem.DAO;

import java.util.List;

import InventorySystem.Entities.Inventory;

public interface InventoryDao {
	List<Inventory> getAllInventory();

	Inventory getInventoryById(Long id);

	void addInventory(Inventory inventory);

	void updateInventory(Inventory inventory);

	void deleteInventory(Long id);
}