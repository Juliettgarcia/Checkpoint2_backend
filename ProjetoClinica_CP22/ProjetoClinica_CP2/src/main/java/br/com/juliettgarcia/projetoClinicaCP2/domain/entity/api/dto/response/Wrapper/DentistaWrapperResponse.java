package br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.dto.response.Wrapper;

import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.dto.response.List.DentistaListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DentistaWrapperResponse {
    private List<DentistaListResponse> dentistas;
}
