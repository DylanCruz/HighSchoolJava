import info.gridworld.grid.*;
import java.util.*;
import info.gridworld.grid.Location;
import info.gridworld.actor.*;
import java.util.ArrayList;
/**
 * Write a description of class chameleonKid here.
 * 
 * @author Dylan Cruz & Peter Bruschi
 * @version (a version number or a date)
 */
public class ChameleonKid extends ChameleonCritter
{
	public ArrayList<Actor> getActors()
	{
		ArrayList<Actor> actors = new ArrayList<Actor>();
		Grid<Actor> gr = getGrid();
		Location loc = getLocation();
		if (gr.isValid(loc.getAdjacentLocation(getDirection()+180)) && gr.get(loc.getAdjacentLocation(getDirection()+180)) != null)
		{
			actors.add(gr.get(loc.getAdjacentLocation(getDirection()+180)));
		}
		if (gr.isValid(loc.getAdjacentLocation(getDirection())) && gr.get(loc.getAdjacentLocation(getDirection())) != null)
		{
			actors.add(gr.get(loc.getAdjacentLocation(getDirection())));
		}
		return actors;
	}
}