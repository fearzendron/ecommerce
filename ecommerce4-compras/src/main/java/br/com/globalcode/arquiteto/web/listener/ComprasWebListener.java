/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globalcode.arquiteto.web.listener;

import br.com.globalcode.arquiteto.web.registry.MenuRegistry;
import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import org.apache.log4j.Logger;

/**
 * Web application lifecycle listener.
 * @author Kleber
 */
@WebListener()
public class ComprasWebListener implements ServletContextListener {

    
    private final static Logger logger = Logger.getLogger(ComprasWebListener.class);
    
    @EJB
    MenuRegistry registry;
   
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("====================== Inicializando modulo de compras =============================");
        registry.addMenu("/includes/menu-compras.xhtml");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info("====================== Finalizando modulo de compras ================================");
    }
}
