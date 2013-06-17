package br.com.globalcode.arquiteto.web.converter;

import br.com.globalcode.arquiteto.model.BandeiraCartaoCredito;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass=BandeiraCartaoCredito.class)
public class ConversorBandeira implements Converter {

    private static final String NOME = "nomeBandeira=";
    private static final String ID = "idBandeira=";
    public ConversorBandeira() {
    }

    @Override
    public Object getAsObject(FacesContext facesContext,
                              UIComponent uIComponent, String novoValor) {        
        StringBuilder texto = new StringBuilder(novoValor);
        int posDescricao = texto.indexOf(NOME);
        int posId = texto.indexOf(ID);
        String nome = texto.substring(posDescricao + NOME.length(), posId-1);
        Integer id = new Integer(texto.substring(posId + ID.length(), texto.length()));        
        return new BandeiraCartaoCredito(id,nome);
    }

    @Override
    public String getAsString(FacesContext facesContext,
                              UIComponent uIComponent, Object object) {                              
        BandeiraCartaoCredito bandeira= (BandeiraCartaoCredito)object;
        return NOME+bandeira.getNome()+"&"+ID+bandeira.getId();
    }
}
