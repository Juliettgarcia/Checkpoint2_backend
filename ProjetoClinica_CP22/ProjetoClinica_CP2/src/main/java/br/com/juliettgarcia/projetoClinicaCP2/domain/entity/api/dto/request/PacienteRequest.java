package br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.dto.request;

import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.SexoEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PacienteRequest {

    @NotBlank
    private String nome;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    private SexoEnum sexo;
    @NotNull
    private EnderecoRequest endereco;
    @NotNull
    private ContatoRequest contato;

}
