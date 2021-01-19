package com.bridgelabz.employeepayrollapp.controllers;

import com.bridgelabz.employeepayrollapp.dtos.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dtos.ResponseDTO;
import com.bridgelabz.employeepayrollapp.models.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeePayrollController
{
    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData()
    {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 3000));
        ResponseDTO responseDTO = new ResponseDTO("Get call successful", employeePayrollData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);

        //return new ResponseEntity<String>("Get call success", HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId)
    {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, new EmployeePayrollDTO("Pankaj", 3000));
        ResponseDTO responseDTO = new ResponseDTO("Get call for id successful", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

        //return new ResponseEntity<String>("Get call success for id: " + empId, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO)
    {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, empPayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created employee payroll data successfully", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

        //return new ResponseEntity<String>("Create employee payroll data for: " + empPayrollDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO empPayrollDTO)
    {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = new EmployeePayrollData(1, empPayrollDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated employee payroll data successfully", employeePayrollData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

        //return new ResponseEntity<>("Updated employee payroll data for: " + empPayrollDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId)
    {
        ResponseDTO responseDTO = new ResponseDTO("Deleted successfully", "Deleted id: " + empId);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);

        //return new ResponseEntity<String>("Delete call success for id: " + empId, HttpStatus.OK);
    }
}
