package com.detektor.vehiculos.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.detektor.vehiculos.models.Vehiculo;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

	@Query(value = "SELECT * FROM vehiculos u WHERE u.propietario = ?1", nativeQuery = true)
	List<Vehiculo> findVehiculosByPropietario(Long id);
}
