package br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoRequest {

    @NotBlank
    private String logradouro;
    @NotBlank
    private String bairro;
    @NotBlank
    private String cidade;
    @NotBlank
    private String estado;
    @NotBlank
    private String cep;

}
