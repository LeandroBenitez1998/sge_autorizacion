package ar.com.redlink.sge.rest.resource;

import ar.com.redlink.sge.responses.DatosTerminalResponse;
import ar.com.redlink.sge.services.AutorizacionService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/autorizacion")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AutorizacionResource {


    @Inject
    AutorizacionService autorizacionService;


    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }


    @GET
    @Path("/terminal")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getTerminal(@QueryParam("terminalId") Long terminalId) throws Exception {
 
        DatosTerminalResponse terminalData = autorizacionService.getDataTerminal(terminalId);

        if(terminalData == null) {
            throw new WebApplicationException("No se encontraron datos de la terminal", 
                    Response.Status.NO_CONTENT);
        }
        return Response.status(Response.Status.OK).entity(terminalData).build();



    }

} 