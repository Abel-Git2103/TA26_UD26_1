package mainAPP.service;

import java.util.List;

import mainAPP.dto.Suministra;

public interface ISuministraService {

	public List<Suministra> listarSuministra(); //Listar All 
	
	public Suministra guardarSuministra(Suministra suministra);	//Guarda suministra CREATE
	
	public Suministra suministraXID(Integer id); //Leer datos de suministra READ
		
	public Suministra actualizarSuministra(Suministra suministra); //Actualiza datos de suministra UPDATE
	
	public void eliminarSuministra(Integer id);// Elimina suministra DELETE
}
