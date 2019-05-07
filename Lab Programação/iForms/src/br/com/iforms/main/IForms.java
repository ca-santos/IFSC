/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iforms.main;

import br.com.iforms.views.Dashboard;
import br.com.iforms.views.FrameManager;
import br.com.iforms.views.Main;
import br.com.iforms.views.CreateAndUpdate_old;
import br.com.iforms.views.ain;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Aluno
 */
public class IForms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {

                    //INICIA O LOOK AND FELL
                    try {
                        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(IForms.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (InstantiationException ex) {
                        Logger.getLogger(IForms.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(IForms.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(IForms.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    //INICIA O ESQUELETO DA TELA
                    Main main = new Main();
                    main.setVisible(true);
                    main.setExtendedState(main.getExtendedState() | main.MAXIMIZED_BOTH);

                    //INICIA O PAINEL PRINCIPAL
                    JDesktopPane mainPane = main.getDesktopPane();

                    //CARREGA A TELA INICIAL                                        
                    FrameManager.addInternalFrame(mainPane, CreateAndUpdate_old.class.getCanonicalName());

                } catch (Exception ex) {
                    Logger.getLogger(IForms.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }

}
