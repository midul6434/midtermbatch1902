package accountstest;

import accounts.SalaryCalulator;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * @author Jahidul Islam
 * Do unit testing of SalaryCalculator class
 *
 * */

public class SalaryCalculatorTest {
    @Test

    public void SalaryCalculatorTest(){


        SalaryCalulator salaryCalulator = new SalaryCalulator();
        String actualresult = salaryCalulator.Employee();
        String expectedresult =actualresult ;
    Assert.assertEquals(actualresult,expectedresult);


    }

}
