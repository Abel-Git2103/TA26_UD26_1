package mainAPP.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import mainAPP.dto.Proveedor;

public interface IProveedorDao extends JpaRepository<Proveedor, Character>{

}
