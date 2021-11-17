/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nttdata.retostarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author Manuel
 */
@ConfigurationProperties("estados.mensaje")
public class EstadoProperties {
	private String estado ="";

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

	

}