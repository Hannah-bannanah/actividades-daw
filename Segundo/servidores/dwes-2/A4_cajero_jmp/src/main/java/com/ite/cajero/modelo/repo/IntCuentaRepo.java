/**
 * 
 */
package com.ite.cajero.modelo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ite.cajero.modelo.beans.Cuenta;

/**
 * @author hannah
 *
 */
public interface IntCuentaRepo extends JpaRepository<Cuenta, Integer>{

}
