/*
 * Gra w kości - rozpoznawanie układów pokerowych. Otrzymuje Pan 5 wyników rzutu kosci i rozpoznaje Pan jako to układ: trójka, strit itp.
 */
package zOLDcontroller;


/**
* Main class that allows to run application
* 
* @author Jakub Zaremba
* @version 2.0
* @since   2020-11-14
*/
public class Main {
    /**
     * static void function allows to run application, with or without dice polls parameters provided as arguments
     * @param args array of five numeric values
     */
    public static void main(String args[]) {
        
         GameSetup gameSetup = new GameSetup();
         gameSetup.manageData(args);

    }
    
}
