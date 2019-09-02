package accounts;

import java.sql.SQLException;

public class App {

    /**
     * @author Jahidul Islam
     * Use methods from the SalaryCalculator class to calculate salary of an employee
     *
     * */

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    SalaryCalulator salaryCalulator = new SalaryCalulator();
       salaryCalulator.Employee();
       salaryCalulator.connection("employess","Salary");
       ;

    }
}
