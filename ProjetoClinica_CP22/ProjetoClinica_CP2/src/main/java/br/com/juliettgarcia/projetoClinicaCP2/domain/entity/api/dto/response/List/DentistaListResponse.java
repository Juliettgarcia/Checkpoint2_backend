package br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.dto.response.List;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class DentistaListResponse {

    private UUID id;
    private String nome;
    private String cro;

}
