public class Rook extends ChessPiece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "R";
    }

    @Override
    public boolean moveToPositionCheck(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        boolean canMove = (line == toLine && column != toColumn) || (line != toLine && column == toColumn);

        return canMove;

    }
}