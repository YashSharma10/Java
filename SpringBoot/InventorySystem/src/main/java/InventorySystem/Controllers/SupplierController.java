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

import InventorySystem.Entities.Supplie;
import InventorySystem.Services.SupplierService;

@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @GetMapping("/all")
    public List<Supplie> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    @GetMapping("/{id}")
    public Supplie getSupplierById(@PathVariable long id) {
        return supplierService.getInstructorById(id);
    }

    @PostMapping("/add")
    public Supplie createSupplier(@RequestBody Supplie supplier) {
        return supplierService.createSupplier(supplier);
    }

    @PutMapping("/update/{id}")
    public Supplie updateSupplier(@PathVariable long id, @RequestBody Supplie supplier) {
        return supplierService.updateSupplier(id, supplier);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSupplier(@PathVariable long id) {
        supplierService.deleteSupplier(id);
    }
}
