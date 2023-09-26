
package com.mycompany.lab4_ingsoftii;

import access.DBConnection;

/**
 *
 * @author Jeferson Castano Ossa <jcastanoossa@unicauca.edu.co>
 * @author David Santiago Giron Munoz <davidgiron@unicauca.edu.co>
 */
public class Lab4_IngSoftII {

    public static void main(String[] args) {
        
        DBConnection conn = DBConnection.getDBConnection();
        conn.connect("empleados");
        conn.disconnect();
        System.out.println("Connection 1: "+conn.hashCode());
        
        DBConnection conn2 = DBConnection.getDBConnection();
        conn2.connect("nomina");
        conn2.disconnect();
        System.out.println("Connection 2: "+conn.hashCode());
    }
}
