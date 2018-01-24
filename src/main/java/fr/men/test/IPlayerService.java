package fr.men.test;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/player")
@Api(value = "Services concernant les joueurs")
public interface IPlayerService {

	// http://localhost:8080/ApacheCXF-PathParam/services/player/welcome/Dravid
	@GET
	@ApiOperation(value = "Salutation des joueurs")
	  @ApiResponses(value = {
	    @ApiResponse(code = 200, message = "Operation OK"),
	    @ApiResponse(code = 400, message = "Si le prenom commence par fr")
	  })
	@Path("/welcome/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response welcomePlayer(@PathParam("name") @ApiParam(value = "Nom du joueur") String playerName);
	
	@POST
	@Path("/testPost")
	@ApiOperation(value = "Test post")
	@Produces(MediaType.TEXT_PLAIN)
	public Response testPost(@ApiParam(value = "Corps du post") String body); 
	
	
	@GET
	@Path("/beatles")
	@ApiOperation(value = "Liste les Beatles")
	  @ApiResponses(value = {
	    @ApiResponse(code = 200, message = "Operation OK", response = Agent.class, responseContainer = "Array" ),
	  })
	@Produces(MediaType.APPLICATION_JSON)
	public Response beatles(); 
	
	// http://localhost:8080/ApacheCXF-PathParam/services/player/playerinfo/Sachin/41/200
	@GET
	@Path("playerinfo/{name}/{age}/{matches}")
	public Response getPlayerInfo(
			@PathParam("name") String playerName, 
			@PathParam("age") int age, 
			@PathParam("matches") int matches);
}