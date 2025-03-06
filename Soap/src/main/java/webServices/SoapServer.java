/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package webServices;

import jakarta.xml.ws.Endpoint;

/**
 *
 * @author abelc
 */
public class SoapServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String address="http://0.0.0.0:8081/";
       Endpoint.publish(address, new SOAPImpl());
        System.out.println("Address: "+ address);
    }
    
}
