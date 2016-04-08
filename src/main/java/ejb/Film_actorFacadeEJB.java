package ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import facade.AbstractFacade;
import facade.Film_actorFacade;
import model.Film_actor;

@Stateless
public class Film_actorFacadeEJB extends AbstractFacade<Film_actor> implements Film_actorFacade {
	
	@PersistenceContext(unitName = "sakilaPU")
	private EntityManager em;
	
	public Film_actorFacadeEJB() {
		super(Film_actor.class);
	}

	@Override
	protected EntityManager getEntityManager() {
		return this.em;
	}

}
