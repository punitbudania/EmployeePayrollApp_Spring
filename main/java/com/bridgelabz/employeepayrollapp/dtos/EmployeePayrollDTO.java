package com.bridgelabz.employeepayrollapp.dtos;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO
{
    @Pattern(regexp = "^[A-Z]{1}[a-zAZ\\s]{2,}$", message = "Employee name Invalid")
    public String name;
    @Min(value = 500, message = "Min wage should be more than 500")
    public long salary;

    public EmployeePayrollDTO(String name, long salary)
    {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "name=" + name + ":salary=" + salary;
    }
}
