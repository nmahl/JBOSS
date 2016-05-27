package org.blogdemo.claimdemo;

import java.util.Arrays;
import java.util.Date;

import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.Exchange;

public class RestServiceRouteBuilder extends RouteBuilder {
	private String restEndpoint;
	
	@Override
	public void configure() throws Exception {
		from(restEndpoint)
				.recipientList(simple("direct:${header.operationName}"));


		from("direct:getPost")
				.process(new Processor() {
					@Override
					public void process(Exchange exchange) throws Exception {
						Post blogPost = new Post();
						blogPost.setId(exchange.getIn().getHeader("id", Integer.class));
						blogPost.setTitle("My Title");
						blogPost.setContent("##Secondary title");
						blogPost.setTags(Arrays.asList("interesting"));
						blogPost.setPublishedDate(new Date());
						exchange.getIn().setBody(blogPost);
					}
				}).end();
	}

	public void setRestEndpoint(String restEndpoint) {
		this.restEndpoint = restEndpoint;
	}
}
