package chess;

import java.util.Objects;
import java.util.Scanner;

// Represents a possible move a chess piece could make
public class MoveImple implements ChessMove {

    PositionImple start; // start position
    PositionImple end; // end position
    ChessPiece.PieceType promotedPawn = null; // Type of piece a pawn is being promoted to


    public MoveImple(ChessPosition startPosition, ChessPosition endPosition, ChessPiece.PieceType promotionPiece) {
        start = new PositionImple(startPosition.getRow(), startPosition.getColumn()); // start position
        end = new PositionImple(endPosition.getRow(), endPosition.getColumn()); // end position
        promotedPawn = promotionPiece;
    }

    @Override
    public ChessPosition getStartPosition() {
        return start;
    }

    @Override
    public ChessPosition getEndPosition() {
        return end;
    }

    @Override
    public ChessPiece.PieceType getPromotionPiece() {
        return promotedPawn;
    }

    @Override
    public boolean equals (Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoveImple moveImple = (MoveImple) o;
        return Objects.equals(start, moveImple.start) && Objects.equals(end, moveImple.end);
    }

    @Override
    public int hashCode () {
        return Objects.hash(start, end);
    }

    @Override
    public String toString () {
        return String.format("\nFrom " + start.toString() + " to " + end.toString());
    }
}
