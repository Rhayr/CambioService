package br.edu.atitus.paradigma.cambio_service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.atitus.paradigma.cambio_service.entities.CambioEntity;

import java.util.Optional;

public interface CambioRepository extends JpaRepository<CambioEntity, Long> {
    Optional<CambioEntity> findByOrigemAndDestino(String origem, String destino);
}