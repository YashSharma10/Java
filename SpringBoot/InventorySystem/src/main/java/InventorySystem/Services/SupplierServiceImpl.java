package InventorySystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import InventorySystem.DAO.SupplierDao;
import InventorySystem.Entities.Supplie;
import InventorySystem.Services.SupplierService;
@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
    private SupplierDao supplierDao;

    public SupplierServiceImpl(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }

    @Override
    public List<Supplie> getAllSuppliers() {
        return supplierDao.getAllSupplier();
    }

    @Override
    public Supplie getInstructorById(long id) {
        return supplierDao.getSupplierById(id);
    }

    @Override
    public Supplie createSupplier(Supplie supplier) {
        supplierDao.addSupplier(supplier);
        return supplier;
    }

    @Override
    public Supplie updateSupplier(long id, Supplie supplier) {
        supplier.setId(id);
        supplierDao.updateSupplierr(supplier, id);
        return supplier;
    }

    @Override
    public void deleteSupplier(long id) {
        supplierDao.deleteSupplier(id);
    }
}
