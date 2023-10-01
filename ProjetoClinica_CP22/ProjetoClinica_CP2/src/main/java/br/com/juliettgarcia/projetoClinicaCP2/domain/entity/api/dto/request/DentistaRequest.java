package br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.dto.request;

import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.Clinica;
import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.EspecialdiadeEnum;
import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.SexoEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
public class DentistaRequest {

    @NotBlank
    private String nome;
    @NotBlank
    private String cro;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    private EspecialdiadeEnum especialidade;
    @NotNull
    private SexoEnum sexo;
    @NotNull
    private ContatoRequest contato;
    @NotEmpty
    private Set<Clinica> clinicasDentistas;

}
