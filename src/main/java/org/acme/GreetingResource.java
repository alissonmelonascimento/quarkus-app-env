package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class GreetingResource {

    @Inject
    @ConfigProperty(name = "my-message")
    String myMessage;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        //String myMessage = ConfigProvider.getConfig().getValue("my-message", String.class);
        return myMessage;
    }
}