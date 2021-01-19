package com.bridgelabz.employeepayrollapp.dtos;

public class EmployeePayrollDTO
{
    public String name;
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
