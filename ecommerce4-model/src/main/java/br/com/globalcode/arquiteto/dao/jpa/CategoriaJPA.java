package br.com.globalcode.arquiteto.dao.jpa;

import br.com.globalcode.arquiteto.dao.CategoriaDAO;
import br.com.globalcode.arquiteto.model.Categoria;
import javax.ejb.Stateful;
import javax.inject.Named;

@Named("categoriaDAO")
@Stateful
public class CategoriaJPA extends DaoSupport<Categoria,Integer>
        implements CategoriaDAO {
    
    @Override
    public void save(Categoria categoria) {
        super.save(categoria);
    }
    
    @Override
    public void delete(Categoria categoria) {
        super.delete(categoria);
    }
    
}
