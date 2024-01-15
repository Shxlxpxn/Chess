public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "Q";
    }

    @Override
    public boolean moveToPositionCheck(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean diagonalMove = Math.abs(line - toLine) == Math.abs(column - toColumn);
        boolean straightLineMove = (line == toLine) != (column == toColumn);

        return diagonalMove || straightLineMove;
    }
}