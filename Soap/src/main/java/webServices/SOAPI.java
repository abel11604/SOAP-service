/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package webServices;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

/**
 *
 * @author abelc
 */
@WebService
public interface SOAPI {
   @WebMethod
   public List<User> getUsers();
   @WebMethod
   public void addUser(User user);
}
