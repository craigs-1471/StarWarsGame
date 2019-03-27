package ships;
import static helper.Artist.*;
import org.newdawn.slick.opengl.Texture;

import grid.Tile;

public class Player {
	
	private int width, height, health;
	float x, y;
	private Texture texture;
	private Tile startTile;
	
	public Player(Texture texture, Tile startTile, int width, int height) {
		setTexture(texture);
		setX(startTile.getX());
		setY(startTile.getY());
		setWidth(width);
		setHeight(height);
	}
	
	public void draw() {
		drawQuadTex(texture, x, y, width, height);
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
	
}
