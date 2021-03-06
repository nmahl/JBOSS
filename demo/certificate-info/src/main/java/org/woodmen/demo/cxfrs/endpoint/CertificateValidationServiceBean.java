package org.woodmen.demo.cxfrs.endpoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/certificate")
public class CertificateValidationServiceBean {

	@GET
	@Path("/status/{certificateNumber}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String status(
			@PathParam("certificateNumber") String certificateNumber) {
		return null;
	}
}
