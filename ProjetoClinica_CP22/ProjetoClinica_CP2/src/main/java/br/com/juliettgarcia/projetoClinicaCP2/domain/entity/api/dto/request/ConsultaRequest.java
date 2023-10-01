package br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.dto.request;

import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.Clinica;
import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.Dentista;
import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.Paciente;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ConsultaRequest {

    @NotNull
    private Paciente paciente;
    @NotNull
    private Dentista dentista;
    @NotNull
    private Clinica clinica;
    @NotNull
    private LocalDate dataConsulta;
    @NotEmpty
    private String descricao;
    @NotNull
    private Boolean cancelada;
    private String motivoCancelamento;

}
