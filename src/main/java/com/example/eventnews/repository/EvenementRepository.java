package com.example.eventnews.repository;

import com.example.eventnews.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
/**
 * Cette interface est responsable d’accéder à la bd
 *
 */
@Repository //Pour indiquer que c’est la couche qui a accès a la bd
public interface EvenementRepository extends JpaRepository<Evenement, Long> {

    @Query("SELECT s FROM Evenement s WHERE s.idEvenement = ?1")
    Optional<Evenement> findEvenementById(Long id);

}
