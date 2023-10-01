package br.com.juliettgarcia.projetoClinicaCP2.domain.service;

import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.Clinica;

import java.util.List;
import java.util.UUID;

public interface ClinicaService {

    Clinica criarClinica(Clinica clinica);
    List<Clinica> buscarClinicas(String termo);
    Clinica buscarClinicaPorId(UUID id);
    Clinica atualizarClinica(UUID id, Clinica clinica);
    void deletarClinica(UUID id);

}
