package Utils;

import org.testng.annotations.DataProvider;

public class EmployeeDataProvider {

    private EmployeeDataProvider(){

    }

    @DataProvider(name="employeeData")
    public static final Object[][] getEmployeeDataToValidateEmployeeName(){
        return new Object[][]{
                {"1", "Tiger Nixon"},
                {"2", "Garrett Winters"},
                {"3", "Ashton Cox"}
        };
    }

    @DataProvider(name="createEmployee")
    public static final Object[][] getDataToCreateEmployee(){
        return new Object[][]{
                {"Randima Sen", "200", "26"}
        };
    }

}
