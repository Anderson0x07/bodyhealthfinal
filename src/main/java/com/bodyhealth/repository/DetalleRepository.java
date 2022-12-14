package com.bodyhealth.repository;

import com.bodyhealth.model.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DetalleRepository extends JpaRepository<Detalle,Integer> {

    @Query(
            value = "SELECT * from detalle ",
            nativeQuery=true
    )
    List<Detalle> listarActivos();
}
