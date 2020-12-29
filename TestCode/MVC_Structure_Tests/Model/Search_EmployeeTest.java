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
public class Search_EmployeeTest {
    
    String emp_id,name,father,address,phone,email,education,post,age,dob,aadhar;
    

    /**
     * Test of actionPerformed method, of class Print_Data.
     */
    @Test
    public void testActionPerformed() throws Exception {
        conn cc = new conn();
        String str = "select * from employee where emp_id = '"+"1234567"+"'";
        ResultSet rs= cc.s.executeQuery(str);
        
        rs.next();
        String name=rs.getString("name");
        assertEquals("TonyStark",name);
        rs.next();
        String fname=rs.getString("fname");
        assertEquals("xyz",fname);
        rs.next();
        String age=rs.getString("age");
        assertEquals("55",age);
        rs.next();
        String dob=rs.getString("dob");
        assertEquals("04-04-1970",dob);
        rs.next();
        String address=rs.getString("address");
        assertEquals("NY",address);
        rs.next();
        String phone=rs.getString("phone");
        assertEquals("213124124",phone);
        rs.next();
        String email=rs.getString("email");
        assertEquals("tony@gmail.com",email);
        rs.next();
        String education=rs.getString("education");
        assertEquals("xyzzz",education);
        rs.next();
        String post=rs.getString("post");
        assertEquals("CEO",post);
        rs.next();
        String aadhar=rs.getString("aadhar");
        assertEquals("12312321312321",aadhar);
        rs.next();
        String emp_id=rs.getString("emp_id");
        assertEquals("1234567",emp_id);
    }

    
}
