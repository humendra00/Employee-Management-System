package employeemanagementsytem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

    public class Conn {

        Connection connection;
        Statement statement;

        public Conn(){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","harinkhede@90");
                statement = connection.createStatement();


            }catch (Exception e){
                e.printStackTrace();
            }


        }

        public static void main(String[] args) {
            new Conn();
        }


    }
