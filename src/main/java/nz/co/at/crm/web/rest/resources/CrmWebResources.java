package nz.co.at.crm.web.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/crm/v1")
public class CrmWebResources {

	private static final Logger LOGGER = LoggerFactory.getLogger(CrmWebResources.class);

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response processCrmcases(final String crmCaseJson) throws Exception {
		LOGGER.info("crmCaseJson:{} ",crmCaseJson);
		return Response.ok(crmCaseJson).type(MediaType.APPLICATION_JSON).build();
	}
}
