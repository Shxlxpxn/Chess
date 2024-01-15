public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getSymbol() {
        return "K";
    }

    @Override
    public boolean moveToPositionCheck(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int lineDiff = Math.abs(toLine - line);
        int columnDiff = Math.abs(toColumn - column);

        boolean canMove = (lineDiff <= 1 && columnDiff <= 1);

        return canMove;
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        for (int i = 0; i < 8; i++){
            for (int k = 0; k < 8; k++){
                ChessPiece piece = chessBoard.board[i][k];
                if (piece != null && !piece.getColor().equals(this.color) && piece.moveToPositionCheck(chessBoard, i, k, line, column)){
                    return true;
                }
            }
        }
        return false;
    }
}