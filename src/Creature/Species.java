package Creature;

/**
 * Species are a base template for each creature before they became chimera
 */
public class Species {
    //
    String speciesName;
    private int maxHeads = 1;



    private int maxArms = 0;
    private int maxLegs = 0;
    private int maxTails = 0;
    private int maxLimbs = maxHeads + maxArms + maxLegs + maxTails;

    boolean isValid(int input) {
        return input>0;
    }

    //getters/setters

    /**
     * Get the maximum amount of heads this species can have by default
     * @return the max heads
     */
    public int getMaxHeads() {
        return maxHeads;
    }

    public void setMaxHeads(int maxHeads) {
        this.maxHeads = maxHeads;
    }

    /**
     * Get the maximum amount of arms this species can have by default
     * @return the max arms
     */
    public int getMaxArms() {
        return maxArms;
    }

    public void setMaxArms(int maxArms) {
        this.maxArms = maxArms;
    }


    /**
     * Get the maximum amount of legs this species can have by default
     * @return the max legs
     */
    public int getMaxLegs() {
        return maxLegs;
    }

    public void setMaxLegs(int maxLegs) {
        this.maxLegs = maxLegs;
    }

    /**
     * Get the maximum amount of tails this species can have by default
     * @return the max tails
     */
    public int getMaxTails() {
        return maxTails;
    }

    public void setMaxTails(int maxTails) {
        this.maxTails = maxTails;
    }

    /**
     * Get the maximum amount of total limbs this species can have by default
     * @return the max limbs
     */
    public int getMaxLimbs() {
        return maxLimbs;
    }

    public void setMaxLimbs(int maxLimbs) {
        this.maxLimbs = maxLimbs;
    }


    // Constructors
    Species() {
        speciesName = "humanoid";
        maxHeads = 1;
        maxArms = 2;
        maxLegs = 2;
    }

    Species(String name) {
        speciesName = name;
        maxHeads = 1;
        maxArms = 2;
        maxLegs = 2;
    }

    Species(String name, int tailNum) {
        speciesName = name;
        maxHeads = 1;
        maxArms = 2;
        maxLegs = 2;
        maxTails = tailNum; //usually 1
    }

    Species(String name, int headNum, int armNum, int legNum, int tailNum) {
        speciesName = name;
        maxHeads = headNum;
        maxArms = armNum;
        maxLegs = legNum;
        maxTails = tailNum; //usually 1
    }
}
