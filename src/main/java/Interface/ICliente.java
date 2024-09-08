package Interface;

import java.util.List;

import Entidad.Cliente;

public interface ICliente {
	   Cliente crearCliente(Cliente cliente);
	    List<Cliente> listarClientes();
	    Cliente obtenerClientePorId(Long id);
	    Cliente actualizarCliente(Long id, Cliente cliente);
	    void eliminarCliente(Long id);
}
