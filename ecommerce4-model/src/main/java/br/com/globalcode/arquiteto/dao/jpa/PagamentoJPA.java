package br.com.globalcode.arquiteto.dao.jpa;

import br.com.globalcode.arquiteto.dao.PagamentoDAO;
import br.com.globalcode.arquiteto.model.Pagamento;
import javax.ejb.Stateful;
import javax.inject.Named;

@Named("pagamentoDAO")
@Stateful
public class PagamentoJPA extends DaoSupport<Pagamento, Integer>
        implements PagamentoDAO {

    @Override
    public void save(Pagamento pagamento) {
        super.save(pagamento);
    }

    @Override
    public void delete(Pagamento pagamento) {
        super.delete(pagamento);
    }
}
