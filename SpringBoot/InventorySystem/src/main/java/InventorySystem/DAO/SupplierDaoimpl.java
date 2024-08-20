package InventorySystem.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import InventorySystem.Entities.Supplie;
@Repository
public class SupplierDaoimpl implements SupplierDao {
    private Map<Long, Supplie> supplierMap;

    public SupplierDaoimpl() {
        this.supplierMap = new HashMap<>();
    }

    @Override
    public List<Supplie> getAllSupplier() {
        return new ArrayList<>(supplierMap.values());
    }

    @Override
    public Supplie getSupplierById(Long id) {
        return supplierMap.get(id);
    }

    @Override
    public Supplie addSupplier(Supplie supplier) {
        supplierMap.put(supplier.getId(), supplier);
        return supplier;
    }

    @Override
    public Supplie updateSupplierr(Supplie supplier, long id) {
        supplierMap.put(id, supplier);
        return supplier;
    }

    @Override
    public void deleteSupplier(Long id) {
        supplierMap.remove(id);
    }
}
