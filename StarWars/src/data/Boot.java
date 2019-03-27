package data;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

import grid.TileGrid;
import helper.Artist;
import ships.Player;

import static org.lwjgl.opengl.GL11.*;

import java.util.Random;

import static helper.Artist.*;

public class Boot {
	
	public Boot() {
		
		beginSession();
		Random random = new Random();
		int gridWidth = Artist.WIDTH;
		int gridHeight = Artist.HEIGHT;
		int[][] map = new int[gridWidth][gridHeight];
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				int randInt = random.nextInt(20) + 1;
				map[i][j] = randInt;
			}
		}

		TileGrid grid = new TileGrid(map);
		Player p = new Player(quickLoad("x-wing"), grid.getTile(10, 10), 64, 64);
		while(!Display.isCloseRequested()) {
			grid.draw();
			p.draw();
			Display.update();
			Display.sync(60);
		}
		Display.destroy();
	}
	
	public static void main(String[] args) {
		new Boot();
	}

}
