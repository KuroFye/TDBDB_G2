package service;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import facade.Film_actorFacade;
import model.Film_actor;

@Path("/filmactors")
public class Film_actorService {
	
	@EJB 
	Film_actorFacade filmActorFacadeEJB;
	
	Logger logger = Logger.getLogger(Film_actorService.class.getName());
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Film_actor> findAll(){
		return filmActorFacadeEJB.findAll();
	}
	

}