package mainAPP.service;

import java.util.List;

import mainAPP.dto.Proveedor;

public interface IProveedorService {

	public List<Proveedor> listarProveedor(); //Listar All 
	
	public Proveedor guardarProveedor(Proveedor proveedor);	//Guarda un proveedor CREATE
	
	public Proveedor proveedorXID(Character id); //Leer datos de un proveedor READ
		
	public Proveedor actualizarProveedor(Proveedor proveedor); //Actualiza datos de un proveedor UPDATE
	
	public void eliminarProveedor(Character id);// Elimina el proveedor DELETE
}
