package InventorySystem.DAO;

import java.util.List;
import InventorySystem.Entities.Supplie;




	

	public interface SupplierDao {
		List<Supplie> getAllSupplier();

		Supplie getSupplierById(Long id);

		Supplie addSupplier(Supplie supplier);

		Supplie updateSupplierr(Supplie supplier, long id);

		void deleteSupplier(Long id);
	}

