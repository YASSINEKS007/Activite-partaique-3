package ma.enset.hospital_jee.service;

import jakarta.transaction.Transactional;
import ma.enset.hospital_jee.entities.Patient;
import ma.enset.hospital_jee.repository.PatientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class IHospitalImpl implements IHospital{
    private PatientRepository patientRepository;


    public IHospitalImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient savePatient(Patient obj) {
        return patientRepository.save(obj);
    }




}
