import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.ArrayList;
/**
 * Write a description of class rockHound here.
 * 
 * @author Dylan Cruz & Peter Bruschi
 * @version (a version number or a date)
 */
public class rockHound extends Critter
{
    public void processActors(ArrayList<Actor> actors)
    {
        for(Actor a : actors)
        {
            if((!(a instanceof Critter)))
                a.removeSelfFromGrid();
        }
    }
}
