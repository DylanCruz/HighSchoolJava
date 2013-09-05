import info.gridworld.grid.*;
import info.gridworld.actor.*;
import java.util.ArrayList;
import java.awt.Color;
/**
 * Write a description of class kingCrab here.
 * 
 * @author Dylan Cruz & Peter Bruschi
 * @version (a version number or a date)
 */

public class KingCrab extends CrabCritter
{
	public void processActors(ArrayList<Actor> actors)							
	{
		Location loc;
		Location tempLoc;
		for (Actor a: actors)
		{
			if (a instanceof Actor)
			{
				loc = a.getLocation();
				tempLoc = loc.getAdjacentLocation(getLocation().getDirectionToward(loc));
				if (getGrid().isValid(tempLoc) && getGrid().get(tempLoc) == null)		
					a.moveTo(tempLoc);			
				else
					a.removeSelfFromGrid();
			}
		}
	}
}
