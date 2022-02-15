package javaProblemsForAutomation;

import java.sql.*;

public class OracleCon {
    public static void main(String[] args) {
//step1 load the driver class
        try {


            Class.forName("oracle.jdbc.driver.OracleDriver");
            //step2 create the connection object
            Connection
                    connection = DriverManager.getConnection("dbc:oracle:thin:@localhost:1521:xe", "system", "oracl e");
            //step3 create the statement object
            Statement stmnt = connection.createStatement();
            //step4 execute query
            ResultSet rs = stmnt.executeQuery("select * from emp");
            while (rs.next()) ;
            System.out.println(rs.getInt(1) + "   " + rs.getString(2) + "    " + rs.getString(3));
//step5 close the connection object
            connection.close();

        } catch (Exception e){
            System.out.println(e);
        }


    }
}
