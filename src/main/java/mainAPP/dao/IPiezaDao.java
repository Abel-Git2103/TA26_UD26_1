package mainAPP.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import mainAPP.dto.Pieza;

public interface IPiezaDao extends JpaRepository<Pieza, Integer> {

}
