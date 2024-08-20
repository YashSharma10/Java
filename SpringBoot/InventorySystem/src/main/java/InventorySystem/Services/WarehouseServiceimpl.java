package InventorySystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import InventorySystem.DAO.WarehouseDao;
import InventorySystem.Entities.Warehouse;
import InventorySystem.Services.WarehouseService;
@Service
public class WarehouseServiceimpl implements WarehouseService {
	@Autowired
    private WarehouseDao warehouseDao;

    public WarehouseServiceimpl(WarehouseDao warehouseDao) {
        this.warehouseDao = warehouseDao;
    }

    @Override
    public List<Warehouse> getAllWarehouse() {
        return warehouseDao.getAllStudents();
    }

    @Override
    public Warehouse getWarehouseById(long id) {
        return warehouseDao.getWarehouseById(id);
    }

    @Override
    public Warehouse createWarehouse(Warehouse warehouse) {
        warehouseDao.addWarehouse(warehouse);
        return warehouse;
    }

    @Override
    public Warehouse updateWarehouse(long id, Warehouse warehouse) {
        warehouse.setId(id);
        warehouseDao.updateWarehouse(warehouse, id);
        return warehouse;
    }

    @Override
    public void deleteWarehouse(long id) {
        warehouseDao.deleteWarehouse(id);
    }
}
