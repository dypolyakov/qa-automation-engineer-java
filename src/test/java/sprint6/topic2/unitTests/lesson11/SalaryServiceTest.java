package sprint6.topic2.unitTests.lesson11;

import org.junit.Assert;
import org.junit.Test;

public class SalaryServiceTest {

    @Test
    public void shouldCalculateSalaryWhenUnderLimit() {
        SalaryService salaryService = new SalaryService();
        int actual = salaryService.calculateSalary(50_000);
        int expected = 2_500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSalaryOverLimit() {
        SalaryService salaryService = new SalaryService();
        int actual = salaryService.calculateSalary(1_000_000);
        int expected = 50_000;

        Assert.assertEquals(expected, actual);
    }
}