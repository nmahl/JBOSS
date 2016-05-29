package org.woodmen.demo.process;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.woodmen.demo.domain.CertificateInfo;

public class CertificateValidationProcessor implements Processor {
	public static final Logger log = LoggerFactory
			.getLogger(CertificateValidationProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		Object[] args = exchange.getIn().getBody(Object[].class);
		String certificateNumber = (String) args[0];
		log.debug("Getting status for certificate  '" + certificateNumber + "'");
		CertificateInfo certificateInfo = new CertificateInfo();
		certificateInfo.setStatus("GOOD");
		certificateInfo.setCertificateNumber(certificateNumber);
		exchange.getOut().setBody(certificateInfo);
	}
}
