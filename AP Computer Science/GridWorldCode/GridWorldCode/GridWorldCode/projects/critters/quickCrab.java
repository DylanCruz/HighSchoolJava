import info.gridworld.grid.*;
import info.gridworld.actor.*;
import java.util.ArrayList;
import java.awt.Color;
/**
 * Write a description of class quickCrab here.
 * 
 * @author Dylan Cruz & Peter Bruschi
 * @version (a version number or a date)
 */
public class quickCrab extends CrabCritter
{
	public ArrayList <Location> getMoveLocations()
	{
		ArrayList<Location> locs = new ArrayList<Location>();
		Location locz = getLocation();
		int[] dirs ={Location.LEFT, Location.RIGHT };
		for (Location loc : getLocationsInDirections(dirs))
		{
			if (getGrid().get(loc) == null)
			{
				if (((locz.getAdjacentLocation(Location.LEFT)).getAdjacentLocation(Location.LEFT)).equals(loc))
				{
					if (getGrid().get(locz.getAdjacentLocation(Location.LEFT)) == null)
						locs.add(loc);
				}
				else
				{
					if (getGrid().get(locz.getAdjacentLocation(Location.RIGHT)) == null)
						locs.add(loc);
				}
			}
		}
		return locs;
	}
	public ArrayList <Location> getLocationsInDirections(int[] directions)
	{
		ArrayList<Location> locs = new ArrayList<Location>();
		Grid gr = getGrid();
		Location loc = getLocation();
		for (int d : directions)
		{
			Location neighborLoc = loc.getAdjacentLocation(getDirection()+d);
			if (gr.isValid(neighborLoc.getAdjacentLocation(getDirection()+d)))
				locs.add(neighborLoc.getAdjacentLocation(getDirection()+d));
		}
		return locs;
	}
}