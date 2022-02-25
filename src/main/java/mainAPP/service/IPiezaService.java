package mainAPP.service;

import java.util.List;

import mainAPP.dto.Pieza;

public interface IPiezaService {

	public List<Pieza> listarPieza(); //Listar All 
	
	public Pieza guardarPieza(Pieza pieza);	//Guarda una pieza CREATE
	
	public Pieza piezaXID(Integer id); //Leer datos de una pieza READ
		
	public Pieza actualizarPieza(Pieza pieza); //Actualiza datos de una pieza UPDATE
	
	public void eliminarPieza(Integer id);// Elimina la pieza DELETE
}
