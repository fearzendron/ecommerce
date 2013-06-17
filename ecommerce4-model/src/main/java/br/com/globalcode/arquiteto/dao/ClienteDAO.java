package br.com.globalcode.arquiteto.dao;

import br.com.globalcode.arquiteto.model.Cliente;
import java.util.Collection;

public interface ClienteDAO {
    public void delete(Cliente cliente) throws DAOException;

    public Collection<Cliente> findAll() throws DAOException;

    public Cliente findByEmail(String email) throws DAOException;

    public Collection<Cliente> findByNome(String nome) throws DAOException;

    public Cliente findByPrimaryKey(Integer id) throws DAOException;

    public void save(Cliente cliente) throws DAOException;
    
}
