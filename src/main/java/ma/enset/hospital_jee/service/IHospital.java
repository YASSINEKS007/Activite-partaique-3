package ma.enset.hospital_jee.service;

import ma.enset.hospital_jee.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface IHospital {
    Patient savePatient(Patient obj);



}
