package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

    public Pawn(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() { return "P";}

    @Override
    public boolean[][] possibleMoves() {

        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        if (getColor() == Color.WHITE) {

            // Um movimento para frente
            p.setValues(position.getRow() - 1, position.getColumn());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }

            if (getMoveCount() == 0 ) { // Primeira jogada peão pode mover 2 casas, versão do Nelio Instanceia tudo para
                                        // depois testar o MoveCount , testando aqui ganhamos milis de processamento!

                p.setValues(position.getRow() - 2, position.getColumn());
                Position p2 = new Position(position.getRow() - 1, position.getColumn());
                if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)
                        && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2)) {
                    mat[p.getRow()][p.getColumn()] = true;
                }
            }

            // Um movimento para diagonal esquerda
            p.setValues(position.getRow() - 1, position.getColumn() - 1);
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }

            // Um movimento para diagonal direita
            p.setValues(position.getRow() - 1, position.getColumn() + 1);
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }
        } else {

            // Um movimento para frente
            p.setValues(position.getRow() + 1, position.getColumn());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }

            if (getMoveCount() == 0 ) { // Primeira jogada peão pode mover 2 casas, versão do Nelio Instanceia tudo para
                // depois testar o MoveCount , testando aqui ganhamos milis de processamento!

                p.setValues(position.getRow() + 2, position.getColumn());
                Position p2 = new Position(position.getRow() + 1, position.getColumn());
                if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)
                        && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2)) {
                    mat[p.getRow()][p.getColumn()] = true;
                }
            }

            // Um movimento para diagonal esquerda
            p.setValues(position.getRow() + 1, position.getColumn() - 1);
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }

            // Um movimento para diagonal direita
            p.setValues(position.getRow() + 1, position.getColumn() + 1);
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }

        }

        return mat;
    }
}
