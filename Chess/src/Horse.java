public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "H";
    }

    @Override
    public boolean moveToPositionCheck(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int lineDiff = Math.abs(line - toLine);
        int columnDiff = Math.abs(column - toColumn);

        boolean canMove = (lineDiff == 2 && columnDiff == 1) || (lineDiff == 1 && columnDiff == 2);

        return canMove;
    }
}
