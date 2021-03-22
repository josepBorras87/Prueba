package com.scjp.pruebas.miProyectoParaSCJP.Herencia_2;

public class TestShapes {
	public static void main(String[] args) {
		PlayerPiece player = new PlayerPiece();
		TilePiece tile = new TilePiece();
		doShapes(player);
		doShapes(tile);
	}
	
	public static void doShapes(GameShape shape) {
		shape.displayShape();
	}
}
