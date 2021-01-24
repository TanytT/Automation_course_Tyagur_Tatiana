package apiTests;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Employee {
    String name;
    String salary;
    String age;
    Integer id;

    @JsonCreator
    public Employee(@JsonProperty("name")String name, @JsonProperty("salary")String salary,@JsonProperty("age") String age,@JsonProperty("id")Integer id) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.id =id;
    }
    public Employee(String name,String salary,String age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary) && Objects.equals(age, employee.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                ", age='" + age + '\'' +
                ", id=" + id +
                '}';
    }
}
