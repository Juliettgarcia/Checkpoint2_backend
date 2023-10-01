package br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.dto.response.Wrapper;

import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.api.dto.response.List.ClinicaListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClinicaResponseWrapper {
    private List<ClinicaListResponse> clinicas;
}
