package com.shelby.employe.services;

import java.util.List;

import com.shelby.employe.models.Employe;

public interface EmployeeService {

    public List<Employe> getEmployee() ;

    public Employe getEmployeById( Long id);

    public Employe createEmployee( Employe employe) ;

    public void deleteEmploye ( Long id) ;

    public Employe updateEmploye (Employe employe) ;
}
