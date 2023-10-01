package br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class EnderecoResponse {

    private UUID id;
    private String logradouro;
    private String bairro;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private String cidade;
    private String estado;
    private String cep;

}
