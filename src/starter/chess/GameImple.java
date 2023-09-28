package chess;

import java.util.Collection;

// responsible for executing moves as well as reporting the game status
public class GameImple implements ChessGame{
    @Override
    public TeamColor getTeamTurn() {
        return null;
    }

    @Override
    public void setTeamTurn(TeamColor team) {

    }

    // Gets a position
    // return all positions the piece can make or null if no piece at position
    @Override
    public Collection<ChessMove> validMoves(ChessPosition startPosition) {

        return null;
    }

    //Gets a move, check if legal, exucute
    // Throws InvalidMoveException
    // illegal- if piece can't move there, if move leaves king in danger, or if it’s not the corresponding teams turn.
    @Override
    public void makeMove(ChessMove move) throws InvalidMoveException {

    }

    //eturns true if the specified team’s King could be captured by an opposing piece.
    @Override
    public boolean isInCheck(TeamColor teamColor) {
        return false;
    }

    // Returns true if team has no way to protect king from being captured
    @Override
    public boolean isInCheckmate(TeamColor teamColor) {
        return false;
    }

    //Returns true if the given team has no legal moves and it is currently that team’s turn.
    @Override
    public boolean isInStalemate(TeamColor teamColor) {
        return false;
    }

    @Override
    public void setBoard(ChessBoard board) {

    }

    @Override
    public ChessBoard getBoard() {
        return null;
    }
}
