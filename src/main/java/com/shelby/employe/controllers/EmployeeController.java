package com.shelby.employe.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shelby.employe.models.Employe;
import com.shelby.employe.services.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService ;

    @GetMapping("/employee")
   public List<Employe> getEmployee(){
        return employeeService.getEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employe getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeById(id);
    }

    @PostMapping("/employees")

    public Employe createEmployee(@RequestBody Employe employe){
        System.out.println("employe crée avec susccès");
        return employeeService.createEmployee(employe);
    }
    
    @PutMapping("/employees/{id}")
    public Employe updateEmploye (@PathVariable Long id , @RequestBody Employe employe) {
        employe.setEmployeId(id);
        return employeeService.updateEmploye(employe);
    }

    @DeleteMapping("/employee")
    public void deleteEmploye  (@RequestParam Long id){
        employeeService.deleteEmploye(id);    
    }
}
