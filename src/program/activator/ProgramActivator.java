/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program.activator;

/**
 *
 * @author Roemer Hendrikx
 */
public class ProgramActivator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ActivatorInterface Interface1 = new ActivatorInterface();
        Interface1.setVisible(true);
        Interface1.VersionLabel("0.1");
    }
}
