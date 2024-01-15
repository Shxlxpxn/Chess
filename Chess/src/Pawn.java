public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
    @Override
    public boolean moveToPositionCheck(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        boolean isWhite = this.color.equals("White");
        int dir = isWhite ? 1 : -1;
        ChessPiece pieceAtDestination = chessBoard.board[toLine][toColumn];

        // 1 клетка вперед
        if (column == toColumn && toLine == line + dir && pieceAtDestination == null) {
            return true;
        }

        // Первый ход, 2 клетки
        if (column == toColumn && ((isWhite && line == 1 && toLine == 3) || (!isWhite && line == 6 && toLine == 4))) {
            if (chessBoard.board[line + dir][column] == null && pieceAtDestination == null) {
                return true;
            }
        }

        // По диагонали
        if (Math.abs(column - toColumn) == 1 && toLine == line + dir && pieceAtDestination != null
                && !pieceAtDestination.getColor().equals(this.color)) {
            return true;
        }

        return false;
    }
}
