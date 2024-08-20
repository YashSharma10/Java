package InventorySystem.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import InventorySystem.Entities.Inventory;
@Repository
public class InventoryDaoimpl implements InventoryDao {
    private Map<Long, Inventory> inventoryMap;

    public InventoryDaoimpl() {
        this.inventoryMap = new HashMap<>();
    }

    @Override
    public List<Inventory> getAllInventory() {
        return new ArrayList<>(inventoryMap.values());
    }

    @Override
    public Inventory getInventoryById(Long id) {
        return inventoryMap.get(id);
    }

    @Override
    public void addInventory(Inventory inventory) {
        inventoryMap.put(inventory.getId(), inventory);
    }

    @Override
    public void updateInventory(Inventory inventory) {
        inventoryMap.put(inventory.getId(), inventory);
    }

    @Override
    public void deleteInventory(Long id) {
        inventoryMap.remove(id);
    }
}
