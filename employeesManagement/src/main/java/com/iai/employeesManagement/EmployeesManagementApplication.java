package com.iai.employeesManagement;

import com.iai.employeesManagement.model.*;
import com.iai.employeesManagement.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
public class EmployeesManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeesManagementApplication.class, args);
	}

	@Bean
	CommandLineRunner start(EmployeeRepository employeeRepository) {
		return args -> {
			Address address1 = new Address("Togo", "Lome", "Agoe");
			Address address2 = new Address("Ghana", "Accra", "Accra city");
			Address address3 = new Address("Benin", "Cotonou", "St Michel");
			Address address4 = new Address("USA", "Washington DC", "Wall Street");

			Employee employee1 = new Employee();
			employee1.setName("KODJO");
			employee1.setFirstname("Koffi");
			employee1.setAge(15);
			employee1.setBirthdate(LocalDate.of(1995, 11, 5));
			employee1.setSex(Sex.M);
			employee1.setNationality("Togolais");
			employee1.setAddress(address1);
			employee1.setMartialStatus(MartialStatus.DIVORCE);
			employee1.setHireDate(LocalDate.of(2003, 11, 4));
			employee1.setContractType(ContractType.CDD);
			employee1.setWorkType(WorkType.FREELANCE);
			employee1.setEmployeeStatus(EmployeeStatus.ACTIF);
			employee1.setSalary(15000000L);
			employee1.setMatricule(
					UUID.randomUUID().toString().substring(0, 4).toUpperCase()
							+"-" +employee1.getName().substring(0, 2).toUpperCase()
							+ "-" +employee1.getFirstname().substring(0, 2).toUpperCase()
							+ "-" +employee1.getAge()
							+ "-" +employee1.getHireDate().getYear()
							+"-" + employee1.getBirthdate().getYear()
							+ "-" +employee1.getSex()
			);
			employeeRepository.save(employee1);

			Employee employee2 = new Employee();
			employee2.setName("FIANYO");
			employee2.setFirstname("Friedo");
			employee2.setAge(20);
			employee2.setBirthdate(LocalDate.of(2004, 4, 19));
			employee2.setSex(Sex.M);
			employee2.setNationality("Togolais");
			employee2.setAddress(address1);
			employee2.setMartialStatus(MartialStatus.CELIBATAIRE);
			employee2.setHireDate(LocalDate.of(2023, 1, 25));
			employee2.setContractType(ContractType.STAGE);
			employee2.setWorkType(WorkType.TEMPS_PARTIEL);
			employee2.setEmployeeStatus(EmployeeStatus.ACTIF);
			employee2.setSalary(50000L);
			employee2.setMatricule(
					UUID.randomUUID().toString().substring(0, 4).toUpperCase()
							+ "-" +employee2.getName().substring(0, 2).toUpperCase()
							+ "-" +employee2.getFirstname().substring(0, 2).toUpperCase()
							+ "-" +employee2.getAge()
							+ "-" +employee2.getHireDate().getYear()
							+ "-" +employee2.getBirthdate().getYear()
							+ "-" +employee2.getSex()
			);
			employeeRepository.save(employee2);

			Employee employee3 = new Employee();
			employee3.setName("ANI");
			employee3.setFirstname("Marius");
			employee3.setAge(25);
			employee3.setBirthdate(LocalDate.of(2005, 1, 3));
			employee3.setSex(Sex.M);
			employee3.setNationality("Americain");
			employee3.setAddress(address4);
			employee3.setMartialStatus(MartialStatus.MARIE);
			employee3.setHireDate(LocalDate.of(2020, 12, 15));
			employee3.setContractType(ContractType.CDI);
			employee3.setWorkType(WorkType.TEMPS_PLEIN);
			employee3.setEmployeeStatus(EmployeeStatus.CONGE);
			employee3.setSalary(100000L);
			employee3.setMatricule(
					UUID.randomUUID().toString().substring(0, 4).toUpperCase()
							+"-" + employee3.getName().substring(0, 2).toUpperCase()
							+ "-" +employee3.getFirstname().substring(0, 2).toUpperCase()
							+ "-" +employee3.getAge()
							+ "-" +employee3.getHireDate().getYear()
							+ "-" +employee3.getBirthdate().getYear()
							+ "-" +employee3.getSex()
			);
			employeeRepository.save(employee3);

			Employee employee4 = new Employee();
			employee4.setName("GUEDOPE");
			employee4.setFirstname("Armandine");
			employee4.setAge(19);
			employee4.setBirthdate(LocalDate.of(2005, 8, 15));
			employee4.setSex(Sex.F);
			employee4.setNationality("Beninoise");
			employee4.setAddress(address2);
			employee4.setMartialStatus(MartialStatus.MARIE);
			employee4.setHireDate(LocalDate.of(2023, 1, 15));
			employee4.setContractType(ContractType.CDD);
			employee4.setWorkType(WorkType.FREELANCE);
			employee4.setEmployeeStatus(EmployeeStatus.ACTIF);
			employee4.setSalary(15000000L);
			employee4.setMatricule(
					UUID.randomUUID().toString().substring(0, 4).toUpperCase()
							+ "-" +employee4.getName().substring(0, 2).toUpperCase()
							+ "-" +employee4.getFirstname().substring(0, 2).toUpperCase()
							+ "-" +employee4.getAge()
							+ "-" +employee4.getHireDate().getYear()
							+ "-" +employee4.getBirthdate().getYear()
							+ "-" +employee4.getSex()
			);
			employeeRepository.save(employee4);

			Employee employee5 = new Employee();
			employee5.setName("AHOUNOU");
			employee5.setFirstname("Jean");
			employee5.setAge(30);
			employee5.setBirthdate(LocalDate.of(1990, 2, 10));
			employee5.setSex(Sex.M);
			employee5.setNationality("Togolais");
			employee5.setAddress(address1);
			employee5.setMartialStatus(MartialStatus.CELIBATAIRE);
			employee5.setHireDate(LocalDate.of(2015, 5, 20));
			employee5.setContractType(ContractType.CDI);
			employee5.setWorkType(WorkType.TEMPS_PLEIN);
			employee5.setEmployeeStatus(EmployeeStatus.ACTIF);
			employee5.setSalary(800000L);
			employee5.setMatricule(
					UUID.randomUUID().toString().substring(0, 4).toUpperCase()
							+ "-" +employee5.getName().substring(0, 2).toUpperCase()
							+ "-" +employee5.getFirstname().substring(0, 2).toUpperCase()
							+ "-" +employee5.getAge()
							+ "-" +employee5.getHireDate().getYear()
							+ "-" +employee5.getBirthdate().getYear()
							+ "-" +employee5.getSex()
			);
			employeeRepository.save(employee5);

			Employee employee6 = new Employee();
			employee6.setName("AHOUNOU");
			employee6.setFirstname("Jean");
			employee6.setAge(30);
			employee6.setBirthdate(LocalDate.of(1990, 2, 10));
			employee6.setSex(Sex.M);
			employee6.setNationality("Togolais");
			employee6.setAddress(address3);
			employee6.setMartialStatus(MartialStatus.CELIBATAIRE);
			employee6.setHireDate(LocalDate.of(2015, 5, 20));
			employee6.setContractType(ContractType.CDI);
			employee6.setWorkType(WorkType.TEMPS_PLEIN);
			employee6.setEmployeeStatus(EmployeeStatus.ACTIF);
			employee6.setSalary(800000L);
			employee6.setMatricule(
					UUID.randomUUID().toString().substring(0, 4).toUpperCase()
							+ "-" +employee6.getName().substring(0, 2).toUpperCase()
							+ "-" +employee6.getFirstname().substring(0, 2).toUpperCase()
							+ "-" +employee6.getAge()
							+ "-" +employee6.getHireDate().getYear()
							+ "-" +employee6.getBirthdate().getYear()
							+ "-" +employee6.getSex()
			);
			employeeRepository.save(employee6);

			System.out.println("Données initialisées avec succès !");

		};
	}


}
