/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iforms.View;

import java.awt.Dimension;
import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aluno
 */
public class FrameManager {
    
    JDesktopPane mainPane;

    public FrameManager() {
        this.mainPane = mainPane;
    }   
    
    public static void addInternalFrame(JDesktopPane mainPane, JInternalFrame internalFrame) {

        BasicInternalFrameUI intFrame = (BasicInternalFrameUI) internalFrame.getUI();
        intFrame.setNorthPane(null);
        internalFrame.setBorder(null);
        internalFrame.setVisible(true);
        
        mainPane.add(internalFrame);

        try {
            internalFrame.setMaximum(true);
        } catch (PropertyVetoException ex) {
//            Logger.getLogger(IForms.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    

}
