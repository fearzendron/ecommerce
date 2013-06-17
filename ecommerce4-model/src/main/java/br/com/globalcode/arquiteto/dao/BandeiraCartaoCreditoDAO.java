package br.com.globalcode.arquiteto.dao;

import br.com.globalcode.arquiteto.model.BandeiraCartaoCredito;
import java.util.List;

public interface BandeiraCartaoCreditoDAO {
    void delete(BandeiraCartaoCredito bandeira);

    List getAll();

    BandeiraCartaoCredito getByPrimaryKey(Integer id);

    void save(BandeiraCartaoCredito bandeira);
    
}
