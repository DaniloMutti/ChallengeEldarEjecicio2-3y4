package ar.com.eldar.eldarchallenge.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import ar.com.eldar.eldarchallenge.entity.TarjetaEntity;

@Repository
public interface TarjetaRepository extends JpaRepository<TarjetaEntity, Long> {


    Optional<TarjetaEntity> findByNumeroTarjeta(String numTarjeta);
    
}
