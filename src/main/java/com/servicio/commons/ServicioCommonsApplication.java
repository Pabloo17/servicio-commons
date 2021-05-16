package com.servicio.commons;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
/**
 * para poder quitar la bbdd ya que sin esta falla
 *
 * @author Pablo
 */
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ServicioCommonsApplication {}
