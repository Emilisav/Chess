package chess;

import java.util.Collection;

public class Queen implements ChessPiece{
    ChessGame.TeamColor teamColor;


    public Queen(ChessGame.TeamColor color){
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
        // move straight and diagonal as far as their is open space
        // at end capture a peice
        return null;
    }
}
