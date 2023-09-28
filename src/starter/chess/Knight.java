package chess;

import java.util.Collection;

public class Knight implements ChessPiece{

    ChessGame.TeamColor teamColor;


    public Knight(ChessGame.TeamColor color){
        teamColor=color;
    }

    @Override
    public ChessGame.TeamColor getTeamColor() {
        return null;
    }

    @Override
    public PieceType getPieceType() {
        return PieceType.KNIGHT;
    }

    // Gets a position and returns all moves piece can make
    // Does not check turn or for check
    // Accounts for other peices blocking path
    @Override
    public Collection<ChessMove> pieceMoves(ChessBoard board, ChessPosition myPosition) {
        // move in L shap 2 the n1
        // Can ignore inbetween squares
        // land on a peice and capture
        return null;
    }
}
