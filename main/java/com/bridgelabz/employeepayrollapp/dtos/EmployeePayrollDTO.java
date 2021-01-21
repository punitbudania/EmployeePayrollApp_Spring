package com.bridgelabz.employeepayrollapp.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.ToString;

import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;

public @ToString class EmployeePayrollDTO
{
    @Pattern(regexp = "^[A-Z]{1}[a-zAZ\\s]{2,}$", message = "Employee name Invalid")
    public String name;
    @Min(value = 500, message = "Min wage should be more than 500")
    public long salary;

    @Pattern(regexp = "male|female", message = "Gender needs to be male or female")
    public String gender;

    @JsonFormat(pattern = "dd MMM yyyy")
    @NotNull(message = "startdate should not be empty")
    @PastOrPresent(message = "future date is not allowed")
    public LocalDate startDate;

    @NotBlank(message = "note cannot be empty")
    public String note;

    @NotBlank(message = "profilePic cannot be empty")
    public String profilePic;

    @NotNull(message = "department should not be empty")
    public List<String> departments;
}
