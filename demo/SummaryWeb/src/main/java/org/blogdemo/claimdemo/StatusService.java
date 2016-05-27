package org.blogdemo.claimdemo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/status")
public class StatusService {
	@GET
	@Path("/custId/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ClaimStatus status(@PathParam("id") String custId) {
		ClaimStatus claimStatus = new ClaimStatus();
		claimStatus.setStatus("OK" );
		System.err.println("custId " + custId);
		return claimStatus;
	}

	@GET
	@Path("/restcancel/{claimNumber}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ClaimStatus restCancel(@PathParam("claimNumber") String claimNumber) {
		ClaimStatus claimStatus = new ClaimStatus();

		return claimStatus;
	}
}
