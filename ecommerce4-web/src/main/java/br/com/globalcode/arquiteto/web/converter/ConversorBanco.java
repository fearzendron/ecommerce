package br.com.globalcode.arquiteto.web.converter;

import br.com.globalcode.arquiteto.model.Banco;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass=Banco.class)
public class ConversorBanco implements Converter {

    private static final String NOME = "nomeBanco=";
    private static final String ID = "idBanco=";
    
    public ConversorBanco() {
    }

    @Override
    public Object getAsObject(FacesContext facesContext,
                              UIComponent uIComponent, String novoValor) {        
        StringBuilder texto = new StringBuilder(novoValor);
        int posDescricao = texto.indexOf(NOME);
        int posId = texto.indexOf(ID);
        String nome = texto.substring(posDescricao + NOME.length(), posId-1);
        Integer id = new Integer(texto.substring(posId + ID.length(), texto.length()));        
        return new Banco(id,nome);
    }

    @Override
    public String getAsString(FacesContext facesContext,
                              UIComponent uIComponent, Object object) {                              
        Banco banco= (Banco)object;
        return NOME+banco.getNome()+"&"+ID+banco.getId();

    }
}
