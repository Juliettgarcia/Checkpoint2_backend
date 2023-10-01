package br.com.juliettgarcia.projetoClinicaCP2.domain.service;


import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.Paciente;

import java.util.List;
import java.util.UUID;

public interface PacienteService {
    Paciente criarPaciente(Paciente paciente);
    List<Paciente> buscarPacientes(String termo);
    Paciente buscarPacientePorId(UUID id);
    Paciente atualizarPaciente(UUID id, Paciente paciente);
    void deletarPaciente(UUID id);
}
