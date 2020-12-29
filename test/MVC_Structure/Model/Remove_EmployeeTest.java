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
public class Remove_EmployeeTest {
    
    @Test
    public void testActionPerformed() throws Exception {
        conn con = new conn();
        String str = "select name,phone,email from employee where emp_id ='6634' ";
        ResultSet rs = con.s.executeQuery(str);

       
        rs.next();
        String name=rs.getString(1);
        assertEquals("Fahim",name);
        
    }  
    
    @Test
    public void testActionPerformed2() throws Exception {
        conn conx = new conn();
        String str2 = "delete from employee where emp_id = '6634'";
        conx.s.executeUpdate(str2);
        
        String str = "select name,phone,email from employee where emp_id ='6634' ";
        ResultSet rs2 = conx.s.executeQuery(str);
        
        assertEquals(rs2.next(),false);
        
    }
    
    
    
}
