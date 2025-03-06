/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package itson.mx.soapcliente;

import com.itson.soapcliente.SOAPImpl;
import com.itson.soapcliente.SOAPImpl_Service;
import com.itson.soapcliente.User;
import java.util.List;




/**
 *
 * @author abelc
 */
public class SoapCliente {

    public static void main(String[] args) {
         // Crear el cliente del servicio
        SOAPImpl_Service service = new SOAPImpl_Service();
        SOAPImpl port = service.getSOAPImplPort();

        //lista de usuarios antes de carlos
        System.out.println("Antes de carlos");
        List<User> usuariosA = port.getUsers();
        for (User u : usuariosA) {
            System.out.println("Usuario: " + u.getName() + " - Username: " + u.getUsername());
        }
        // Agregar un nuevo usuario al servicio SOAP
        User nuevoUsuario = new User();
        nuevoUsuario.setName("Carlos");
        nuevoUsuario.setUsername("carlos123");

        System.out.println("Agregando usuario: " + nuevoUsuario.getName());
        port.addUser(nuevoUsuario);
        
        // Obtener la lista de usuarios desde el servicio SOAP
       
        List<User> usuarios = port.getUsers();

        // Mostrar la lista de usuarios obtenida
        for (User u : usuarios) {
            System.out.println("Usuario: " + u.getName() + " - Username: " + u.getUsername());
        }
    
    }
}
