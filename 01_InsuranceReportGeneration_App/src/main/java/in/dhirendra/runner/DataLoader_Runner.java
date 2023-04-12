package in.dhirendra.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import in.dhirendra.entity.CitizenPlan;
import in.dhirendra.repo.CitizenPlanRepository;
@Component
public class DataLoader_Runner implements ApplicationRunner {
	@Autowired
	private CitizenPlanRepository repo;
	@Override
	public void run(ApplicationArguments args) throws Exception
	{
		repo.deleteAll();
		

		// cash
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("Dhirendra");
		c1.setPlanName("cash");								//cash
		c1.setPlanStatus("Approved");
		c1.setGender("male");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(4));
		c1.setBenifitAmount(50000.00);

		// Cash
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("Rani");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Approved");
		c2.setGender("female");
		c2.setPlanStartDate(LocalDate.now());
		c2.setPlanEndDate(LocalDate.now().plusMonths(4));
		c2.setBenifitAmount(40000.00);

		// cash
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Dhiru");
		c3.setPlanName("cash");
		c3.setPlanStatus("Denied");
		c3.setGender("male");
		c3.setDenialReason("priceless");

		// cash
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("Laxmi");
		c4.setPlanName("cash");
		c4.setPlanStatus("Denied");
		c4.setGender("female");
		c4.setDenialReason("priceless");

		// cash
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("Amit");
		c5.setPlanName("cash");
		c5.setPlanStatus("Terminated ");
		c5.setGender("male");
		c5.setPlanStartDate(LocalDate.now());
		c5.setPlanEndDate(LocalDate.now().plusMonths(4));
		c5.setTerminatedReason("bed behaviour");

		// cash
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("Arti");
		c6.setPlanName("cash");
		c6.setPlanStatus("Terminated ");
		c6.setGender("female");
		c6.setPlanStartDate(LocalDate.now());
		c6.setPlanEndDate(LocalDate.now().plusMonths(4));
		c6.setTerminatedReason("bed behaviour");

