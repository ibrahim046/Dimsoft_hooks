package com.shelby.employe.services.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shelby.employe.models.Employe;
import com.shelby.employe.repositories.EmployeRepository;
import com.shelby.employe.services.EmployeeService;


@Service
public class EmployeeServiceImpl  implements EmployeeService{

    
    
    @Autowired
    private EmployeRepository employeRepository ;

    @Override
    public List<Employe> getEmployee(){
        return employeRepository.findAll() ;
    }

    @Override
    public Employe getEmployeById( Long id){
        if(id!= null) {
             return employeRepository.findById(id).get();
        } 
        return null;
    }

    @Override
    public Employe createEmployee( Employe employe) {

        return employeRepository.save(employe) ;
    }

    @Override
    public void deleteEmploye ( Long id) {

        employeRepository.deleteById(id);
    }

    @Override
    public Employe updateEmploye (Employe employe){
        return employeRepository.save(employe) ;
    }
	

}
