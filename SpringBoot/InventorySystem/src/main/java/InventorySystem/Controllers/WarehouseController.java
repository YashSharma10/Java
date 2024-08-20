package InventorySystem.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import InventorySystem.Entities.Warehouse;
import InventorySystem.Services.WarehouseService;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {
    @Autowired
    private WarehouseService warehouseService;

    @GetMapping("/all")
    public List<Warehouse> getAllWarehouse() {
        return warehouseService.getAllWarehouse();
    }

    @GetMapping("/{id}")
    public Warehouse getWarehouseById(@PathVariable long id) {
        return warehouseService.getWarehouseById(id);
    }

    @PostMapping("/add")
    public Warehouse createWarehouse(@RequestBody Warehouse warehouse) {
        return warehouseService.createWarehouse(warehouse);
    }

    @PutMapping("/update/{id}")
    public Warehouse updateWarehouse(@PathVariable long id, @RequestBody Warehouse warehouse) {
        return warehouseService.updateWarehouse(id, warehouse);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteWarehouse(@PathVariable long id) {
        warehouseService.deleteWarehouse(id);
    }
}
