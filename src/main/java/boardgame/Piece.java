package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Position position, Board board) {
        this.position = null; // atribuindo nulo apenas por didatica
        this.board = board;
    }
    // somente classes dentro do mesmo pacote e sub classes acessam o tabuleiro interno da camada tabuleiro
    protected Board getBoard() {
        return board;
    }

}
