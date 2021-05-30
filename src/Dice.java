import java.util.Arrays;
import java.util.Random;

public class Dice {
//Attributes:
    int amountOfDice = 1;
    int amountOfSidesPerDie = 6;
    int MAX_MODIFIERS = 10;
    int[] modifiers = new int[MAX_MODIFIERS];
    Random die = new Random();

//Methods
    /**
     * Fill the modifiers array with 0s
     * This is done to prevent the complexity of null values in the array
     */
    void initializeModifiers() {
        Arrays.fill(modifiers, 0);
    }

    /**
     * Get amount of dice
     * @return the amount
     */
    public int getAmountOfDice() {
        return amountOfDice;
    }

    /**
     * Get Amount of Sides Per Die
     * @return the amount
     */
    public int getAmountOfSidesPerDie() {
        return amountOfSidesPerDie;
    }

    /**
     * Get the max modifiers constant
     * @return the number
     */
    public int getMAX_MODIFIERS() {
        return MAX_MODIFIERS;
    }

    /**
     * Get modifiers value array
     * @return the array
     */
    public int[] getModifiers() {
        return modifiers;
    }

    /**
     * set amount of dice
     * @param amountOfDice the amount
     */
    public void setAmountOfDice(int amountOfDice) {
        this.amountOfDice = amountOfDice;
    }

    /**
     * set amount of sides per die
     * @param amountOfSidesPerDie the amount
     */
    public void setAmountOfSidesPerDie(int amountOfSidesPerDie) {
        this.amountOfSidesPerDie = amountOfSidesPerDie;
    }

    /**
     * set modifier in a specific array index
     * @param i the index of the modifier array
     * @param modifier the modifier amount
     */
    public void setModifier(int i, int modifier) {
        this.modifiers[i] = modifier;
    }

    /**
     * Add modifier amount to the end of the array if available
     * @param modifier the modifier amount
     */
    void addModifier(int modifier) {
        for (int i = 0; i<getModifiers().length; i++) {
            if (getModifiers()[i]==0) {
                setModifier(i, modifier);
                break;
            }
            else {
                System.out.println("The modifiers are filled up. Sorry");
            }
        }
    }

    /**
     * Remove modifier at specified index
     * @param i index number
     */
    void removeModifier(int i) {
        setModifier(i, 0);
    }

    /**
     * Sum of the modifiers in the array
     * @return the sum
     */
    int sumOfModifiers() {
        int total = 0;
        for (int i = 0; i<getModifiers().length; i++) {
            total += i;
        }
        return total;
    }

    /**
     * Roll 1dY
     * @param numberOfSides Y sides
     * @return a random number between 1 and Y
     */
    public int rollDie(int numberOfSides) {
        return die.nextInt(numberOfSides)+1;
    }

    /**
     * Roll XdY
     * @param numberOfDice X dice
     * @param numberOfSides Y sides
     * @return the sum of Y random numbers between 1 and X
     */
    public int rollDice(int numberOfDice, int numberOfSides) {
        int total = 0;
        for (int i = 0; i<numberOfDice; i++) {
            total += rollDie(numberOfSides);
        }
        return total;
    }

    /**
     * Roll all dice of this class's instance
     * @return the total of XdY+Z
     */
    int rollAllDice() {
        int total = 0;
        total += rollDice(getAmountOfDice(), getAmountOfSidesPerDie());
        total += sumOfModifiers();
        return total;
    }

//Constructors:

    /**
     * creates 1d6
     */
    Dice() {
        initializeModifiers();
    }

    /**
     * creates XdY
     * @param numberOfDice X dice
     * @param numberOfSides Y sides
     */
    Dice(int numberOfDice, int numberOfSides) {
        amountOfDice = numberOfDice;
        amountOfSidesPerDie = numberOfSides;
        initializeModifiers();
    }

    /**
     * creates XdY+Z
     * @param numberOfDice X dice
     * @param numberOfSides Y sides
     * @param mods Z modifier
     */
    Dice(int numberOfDice, int numberOfSides, int[] mods) {
        amountOfDice = numberOfDice;
        amountOfSidesPerDie = numberOfSides;
        modifiers = mods;
        initializeModifiers();
    }
}
