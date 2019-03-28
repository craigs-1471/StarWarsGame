package data;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

import grid.TileGrid;
import helper.Artist;
import ships.Player;
import static grid.TileGrid.*;

import static org.lwjgl.opengl.GL11.*;

import java.util.Random;

import static helper.Artist.*;

public class Boot {
	
	public Boot() {
		
		beginSession();
		int[][] map = randomGridGenerator();
		TileGrid grid = new TileGrid(map);
		// Player p = new Player(quickLoad("x-wing"), grid.getTile(10, 10), 64, 64);
		Player p = new Player(quickLoad("x-wing"), grid, 64, 64);
		while(!Display.isCloseRequested()) {
			grid.draw();
			p.draw();
			p.movePlayer();
			
			Display.update();
			Display.sync(60);
		}
		Display.destroy();
	}
	
	public static void main(String[] args) {
		new Boot();
	}

}
