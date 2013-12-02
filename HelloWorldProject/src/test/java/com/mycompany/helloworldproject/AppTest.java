/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworldproject;
import junit.framework.TestCase;


public class AppTest extends TestCase {
    
    public AppTest(String testName) {
        super(testName);
    }
    
    public void testApplication(){
        PrinterOut po = new PrinterOut();
        assertEquals("Change String!","Hello World!",po.out);
    }
    
}
