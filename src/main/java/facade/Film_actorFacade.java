package facade;

import java.util.List;

import javax.ejb.Local;

import model.Film_actor;

@Local
public interface Film_actorFacade {

	public void create(Film_actor entity);

	public void edit(Film_actor entity);

	public void remove(Film_actor entity);

	public Film_actor find(Object id);

	public List<Film_actor> findAll();

	public List<Film_actor> findRange(int[] range);

	public int count();

}
