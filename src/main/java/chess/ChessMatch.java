package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

// nessa classe terao as regras do nosso jogo de xadrez
public class ChessMatch {

    private Board board;

    // quem tem que saber a dimensao de um tabuleiro de xadrez é a classe ChessMatch
    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
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

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 1, new King(board, Color.WHITE));
    }
}
