/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC_Structure.Controller;

import MVC_Structure.Model.conn;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

/**
 *
 * @author Mohtasim Fahim
 */
public class loginTest {
    

    /**
     * Test of actionPerformed method, of class login.
     */
    @Test
    public void testActionPerformed() throws Exception{
        
        conn c1 = new conn();
        
        String u = "fahim";
        String v = "12345";

        String q = "select * from login where username='"+u+"' and password='"+v+"'";

        ResultSet rs = c1.s.executeQuery(q);
        assertEquals(rs!=null,true);
    }
    
}
