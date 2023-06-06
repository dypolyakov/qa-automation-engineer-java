package sprint6.topic2.unitTests.lesson6.task3;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import sprint6.topic2.unitTests.lesson6.task2.PayrollCalculator;

@RunWith(MockitoJUnitRunner.class)
public class PayrollCalculatorTest {

    @Mock
    PayrollCalculator payrollCalculator;

    @Test
    public void test() {
        Mockito.when(payrollCalculator
                .calcSalary(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt()))
                .thenReturn(80_000);

        Assert.assertEquals(80_000, payrollCalculator.calcSalary(40, 90, 0));
    }
}
