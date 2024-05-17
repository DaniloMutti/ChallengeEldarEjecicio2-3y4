package ar.com.eldar.eldarchallenge.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.eldar.eldarchallenge.entity.MarcaEntity;


@Repository
public interface MarcaRepository extends JpaRepository<MarcaEntity, Long> {

    Optional<MarcaEntity> findByMarca(String marca);

}
