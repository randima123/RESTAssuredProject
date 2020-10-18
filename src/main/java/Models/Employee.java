package Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"employee_name", "employee_salary", "employee_age"})
public class Employee {

    private int id;
    private String employee_name;
    private String employee_salary;
    private String employee_age;

    public Employee() {
    }

    public Employee(String employee_name, String employee_salary, String employee_age) {
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
        this.employee_age = employee_age;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("employee_name")
    public String getName() {
        return employee_name;
    }

    @JsonProperty("employee_name")
    public void setName(String employee_name) {
        this.employee_name = employee_name;
    }

    @JsonProperty("employee_salary")
    public String getSalary() {
        return employee_salary;
    }

    @JsonProperty("employee_salary")
    public void setSalary(String employee_salary) {
        this.employee_salary = employee_salary;
    }

    @JsonProperty("employee_age")
    public String getAge() {
        return employee_age;
    }

    @JsonProperty("employee_age")
    public void setAge(String employee_age) {
        this.employee_age = employee_age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + employee_name + '\'' +
                ", salary='" + employee_salary + '\'' +
                ", age='" + employee_age + '\'' +
                '}';
    }
}
