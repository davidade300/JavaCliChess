package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece( Board board) {		
		this.board = board;
		//para enfatizar que a posicao inicial e nula.
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	
}
