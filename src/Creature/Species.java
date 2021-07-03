package Creature;

/**
 * Species are a base template for each creature before they became chimera
 */
public class Species {
    // stats
    String speciesName;
    private int maxHeads = 1;
    private int maxArms = 2;
    private int maxLegs = 2;
    private int maxTails = 0;

    boolean isValid(int input) {
        return input>0;
    }

    //getters & setters

    /**
     * Get the maximum amount of heads this species can have by default
     * @return the max heads
     */
    public int getMaxHeads() {
        return maxHeads;
    }

    /**
     * Set the maximum amount of heads this species can have
     * @param maxHeads the new amount of heads
     */
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
    /**
     * Set the maximum amount of arms this species can have
     * @param maxArms the new amount of arms
     */
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
    /**
     * Set the maximum amount of legs this species can have
     * @param maxLegs the new amount of legs
     */
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
    /**
     * Set the maximum amount of tails this species can have
     * @param maxTails the new amount of tails
     */
    public void setMaxTails(int maxTails) {
        this.maxTails = maxTails;
    }

    /**
     * get the current max limb total of limbs for this species
     * @return the current max limb total
     */
    public int getMaxLimbTotal() {
        return (maxHeads + maxArms + maxLegs + maxTails);
    }

    // Constructors
    Species() {
        speciesName = "humanoid";
    }

    Species(String name) {
        speciesName = name;
    }

    Species(String name, int tailNum) {
        speciesName = name;
        maxTails = tailNum; //usually 1
    }

    Species(String name, int headNum, int armNum, int legNum, int tailNum) {
        speciesName = name;
        maxHeads = headNum; //usually 1
        maxArms = armNum;   //usually 2
        maxLegs = legNum;   //usually 2
        maxTails = tailNum; //usually 1
    }
}
