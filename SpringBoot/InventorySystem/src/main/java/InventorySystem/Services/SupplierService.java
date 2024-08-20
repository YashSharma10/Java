package InventorySystem.Services;

import java.util.List;

import InventorySystem.Entities.Supplie;

public interface SupplierService {
    List<Supplie> getAllSuppliers();

    Supplie getInstructorById(long id);

    Supplie createSupplier(  Supplie   supplier);

    Supplie updateSupplier(long id,   Supplie   supplier);

    void deleteSupplier(long id);
}