/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package webServices;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import java.util.List;

/**
 *
 * @author abelc
 */
@WebService(serviceName = "SOAPImpl")
public class SOAPImpl implements SOAPI{
private static final User user = new User();
    @Override
    public List<User> getUsers() {
    return user.getUsers();
    }

    @Override
    public void addUser(User newUser) {
        user.setUser(newUser);
    }

  
}
