package accounts;

import java.sql.*;
import java.util.Scanner;

public class SalaryCalulator {



    /**
     * @author Jahidul Islam
     * This class should have all the method necessary to calculate salary of 10 employees
     * Create employees table in MySQL Database and store employees information in that table
     * Use db package to get helper methods to connect to db and read employees information
     * Create methods to calculate monthly and yearly salary after tax where 35% tax has to be deducted from actual salary
     * This class consists only helper methods, you should not declare any main method here.
     * Main method is being declared in App class
     */
    public  void connection(String tableName,String columnName) throws ClassNotFoundException, SQLException {


    String username = "root";
    String password = " ";
    String url = "jdbc:mysql://localhost:3306/classicmodels?useSSL=false&allowPublicKeyRetrieval=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(username,password,url);
      PreparedStatement obj  =connection.prepareStatement("CREATE TABLE `"+tableName+"` (`ID` int(11) NOT NULL AUTO_INCREMENT,`"+columnName+"` varchar(2500) DEFAULT NULL,  PRIMARY KEY (`ID`) );");
        obj.executeUpdate();

    }

    public  void Employee(){
        String name;
        double monthlysalary,yearlysalary;
        int perhour = 0,hour,tax;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Employee Name ");
        name=scanner.nextLine();
        System.out.println("Hours of the month");
        hour=scanner.nextInt();
        System.out.println("Hour of the pay");
        perhour=scanner.nextInt();
        System.out.println("Monthly Income");
        tax=hour*perhour/100*35;
        monthlysalary=hour*perhour-tax;
        System.out.println(monthlysalary);
        System.out.println("Yearly salary");
        yearlysalary=monthlysalary*12;
        System.out.println(yearlysalary);
       






    }



}
