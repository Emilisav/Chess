package chess;

import java.util.Collection;

public class Bishop implements ChessPiece{
    ChessGame.TeamColor teamColor;

    public Bishop(ChessGame.TeamColor color){
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
        board.getPiece(myPosition);
        // move in diagonal while space
        // if enemy piece at end can capture
        return null;
    }
}
