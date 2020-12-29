/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Structure.Model;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mohtasim Fahim
 */
public class Update_EmployeeTest {
    
    /**
     * Test of actionPerformed method, of class Update_Employee.
     */
    @Test
    public void testActionPerformed()throws Exception {
        conn con = new conn();
        //name='Shahed',fname='EnamulHaque',age='22',dob='03-03-1998',address='Khulna',phone='01718123456',email='shahed@gmail.com',education='KUET',post='Manager',aadhar='1231313',emp_id='4434'
        //Changing Address "Khulna" to "Dhaka"
        
        String str = "update employee set name='Shahed',fname='EnamulHaque',age='22',dob='03-03-1998',address='Dhaka',phone='01718123456',email='shahed@gmail.com',education='KUET',post='Manager',aadhar='1231313',emp_id='4434' where emp_id='4434'";
        con.s.executeUpdate(str);
        
        String str2 = "select address,phone,email from employee where emp_id ='4434' ";
        ResultSet rs = con.s.executeQuery(str2);

       
        rs.next();
        String address=rs.getString(1);
        
        assertEquals("Dhaka",address);
    }

}
