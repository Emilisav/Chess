package chess;

import java.util.Collection;

public class King implements ChessPiece{
    ChessGame.TeamColor teamColor;


    public King(ChessGame.TeamColor color){
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
        // Can move 1 square and direction (diagonal)
        // Captures piece there or just moves there
        //Can't make moves that will allow opponent to capture King
        // If in danger, must move to sfae position
        return null;
    }
}
