package org.woodmen.demo.route;

import org.apache.camel.builder.RouteBuilder;
import org.woodmen.demo.process.CertificateValidationProcessor;

public class CertificateValidationRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("cxfrs:bean:certificateValidationEndpoint")
				.process(new CertificateValidationProcessor())
				.to("log:org.woodmen.demo?level=INFO").end();
	}

}
