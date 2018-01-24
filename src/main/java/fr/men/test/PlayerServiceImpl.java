package fr.men.test;

import java.util.ArrayList;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.springframework.jmx.support.WebSphereMBeanServerFactoryBean;
import org.springframework.stereotype.Service;

@Service("playerService")
public class PlayerServiceImpl implements IPlayerService {

	/**
	 * this method takes one argument from PathParam and returns a Response
	 */
	@Override
	public Response welcomePlayer(String playerName) {

		if (playerName.toLowerCase().startsWith("fr")) {
			throw new WebApplicationException("Le prénom est null", 400);
		}
		String greetMessage = "Bonjour " + playerName;
		return Response.status(200).entity(greetMessage).build();
	}

	/**
	 * this method takes three argument from PathParam and returns a Response
	 */
	@Override
	public Response getPlayerInfo(String playerName, int age, int matches) {

		String playerInfo = "[name=" + playerName +  ", age=" + age + ", matches=" + matches + "]";
		return Response.status(200).entity(playerInfo).build();
	}
	
	@Override
	public Response beatles()
	{
		ArrayList<Agent> response = new ArrayList<>();
		response.add(new Agent("john", "lennon"));
		response.add(new Agent("paul", "mccartney"));
		response.add(new Agent("george", "harrison"));
		response.add(new Agent("ringo", "starr"));
		return Response.status(200).entity(response).build();
	}

	@Override
	public Response testPost(String body) {
		return Response.status(200).entity("cocucou").build();
	}
}