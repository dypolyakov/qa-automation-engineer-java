package sprint6.topic2.unitTests.lesson11;

public class SalaryService {

    public int calculateSalary(int sales) {
        int percent = 5;
        int salary = sales * percent / 100;
        int salaryLimit = 50_000;
        if (salary > salaryLimit) {
            salary = salaryLimit;
        }
        return salary;
    }
}
