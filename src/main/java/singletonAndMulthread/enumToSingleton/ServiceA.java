package singletonAndMulthread.enumToSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServiceA {
    public enum Service {
        connectFactory;
        private Connection connection;
        private Service(){
            try {
                System.out.println("Service Contructor");
                String url = "jdbc:mysql://192.168.15.42:3306/waijiaojun4.3.1";
                String username = "root";
                String password = "123456";
                String driverName = "com.mysql.jdbc.Driver";
                Class.forName(driverName);
                connection = DriverManager.getConnection(url,username,password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public Connection getConnection() {
            return connection;
        }
    }

    public static Connection getConnection(){
        return Service.connectFactory.getConnection();
    }
}
