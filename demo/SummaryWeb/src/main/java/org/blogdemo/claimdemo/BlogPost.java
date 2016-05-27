package org.blogdemo.claimdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/post/")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
public class BlogPost {
	
	@GET
	@Path("/{id}")
	public Post getPost(@PathParam("id") String postId) {
		return null;
	}

}