/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.iforms.models.inputs;

import javax.swing.JTextField;


/**
 *
 * @author Aluno
 */
public class InputShortText extends JTextField{        
    
    private JTextField input;
    
    public JTextField InputShortText() {        
        this.input = new JTextField(); 
        return this.input;
    }    
    
    public JTextField getModel() {                
        return this.input;
    }    
    
}
