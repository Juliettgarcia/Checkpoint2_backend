package br.com.juliettgarcia.projetoClinicaCP2.domain.service.impl;

import br.com.juliettgarcia.projetoClinicaCP2.domain.exception.NotFoundException;
import br.com.juliettgarcia.projetoClinicaCP2.domain.repository.PacienteRepository;
import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.Paciente;
import br.com.juliettgarcia.projetoClinicaCP2.domain.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PacienteServiceImpl implements PacienteService {

    private final PacienteRepository pacienteRepository;

    @Autowired
    public PacienteServiceImpl(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public Paciente criarPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public List<Paciente> buscarPacientes(String termo) {
        return pacienteRepository.findByNomeStartingWith(termo);
    }

    @Override
    public Paciente buscarPacientePorId(UUID id) {
        try {
            return pacienteRepository.findById(id).orElseThrow();
        } catch (Exception e){
            throw new NotFoundException(id);
        }

    }

    @Override
    public Paciente atualizarPaciente(UUID id, Paciente paciente) {
        try {
            pacienteRepository.findById(id).orElseThrow();;
        } catch (Exception e) {
            throw new NotFoundException(id);
        }
        return pacienteRepository.save(paciente);
    }

    @Override
    public void deletarPaciente(UUID id) {
        try {
            pacienteRepository.findById(id).orElseThrow();
            pacienteRepository.deleteById(id);
        } catch (Exception e) {
            throw new NotFoundException(id);
        }

    }
}
