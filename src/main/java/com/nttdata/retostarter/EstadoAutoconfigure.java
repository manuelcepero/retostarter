/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nttdata.retostarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Manuel
 */
@Configuration
@ConditionalOnClass(Estado.class)
@EnableConfigurationProperties(EstadoProperties.class)
public class EstadoAutoconfigure {

	private final EstadoProperties properties;
	
	public EstadoAutoconfigure(EstadoProperties properties) {
		this.properties= properties;
	}
	
	@Bean
	public Estado saludo() {
		System.out.println("Estado: "+properties.getEstado());
		return new Estado(properties.getEstado());
	}
}