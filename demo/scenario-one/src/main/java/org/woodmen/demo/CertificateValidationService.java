package org.woodmen.demo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.woodmen.demo.domain.CertificateInfo;

@Path("/certificate")
public class CertificateValidationService {
	@GET
	@Path("/status/{certificateNumber}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CertificateInfo status(
			@PathParam("certificateNumber") String certificateNumber) {
		CertificateInfo certificateInfo = new CertificateInfo();
		certificateInfo.setStatus("GOOD");
		return certificateInfo;
	}
}
