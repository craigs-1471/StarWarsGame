package grid;

public enum TileType {
	
	Space1("space64-1"), Space2("space64-2"), Space3("space64-3"), Space4("space64-4"), Space5("space64-5"),
	Space6("space64-6"), Space7("space64-7"), Space8("space64-8"), Space9("space64-9"), Space10("space64-10"),
	Space11("space64-11"), Space12("space64-12"), Space13("space64-13"), Space14("space64-14"), Space15("space64-15"),
	Space16("space64-16"), Space17("space64-17"), Space18("space64-18"), Space19("space64-19"), Space20("space64-20");
	
	String textureName;
	
	TileType(String textureName) {
		this.textureName = textureName;
	}
	
}
