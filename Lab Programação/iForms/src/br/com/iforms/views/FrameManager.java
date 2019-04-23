package br.com.iforms.views;

import java.beans.PropertyVetoException;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrameManager {

    public static void addInternalFrame(JDesktopPane mainPane, String internalFrameName) throws Exception {
        
        JInternalFrame internalFrame = FrameManager.instantiateObject(internalFrameName);
        internalFrame.pack();
        
        BasicInternalFrameUI intFrame = (BasicInternalFrameUI) internalFrame.getUI();
        intFrame.setNorthPane(null);
        internalFrame.setBorder(null);
        internalFrame.setVisible(true);

        mainPane.add(internalFrame);

        try {
            internalFrame.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FrameManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static <T> T instantiateObject(String cls) throws Exception {
        return (T) Class.forName(cls).newInstance();
    }

}
