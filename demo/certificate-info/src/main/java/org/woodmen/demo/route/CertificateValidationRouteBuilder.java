package org.woodmen.demo.route;

import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class CertificateValidationRouteBuilder extends RouteBuilder {

	private Processor processor;

	@Override
	public void configure() throws Exception {
		from("cxfrs:bean:certificateValidationEndpoint").process(processor)
				.to("log:org.woodmen.demo?level=INFO").end();
	}

	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

}
