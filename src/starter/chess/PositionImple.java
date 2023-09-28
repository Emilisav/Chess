package chess;

import java.util.Objects;

// Represents a location on the chessboard
public class PositionImple implements ChessPosition{

    private int row; // row number 1-8
    private int column; // column number 1-8

    ChessPiece piece;

    public PositionImple(int r, int c){
        row = r;
        column=c;
    }

    public void setPiece(ChessPiece p){piece=p;}
    public ChessPiece getPiece(){return piece;}

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionImple that = (PositionImple) o;
        return row == that.row && column == that.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }

    @Override
    public String toString() {

        return String.format("%s%d",(char)('a'+row-1),(column-1));
    }
}
