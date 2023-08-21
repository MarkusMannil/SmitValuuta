package com.valuuta.SmitValuuta.valuuta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ValuutaRepository extends JpaRepository<Valuuta, Long> {
    Optional<Valuuta> findValuutaById(Long id);
}
