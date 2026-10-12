package org.springframework.samples.petclinic.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HealthCheckController {

	final private String health_status = "System is up and running";

	@GetMapping("/api/ping")
	public String healthCheck() {
		return health_status;
	}

}