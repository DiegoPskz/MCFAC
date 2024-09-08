package Implementacion;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import Entidad.Cliente;
import Interface.ICliente;


public class ClienteImpl implements ICliente {
	
	private List<Cliente> clientes = new ArrayList<>();
    private AtomicLong counter = new AtomicLong();

	@Override
	public Cliente crearCliente(Cliente cliente) {
		 cliente.setId(counter.incrementAndGet());
	        clientes.add(cliente);
	        return cliente;
	}

	@Override
	public List<Cliente> listarClientes() {
		 return clientes;
	}

	@Override
	public Cliente obtenerClientePorId(Long id) {
		  return clientes.stream()
	                .filter(c -> c.getId().equals(id))
	                .findFirst()
	                .orElseThrow(null);
	}

	@Override
	public Cliente actualizarCliente(Long id, Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarCliente(Long id) {
		// TODO Auto-generated method stub
		
	}

}
