package chess;

import boardgame.Board;

// nessa classe terao as regras do nosso jogo de xadrez
public class ChessMatch {

    private Board board;

    // quem tem que saber a dimensao de um tabuleiro de xadrez é a classe ChessMatch
    public ChessMatch() {
        board = new Board(8,8);
    }

    // o programa vai enxergar apenas a camada de xadrez
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i < board.getRows(); i++) {
            for (int j=0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece)board.piece(i, j);
            }
        }
        return mat;
    }
}
