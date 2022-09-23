package com.shelby.employe.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "table_des_étudiants ")
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Employe_Id")
    private Long employeId;
    @Column(name = "Employe_name")
    private String name;
    @Column(name = "Employe_age")
    private Long age;
    @Column(name = "Employe_location")
    private String location;
    @Column(name = "Employe_email")
    private String email;
    @Column(name = "Employe_departement")
    private String department;

}
