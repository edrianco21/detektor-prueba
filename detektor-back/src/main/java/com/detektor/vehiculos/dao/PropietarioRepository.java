package com.detektor.vehiculos.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.detektor.vehiculos.models.Propietario;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

@Repository
public interface PropietarioRepository extends JpaRepository<Propietario, Long>{

}
