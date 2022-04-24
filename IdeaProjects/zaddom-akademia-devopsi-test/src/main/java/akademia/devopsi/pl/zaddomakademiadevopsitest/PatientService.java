package akademia.devopsi.pl.zaddomakademiadevopsitest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PatientService {
    private final Map<String, Patient> patients;

    public PatientService(){
        this.patients= new HashMap<>();
    }

    public void registerPatient (Patient patient){
        if(!this.patients.containsKey(patient.getPesel())){
            this.patients.put(patient.getPesel(),patient);
        }
    }

    public void updatePatient(String pesel, Patient patient){
        if(this.patients.containsKey(patient.getPesel())){
            this.patients.put(patient.getPesel(),patient);
        }
    }

    public void deletePatient(String pesel){
        this.patients.remove(pesel);
    }


    public List<Patient> getPatients(){
        List<Patient>tmpPatients=new ArrayList<>();
        for( String pesel:this.patients.keySet()){
            tmpPatients.add(this.patients.get(pesel));
        }
        return tmpPatients;
    }





}
