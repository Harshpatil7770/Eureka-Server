package com.cbank.server.bootstrap;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class EurekaServer {

	@EventListener(ApplicationReadyEvent.class)
	public void bootStrap() {
		log.info("*************************************************************************");
		log.info("*************************************************************************");
		log.info("***************************** Eureka Server *****************************");
		log.info("*************************************************************************");
		log.info("*************************************************************************");
		
	}
}
