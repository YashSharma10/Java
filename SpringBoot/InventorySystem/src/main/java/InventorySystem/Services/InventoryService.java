package InventorySystem.Services;

import java.util.List;

import InventorySystem.Entities.Inventory;


public interface InventoryService {
    List<Inventory> getAllInventory();

    Inventory getInventoryById(long id);

    Inventory createInventory(Inventory inventory);

    Inventory updateInventory(long id, Inventory inventory);

    void deleteinventory(long id);
}