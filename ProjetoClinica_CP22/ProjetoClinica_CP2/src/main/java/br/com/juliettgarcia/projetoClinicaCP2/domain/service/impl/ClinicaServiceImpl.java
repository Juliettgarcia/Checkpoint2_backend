package br.com.juliettgarcia.projetoClinicaCP2.domain.service.impl;

import br.com.juliettgarcia.projetoClinicaCP2.domain.exception.BadRequestCnpjException;
import br.com.juliettgarcia.projetoClinicaCP2.domain.exception.NotFoundException;
import br.com.juliettgarcia.projetoClinicaCP2.domain.repository.ClinicaRepository;
import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.Clinica;
import br.com.juliettgarcia.projetoClinicaCP2.domain.service.ClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ClinicaServiceImpl implements ClinicaService {

    private final ClinicaRepository clinicaRepository;

    @Autowired
    public ClinicaServiceImpl(ClinicaRepository clinicaRepository) {
        this.clinicaRepository = clinicaRepository;
    }

    @Override
    public Clinica criarClinica(Clinica clinica) {
        boolean cnpjExiste = clinicaRepository.existsByCnpj(clinica.getCnpj());
        if (cnpjExiste){
            throw new BadRequestCnpjException(clinica.getCnpj());
        }
        return clinicaRepository.save(clinica);
    }

    @Override
    public List<Clinica> buscarClinicas(String termo) {
        return clinicaRepository.findByNomeStartingWith(termo);
    }

    @Override
    public Clinica buscarClinicaPorId(UUID id) {
        try {
            return clinicaRepository.findById(id).orElseThrow();
        } catch (Exception e) {
            throw new NotFoundException(id);
        }

    }

    @Override
    public Clinica atualizarClinica(UUID id, Clinica clinica) {
        try {
            clinicaRepository.findById(id).orElseThrow();;
        } catch (Exception e) {
            throw new NotFoundException(id);
        }
        return clinicaRepository.save(clinica);
    }

    @Override
    public void deletarClinica(UUID id) {
        try {
            clinicaRepository.findById(id).orElseThrow();
            clinicaRepository.deleteById(id);
        } catch (Exception e){
            throw new NotFoundException(id);
        }

    }

}
