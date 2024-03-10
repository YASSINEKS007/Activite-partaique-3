package ma.enset.hospital_jee;

import ma.enset.hospital_jee.entities.Patient;
import ma.enset.hospital_jee.repository.PatientRepository;
import ma.enset.hospital_jee.service.IHospital;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class HospitalJeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalJeeApplication.class, args);
	}

	//@Bean
	CommandLineRunner start(IHospital iHospital){
		return args -> {
			Patient p = new Patient(null,"yassine",new Date(),true,2);

			Patient p_sv = iHospital.savePatient(p);



			Patient p2 = new Patient(null, "Alice", new Date(1990, 5, 15), true, 1);

			Patient p2_sv = iHospital.savePatient(p2);


			Patient p3 = new Patient(null, "Emma", new Date(1985, 8, 20), false, 3);

			Patient p3_sv = iHospital.savePatient(p3);

			Patient patient = new Patient(null, "Sophie", new Date(1995, 3, 10), false, 4);
			Patient patientSaved = iHospital.savePatient(patient);
		};
	}

	@Bean
	PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

}
