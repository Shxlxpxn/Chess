abstract public class ChessPiece {
    protected String color;
    protected boolean check = true;

    public ChessPiece ( String color ) {
        this.color = color;
    }

    abstract public String getColor ( );

    public final boolean canMoveToPosition ( ChessBoard chessBoard , int line , int column , int toLine , int toColumn ) {
        if ( toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7 ) {
            return false;
        }
        if ( line == toLine && column == toColumn ) {
            return false;
        }

        return moveToPositionCheck ( chessBoard , line , column , toLine , toColumn );
    }

    abstract public boolean moveToPositionCheck ( ChessBoard chessBoard , int line , int column , int toLine , int toColumn );

    abstract public String getSymbol ( );
}
