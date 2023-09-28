package chess;

import java.util.Collection;

public class Pawn implements ChessPiece{
    ChessGame.TeamColor teamColor;


    public Pawn(ChessGame.TeamColor color){
        teamColor=color;
    }
    @Override
    public ChessGame.TeamColor getTeamColor() {
        return null;
    }

    @Override
    public PieceType getPieceType() {
        return null;
    }

    // Gets a position and returns all moves piece can make
    // Does not check turn or for check
    // Accounts for other peices blocking path
    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        // May move foreward 1 aquare if unoccupied
        // If first time being moved, can move 2 if both unoccupied
        // can capture diagonally
        // If white row=8 or black row=1, pawn gets promoted and replaced with R,N,B, or Q
        return null;
    }
}
