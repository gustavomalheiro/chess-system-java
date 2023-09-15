package chess;

import boardgame.Board;
import boardgame.Position;
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

    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
    }
}
