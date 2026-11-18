package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import tn.esprit.autolocapi.domain.Employe;
import tn.esprit.autolocapi.repository.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor
@RequestMapping("/api/employes")
public class IEmployeServiceImp implements IEmployeService {

    private final EmployeRepository employeRepository;
    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe getEmployeById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employe> getAllEmployees() {
        return employeRepository.findAll();
    }

    @Override
    public void supprimerEmployeById(Long id) {
        employeRepository.deleteById(id);

    }
}