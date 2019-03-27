package grid;
import static helper.Artist.*;

public class TileGrid {
	
	public Tile[][] map;
	
	public TileGrid() {
		map = new Tile[20][15];
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space1);
			}
		}
	}
	
	public TileGrid(int[][] newMap) {
		map = new Tile[20][15];
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				switch (newMap[j][i]) {
				case 1:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space1);
					break;
				case 2:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space2);
					break;
				case 3:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space3);
					break;
				case 4:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space4);
					break;
				case 5:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space5);
					break;
				case 6:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space6);
					break;
				case 7:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space7);
					break;
				case 8:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space8);
					break;
				case 9:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space9);
					break;
				case 10:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space10);
					break;
				case 11:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space11);
					break;
				case 12:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space12);
					break;
				case 13:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space13);
					break;
				case 14:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space14);
					break;
				case 15:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space15);
					break;
				case 16:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space16);
					break;
				case 17:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space17);
					break;
				case 18:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space18);
					break;
				case 19:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space19);
					break;
				case 20:
					map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Space20);
					break;
				}
			}
		}
	}
	
	public void setTile(int xCoord, int yCoord, TileType type) {
		map[xCoord][yCoord] = new Tile(xCoord * 64, yCoord * 64, 64, 64, type);
	}
	
	public Tile getTile(int xCoord, int yCoord) {
		return map[xCoord][yCoord];
	}
	
	public void draw() {
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				Tile t = map[i][j];
				drawQuadTex(t.getTexture(), t.getX(), t.getY(), t.getWidth(), t.getHeight());
			}
		}
	}
}
