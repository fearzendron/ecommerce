package br.com.globalcode.arquiteto.web.controller;

import br.com.globalcode.arquiteto.comparator.ComparatorPedidoClienteNumero;
import br.com.globalcode.arquiteto.dao.PedidoDAO;
import br.com.globalcode.arquiteto.model.Pagamento;
import br.com.globalcode.arquiteto.model.PagamentoBoleto;
import br.com.globalcode.arquiteto.model.Pedido;
import br.com.globalcode.arquiteto.web.util.JSFHelper;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Named;

@Named("pedidoController")
@ConversationScoped
public class PedidoController implements Serializable{

    private List<Pedido> pedidos;
    private Pedido pedido;
    
    @EJB
    PedidoDAO pedidoDAO;

    public PedidoDAO getPedidoDAO() {
        return pedidoDAO;
    }

    public void setPedidoDAO(PedidoDAO pedidoDAO) {
        this.pedidoDAO = pedidoDAO;
    }
    
    

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isBoleto() {
        Pagamento pagamento = pedido.getPagamento();
        if (pagamento == null) {
            return false;
        } else {
            return pagamento instanceof PagamentoBoleto;
        }
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Pedido> getPedidos() {
        try {
            pedidos = (List<Pedido>) pedidoDAO.findAll();
            if (pedidos != null && pedidos.size() > 0) {
                Collections.sort(pedidos, new ComparatorPedidoClienteNumero());
            }
        } catch (Exception e) {
            e.printStackTrace();
            JSFHelper.addErrorMessage("Erro na listagem de pedidos" + e.getMessage());
        }
        return pedidos;
    }

    public String verDetalhes(Pedido pedido) {
        this.pedido = pedido;
        return "/pedido/View";
    }
}
