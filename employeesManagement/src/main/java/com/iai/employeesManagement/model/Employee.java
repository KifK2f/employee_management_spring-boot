package com.iai.employeesManagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Employe")
public class Employee {

    //Identifiants et metadonnees
    // Regroupent les attrubits servant a identifier ou tracer l'entite employe
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "matricule", unique = true)
    private String matricule; // Champ unique pour identifier l'employé donc doit avoir la contrainte d'unicite

    //Informations personnelles
    @Column(name = "nom", nullable = false)
    private String name; // Plusieurs employes peuvent avoir le meme nom donc le nom ne peut etre unique

    @Column(name = "prenom", nullable = false)
    private String firstname;

    @Column(name = "age", nullable = false, length = 2)
    private Integer age;

    @Column(name = "date_naiss", nullable = false)
    private LocalDate birthdate;

    @Enumerated(EnumType.STRING)
    @Column(name = "sexe", nullable = false)
    private Sex sex;

    @Column(name = "nationalite", nullable = false)
    private String nationality;

    @Embedded
    @Column(name = "adresse", nullable = false)
    private Address address;

    //Status matrimonial ou familial
    @Enumerated(EnumType.STRING)
    @Column(name = "statut_matrimonial", nullable = false)
    private MartialStatus martialStatus;

    //Informations profesionnelles
    @Column(name = "date_embauche" , nullable = false)
    private LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type_contrat", nullable = false)
    private ContractType contractType;

    @Enumerated(EnumType.STRING)
    @Column(name = "Type_travail", nullable = false)
    private WorkType workType;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_employe", nullable = false)
    private EmployeeStatus employeeStatus;

    @Column(name = "salaire", nullable = false)
    private Long salary;

    public Employee(Long id, String matricule, String name, String firstname, Integer age, LocalDate birthdate, Sex sex, String nationality, Address address, MartialStatus martialStatus, LocalDate hireDate, ContractType contractType, WorkType workType, EmployeeStatus employeeStatus, Long salary) {
        this.id = id;
        this.matricule = matricule;
        this.name = name;
        this.firstname = firstname;
        this.age = age;
        this.birthdate = birthdate;
        this.sex = sex;
        this.nationality = nationality;
        this.address = address;
        this.martialStatus = martialStatus;
        this.hireDate = hireDate;
        this.contractType = contractType;
        this.workType = workType;
        this.employeeStatus = employeeStatus;
        this.salary = salary;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public MartialStatus getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(MartialStatus martialStatus) {
        this.martialStatus = martialStatus;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

    public EmployeeStatus getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(EmployeeStatus employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
