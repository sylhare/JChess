package legacy;

/**
 * The ChessPawn class is used to define the pawns of a board
 *
 * Created by sylhare on 2017-05-03.
 */
public class ChessPawn {
    private ChessRules.Variable variable;
    private String color; // Black or white
    private String position;


    public ChessPawn(ChessRules.Variable variable, String color) {
        this.variable = variable;
        this.color = color;
    }


    /**
     * Set the position for example "a5" in a chess array
     * from a computer position in a 2D array (from 0 to 7)
     *
     * Example:
     *  a5 is x = 0 and y = 4
     *
     *  a -(ASCII)-> 97 so x + 97 gives a when x is 0
     *  The chess board goes from 1 to 8 (not 0 to 7 for an array)
     *
     * @param x
     * @param y
     */
    public void setPosition(int x, int y) {
        char letter = (char) (x + 97);
        char number = Character.forDigit(y + 1, 10);
        this.position = "" + letter + number;
        this.position = new String(new char[]{letter, number});
    }

    /**
     * Get the numerical position of a chess array and
     * convert it into coordinates for computer array.
     *
     * Example:
     *  b4 is x = 1 and y = 3
     *
     * @return array coordinate x and y between 0 to 7
     */
    public int[] getPosition() {
        int x = (int) position.charAt(0) - 97;
        int y = (int) position.charAt(1) - 1;

        return new int[]{x, y};
    }

    public int getValue() {
        return variable.getValue();
    }

    public String getColor() {
        return color;
    }
}