		// Foot
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("Arpit");
		c7.setPlanName("Foot");									//Foot
		c7.setPlanStatus("Approved");
		c7.setGender("male");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(4));
		c7.setBenifitAmount(50000.00);

		// Food
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("Payal");
		c8.setPlanName("Foot");
		c8.setPlanStatus("Approved");
		c8.setGender("female");
		c8.setPlanStartDate(LocalDate.now());
		c8.setPlanEndDate(LocalDate.now().plusMonths(4));
		c8.setBenifitAmount(40000.00);

		// Food
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("Rahul");
		c9.setPlanName("Foot");
		c9.setPlanStatus("Denied");
		c9.setGender("male");
		c9.setDenialReason("Poor");

		// Food
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Ritu");
		c10.setPlanName("Foot");
		c10.setPlanStatus("Denied");
		c10.setGender("female");
		c10.setDenialReason("Poor");

		// Food
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("Shubham");
		c11.setPlanName("Foot");
		c11.setPlanStatus("Terminated ");
		c11.setGender("male");
		c11.setPlanStartDate(LocalDate.now());
		c11.setPlanEndDate(LocalDate.now().plusMonths(4));
		c11.setTerminatedReason("Self Motivated");

		// Food
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("Shurbhi");
		c12.setPlanName("Foot");
		c12.setPlanStatus("Terminated ");
		c12.setGender("female");
		c12.setPlanStartDate(LocalDate.now());
		c12.setPlanEndDate(LocalDate.now().plusMonths(4));
		c12.setTerminatedReason("Self Motivated");

		// Medical
		CitizenPlan c13 = new CitizenPlan();
		c13.setCitizenName("Himanshu");
		c13.setPlanName("Medical");							// Medical
		c13.setPlanStatus("Approved");
		c13.setGender("male");
		c13.setPlanStartDate(LocalDate.now());
		c13.setPlanEndDate(LocalDate.now().plusMonths(4));
		c13.setBenifitAmount(50000.00);

		// Medical
		CitizenPlan c14 = new CitizenPlan();
		c14.setCitizenName("Himani");
		c14.setPlanName("Medical");
		c14.setPlanStatus("Approved");
		c14.setGender("female");
		c14.setPlanStartDate(LocalDate.now());
		c14.setPlanEndDate(LocalDate.now().plusMonths(4));
		c14.setBenifitAmount(40000.00);

		// Medical
		CitizenPlan c15 = new CitizenPlan();
		c15.setCitizenName("Tarun");
		c15.setPlanName("Medical");
		c15.setPlanStatus("Denied");
		c15.setGender("male");
		c15.setDenialReason("no job");

		// Medical
		CitizenPlan c16 = new CitizenPlan();
		c16.setCitizenName("Tina");
		c16.setPlanName("Medical");
		c16.setPlanStatus("Denied");
		c16.setGender("female");
		c16.setDenialReason("no job");

		// Medical
		CitizenPlan c17 = new CitizenPlan();
		c17.setCitizenName("Krishna");
		c17.setPlanName("Medical");
		c17.setPlanStatus("Terminated ");
		c17.setGender("male");
		c17.setPlanStartDate(LocalDate.now());
		c17.setPlanEndDate(LocalDate.now().plusMonths(4));
		c17.setTerminatedReason("job");

		// Medical
		CitizenPlan c18 = new CitizenPlan();
		c18.setCitizenName("Kriti");
		c18.setPlanName("Medical");
		c18.setPlanStatus("Terminated ");
		c18.setGender("female");
		c18.setPlanStartDate(LocalDate.now());
		c18.setPlanEndDate(LocalDate.now().plusMonths(4));
		c18.setTerminatedReason("job");

		// Employment
		CitizenPlan c19 = new CitizenPlan();
		c19.setCitizenName("Himanshu");
		c19.setPlanName("Employment");					// Employment
		c19.setPlanStatus("Approved");
		c19.setGender("male");
		c19.setPlanStartDate(LocalDate.now());
		c19.setPlanEndDate(LocalDate.now().plusMonths(4));
		c19.setBenifitAmount(50000.00);

		// Employment
		CitizenPlan c20 = new CitizenPlan();
		c20.setCitizenName("Himani");
		c20.setPlanName("Employment");
		c20.setPlanStatus("Approved");
		c20.setGender("female");
		c20.setPlanStartDate(LocalDate.now());
		c20.setPlanEndDate(LocalDate.now().plusMonths(4));
		c20.setBenifitAmount(40000.00);

		// Employment
		CitizenPlan c21 = new CitizenPlan();
		c21.setCitizenName("Tarun");
		c21.setPlanName("Employment");
		c21.setPlanStatus("Denied");
		c21.setGender("male");
		c21.setDenialReason("no job");

		// Employment
		CitizenPlan c22 = new CitizenPlan();
		c22.setCitizenName("Tina");
		c22.setPlanName("Employment");
		c22.setPlanStatus("Denied");
		c22.setGender("female");
		c22.setDenialReason("no job");

		// Employment
		CitizenPlan c23 = new CitizenPlan();
		c23.setCitizenName("Krishna");
		c23.setPlanName("Employment");
		c23.setPlanStatus("Terminated ");
		c23.setGender("male");
		c23.setPlanStartDate(LocalDate.now());
		c23.setPlanEndDate(LocalDate.now().plusMonths(4));
		c23.setTerminatedReason("job");

		// Employment
		CitizenPlan c24 = new CitizenPlan();
		c24.setCitizenName("Kriti");
		c24.setPlanName("Employment");
		c24.setPlanStatus("Terminated ");
		c24.setGender("female");
		c24.setPlanStartDate(LocalDate.now());
		c24.setPlanEndDate(LocalDate.now().plusMonths(4));
		c24.setTerminatedReason("job");

		List<CitizenPlan> List = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16,
				c17, c18,c19,c20,c21,c22,c23,c24);
		
		repo.saveAll(List);
	}
}
