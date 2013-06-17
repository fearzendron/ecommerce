package br.com.globalcode.arquiteto.dao;


import br.com.globalcode.arquiteto.model.Banco;
import java.util.List;

public interface BancoDAO {
    void delete(Banco banco);

    List getAll();

    Banco getByPrimaryKey(Integer id);

    void save(Banco banco);
    
}
