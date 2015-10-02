/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr02_m8_clone;
import java.net.*;
/**
 *
 * @author adaw
 */
public class Pr02_m8_clone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        System.out.println("Hola SOY RUBEN SALAZAR ");
        
        System.out.println("versió 0.2 del projecte prjava00");
        
        try {
            InetAddress addr = InetAddress.getLocalHost();
        
            String ipAddr = addr.getHostAddress();
            
            String hostname = addr.getHostName();
            
            System.out.println("hostname="+hostname);
            
            System.out.println("Adreça IP: " + ipAddr);
            
            System.out.println("Nom de l'usuari: " + System.getProperty("user.name"));
            
            System.out.println("Carpeta Personal: " + System.getProperty("user.home"));
            
            System.out.println("Sistema operatiu: " + System.getProperty("os.name"));
            
            System.out.println("Versió OS: " + System.getProperty("os.version"));
            
        } catch (UnknownHostException e) {
        
            e.printStackTrace();
            }
    }
    
}
