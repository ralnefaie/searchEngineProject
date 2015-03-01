/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package searchengine;

import javax.swing.UIManager;

/**
 *
 * @author Ali
 */
public class SearchEngine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
            /**
     * @param args the command line arguments
     */
  
        // TODO code application logic here
        try { 
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
} catch (Exception e) {
    e.printStackTrace();
}  
        // running the main program GUI from here 
        GUIsearch searchGUI = new GUIsearch();
        searchGUI.setVisible(true);
    
    }
}
