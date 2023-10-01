package br.com.juliettgarcia.projetoClinicaCP2.domain.repository;

import br.com.juliettgarcia.projetoClinicaCP2.domain.entity.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, UUID> {
}
