package sprint6.topic2.unitTests.lesson6.task2;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PayrollCalculatorTest {

    @Mock
    PayrollCalculator payrollCalculator;

    @Test
    public void test() {
        Mockito.when(payrollCalculator.calcSalary(0, 0, 0)).thenReturn(50000);
        Assert.assertEquals(50000, payrollCalculator.calcSalary(0, 0, 0));
    }
}