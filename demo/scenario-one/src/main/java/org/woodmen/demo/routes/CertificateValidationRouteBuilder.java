package org.woodmen.demo.routes;

import org.apache.camel.builder.RouteBuilder;

public class CertificateValidationRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxfrs:bean:certificateValidationEndpoint").to(
				"log:org.woodmen.demo?level=INFO").end();
	}

}
