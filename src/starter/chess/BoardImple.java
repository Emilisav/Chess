package chess;

import java.util.ArrayList;

//stores all the uncaptured pieces in a Game
public class BoardImple implements ChessBoard{

    public int numSquares = 56;

    private PositionImple[] board = new PositionImple[numSquares];

    // Adds a piece
    @Override
    public void addPiece(ChessPosition position, ChessPiece piece) {
        if(position!=null) {
            board[(position.getColumn()-1) * (position.getRow()-1)] = new PositionImple((position.getColumn()-1),(position.getRow()-1));
            board[(position.getColumn()-1) * (position.getRow()-1)].setPiece(piece);
        }
    }

    // removes a piece
    @Override
    public ChessPiece getPiece(ChessPosition position) {
        ChessPiece p;
        p=board[(position.getColumn()-1)* (position.getRow()-1)].getPiece();
        board[(position.getColumn()-1) * (position.getRow()-1)].setPiece(null);
        return p;
    }

    // Set board to starting config
    @Override
    public void resetBoard() {
        for(int i=0;i<numSquares;i++){
            board[i].setPiece(null);
        }

        // Place peices
        board[1].setPiece(new Rook(ChessGame.TeamColor.WHITE));
        board[2].setPiece(new Knight(ChessGame.TeamColor.WHITE));
        board[3].setPiece(new Bishop(ChessGame.TeamColor.WHITE));
        board[4].setPiece(new Queen(ChessGame.TeamColor.WHITE));
        board[5].setPiece(new King(ChessGame.TeamColor.WHITE));
        board[6].setPiece(new Bishop(ChessGame.TeamColor.WHITE));
        board[7].setPiece(new Knight(ChessGame.TeamColor.WHITE));
        board[8].setPiece(new Rook(ChessGame.TeamColor.WHITE));
        board[9].setPiece(new Pawn(ChessGame.TeamColor.WHITE));
        board[10].setPiece(new Pawn(ChessGame.TeamColor.WHITE));
        board[11].setPiece(new Pawn(ChessGame.TeamColor.WHITE));
        board[12].setPiece(new Pawn(ChessGame.TeamColor.WHITE));
        board[13].setPiece(new Pawn(ChessGame.TeamColor.WHITE));
        board[14].setPiece(new Pawn(ChessGame.TeamColor.WHITE));
        board[15].setPiece(new Pawn(ChessGame.TeamColor.WHITE));
        board[16].setPiece(new Pawn(ChessGame.TeamColor.WHITE));



    }
}
