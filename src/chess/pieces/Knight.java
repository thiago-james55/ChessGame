package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) { super(board, color); }

    @Override
    public String toString() { return "N"; }

    @Override
    public boolean[][] possibleMoves() {

        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        //2-Above Left
        p.setValues(position.getRow()-2, position.getColumn() - 1);
        if ( ( getBoard().positionExists(p) ) && ( ( !getBoard().thereIsAPiece(p) ) || (isThereAnyOpponentPiece(p)) ) ) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //2-Above Right
        p.setValues(position.getRow()-2, position.getColumn() + 1);
        if ( ( getBoard().positionExists(p) ) && ( ( !getBoard().thereIsAPiece(p) ) || (isThereAnyOpponentPiece(p)) ) ) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //2-Right UP
        p.setValues(position.getRow()-1, position.getColumn() + 2);
        if ( ( getBoard().positionExists(p) ) && ( ( !getBoard().thereIsAPiece(p) ) || (isThereAnyOpponentPiece(p)) ) ) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //2-Right Down
        p.setValues(position.getRow()+1, position.getColumn() + 2);
        if ( ( getBoard().positionExists(p) ) && ( ( !getBoard().thereIsAPiece(p) ) || (isThereAnyOpponentPiece(p)) ) ) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //2-Above Right
        p.setValues(position.getRow() + 2, position.getColumn() + 1);
        if ( ( getBoard().positionExists(p) ) && ( ( !getBoard().thereIsAPiece(p) ) || (isThereAnyOpponentPiece(p)) ) ) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //2-Above Left
        p.setValues(position.getRow() + 2, position.getColumn() - 1);
        if ( ( getBoard().positionExists(p) ) && ( ( !getBoard().thereIsAPiece(p) ) || (isThereAnyOpponentPiece(p)) ) ) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //2-Left Down
        p.setValues(position.getRow()-1, position.getColumn() - 2);
        if ( ( getBoard().positionExists(p) ) && ( ( !getBoard().thereIsAPiece(p) ) || (isThereAnyOpponentPiece(p)) ) ) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        //2-Left UP
        p.setValues(position.getRow()+1, position.getColumn() - 2);
        if ( ( getBoard().positionExists(p) ) && ( ( !getBoard().thereIsAPiece(p) ) || (isThereAnyOpponentPiece(p)) ) ) {
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}
