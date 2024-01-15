public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "B";
    }

    @Override
    public boolean moveToPositionCheck(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {

        int lineDiff = Math.abs(line - toLine);
        int columnDiff = Math.abs(column - toColumn);

        boolean canMove = (lineDiff == columnDiff);

        return canMove;

    }
}
