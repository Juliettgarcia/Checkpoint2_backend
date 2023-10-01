package br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.dto.response.Wrapper;

import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.dto.response.List.ConsultaListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ConsultaWrapperResponse {
    List<ConsultaListResponse> consultas;
}
