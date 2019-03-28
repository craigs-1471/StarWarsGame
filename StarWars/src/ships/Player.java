package ships;
import static helper.Artist.*;

import java.util.Random;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.opengl.Texture;
import static grid.TileGrid.*;

import grid.Tile;
import grid.TileGrid;
import helper.Artist;

public class Player extends SpaceShip {
	
	private TileGrid grid;
	private int width, height, health;
	float x, y;
	private Texture texture;
	private Tile locationTile;
	/*
	public Player(Texture texture, Tile startTile, int width, int height) {
		setTexture(texture);

		setX(startTile.getX());
		setY(startTile.getY());
		setWidth(width);
		setHeight(height);
	}
	*/
	public Player(Texture texture, TileGrid grid, int width, int height) {
		setTexture(texture);
		Tile tile = grid.getRandomTile();
		setLocationTile(tile);
		setX(tile.getX());
		setY(tile.getY());
		setWidth(width);
		setHeight(height);
		setGrid(grid);
	}
	
	public void movePlayer() {
		int height = Artist.getHeight();
		Tile newLocation = grid.getTile((int) Math.floor(Mouse.getX() / 64), (int) Math.floor((height - Mouse.getY() - 1)/ 64));
		setLocationTile(newLocation);
		setX(newLocation.getX());
		setY(newLocation.getY());
	}
	
	public void draw() {
		drawQuadTex(texture, x, y, width, height);
	}
	
	public Tile getLocationTile() {
		return locationTile;
	}

	public void setLocationTile(Tile locationTile) {
		this.locationTile = locationTile;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}

	public TileGrid getGrid() {
		return grid;
	}

	public void setGrid(TileGrid grid) {
		this.grid = grid;
	}
	
}
