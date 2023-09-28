package chess;

import java.util.Collection;

public class Rook implements ChessPiece{
    ChessGame.TeamColor teamColor;


    public Rook(ChessGame.TeamColor color){
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
        // move in stright lines as long as there is open space
        // can land on piece and capture then stop
        return null;
    }
}
