/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globalcode.arquiteto.web.util;

import br.com.globalcode.arquiteto.web.registry.MenuRegistry;
import java.util.Set;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author Kleber
 */
@Named
@ApplicationScoped
public class MenuController {
    
    @EJB
    private MenuRegistry registry;
    
    public Set<String> getMenus() {
        return registry.getMenus();
    }
}
