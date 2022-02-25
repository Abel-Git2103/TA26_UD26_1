package mainAPP.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import mainAPP.dao.IPiezaDao;
import mainAPP.dto.Pieza;

@Service
public class PiezaServiceImpl implements IPiezaService {

	@Autowired
	IPiezaDao iPiezaDao;

	@Override
	public List<Pieza> listarPieza() {
		return iPiezaDao.findAll();
	}

	@Override
	public Pieza guardarPieza(Pieza pieza) {
		return iPiezaDao.save(pieza);
	}

	@Override
	public Pieza piezaXID(Integer id) {
		return iPiezaDao.findById(id).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		return iPiezaDao.save(pieza);
	}

	@Override
	public void eliminarPieza(Integer id) {
		iPiezaDao.deleteById(id);
	}
}
