package InventorySystem.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import InventorySystem.Entities.Warehouse;
@Repository
public class WarehouseDaoimpl implements WarehouseDao {
    private Map<Long, Warehouse> warehouseMap;

    public WarehouseDaoimpl() {
        this.warehouseMap = new HashMap<>();
    }

    @Override
    public List<Warehouse> getAllStudents() {
        return new ArrayList<>(warehouseMap.values());
    }

    @Override
    public Warehouse getWarehouseById(Long id) {
        return warehouseMap.get(id);
    }

    @Override
    public Warehouse addWarehouse(Warehouse warehouse) {
        warehouseMap.put(warehouse.getId(), warehouse);
        return warehouse;
    }

    @Override
    public Warehouse updateWarehouse(Warehouse warehouse, long id) {
        warehouseMap.put(id, warehouse);
        return warehouse;
    }

    @Override
    public void deleteWarehouse(Long id) {
        warehouseMap.remove(id);
    }
}
