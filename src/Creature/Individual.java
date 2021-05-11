package Creature;

public class Individual extends Species {

// Attributes:
    String name;
    int KNO = 0;
    int POW = 0;
    int END = 0;
    int SPD = 0;
    int ESP = 0;

    int currentHeads = 1;
    int currentArms = 0;
    int currentLegs = 0;
    int currentTails = 0;

    String[] skills = new String[100];
    String[] techniques = new String[100];

//Methods:
    /*
    validateSkill(skillName)
        isValid = false
        for i in skills.length
            if skills[i] == skillName
                isValid = true
        return isValid

    doSkill(skillName)
        if validateSkill(skillName)
            do skillName
     */

    /**
     * Make sure this individual possesses the called upon technique
     * @param techniqueName the technique in question
     * @return whether or not the individual possesses the technique
     */
    boolean validateTechnique(String techniqueName) {
        boolean isValid = false;
        for (String technique : techniques) {
            if (technique.equals(techniqueName)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }

    /*
    doTechnique(techniqueName)
        if validateTechnique
            do techniqueName
     */

    //Grow and lose max limbs
    /**
     * Grow an additional permanent head
     */
    public void growMaxHeads() {
        if (isValid(getMaxHeads())) {
            setMaxHeads(getMaxHeads()+1);
            setMaxLimbs(getMaxLimbs()+1);
        }
    }
    /**
     * Grow an additional amount of permanent heads
     * @param num the amount of additional heads
     */
    public void growMaxHeads(int num) {
        if (isValid(getMaxHeads())) {
            setMaxHeads(getMaxHeads()+num);
            setMaxLimbs(getMaxLimbs()+num);
        }
    }
    /**
     * Lose one of your permanent heads
     */
    public void loseMaxHeads() {
        if (isValid(getMaxHeads())) {
            setMaxHeads(getMaxHeads()-1);
            setMaxLimbs(getMaxLimbs()-1);
        }
    }
    /**
     * Lose an amount of permanent heads
     * @param num the amount of reduced heads
     */
    public void loseMaxHeads(int num) {
        if (isValid(getMaxHeads())) {
            setMaxHeads(getMaxHeads()-num);
            setMaxLimbs(getMaxLimbs()-num);
        }
    }
    /**
     * Grow an additional permanent arm
     */
    public void growMaxArms() {
        if (isValid(getMaxArms())) {
            setMaxArms(getMaxArms()+1);
            setMaxLimbs(getMaxLimbs()+1);
        }
    }
    /**
     * Grow an additional amount of permanent arms
     * @param num the amount of additional arms
     */
    public void growMaxArms(int num) {
        if (isValid(getMaxArms())) {
            setMaxArms(getMaxArms()+num);
            setMaxLimbs(getMaxLimbs()+num);
        }
    }
    /**
     * Lose one of your permanent arms
     */
    public void loseMaxArms() {
        if (isValid(getMaxArms())) {
            setMaxArms(getMaxArms()-1);
            setMaxLimbs(getMaxLimbs()-1);
        }
    }
    /**
     * Lose an amount of permanent arms
     * @param num the amount of reduced arms
     */
    public void loseMaxArms(int num) {
        if (isValid(getMaxArms())) {
            setMaxArms(getMaxArms()-num);
            setMaxLimbs(getMaxLimbs()-num);
        }
    }
    /**
     * Grow an additional permanent leg
     */
    public void growMaxLegs() {
        if (isValid(getMaxLegs())) {
            setMaxLegs(getMaxLegs()+1);
            setMaxLimbs(getMaxLimbs()+1);
        }
    }
    /**
     * Grow an additional amount of permanent legs
     * @param num the amount of additional legs
     */
    public void growMaxLegs(int num) {
        if (isValid(getMaxLegs())) {
            setMaxLegs(getMaxLegs()+num);
            setMaxLimbs(getMaxLimbs()+num);
        }
    }
    /**
     * Lose one of your permanent legs
     */
    public void loseMaxLegs() {
        if (isValid(getMaxLegs())) {
            setMaxLegs(getMaxLegs()-1);
            setMaxLimbs(getMaxLimbs()-1);
        }
    }
    /**
     * Lose an amount of permanent legs
     * @param num the amount of reduced legs
     */
    public void loseMaxLegs(int num) {
        if (isValid(getMaxLegs())) {
            setMaxLegs(getMaxLegs()-num);
            setMaxLimbs(getMaxLimbs()-num);
        }
    }
    /**
     * Grow an additional permanent tail
     */
    public void growMaxTails() {
        if (isValid(getMaxTails())) {
            setMaxTails(getMaxTails()+1);
            setMaxLimbs(getMaxLimbs()+1);
        }
    }
    /**
     * Grow an additional amount of permanent tails
     * @param num the amount of additional tails
     */
    public void growMaxTails(int num) {
        if (isValid(getMaxTails())) {
            setMaxTails(getMaxTails()+num);
            setMaxLimbs(getMaxLimbs()+num);
        }
    }
    /**
     * Lose one of your permanent tails
     */
    public void loseMaxTails() {
        if (isValid(getMaxTails())) {
            setMaxTails(getMaxTails()-1);
            setMaxLimbs(getMaxLimbs()-1);
        }
    }
    /**
     * Lose an amount of permanent tails
     * @param num the amount of reduced tails
     */
    public void loseMaxTails(int num) {
        if (isValid(getMaxTails())) {
            setMaxTails(getMaxTails()-num);
            setMaxLimbs(getMaxLimbs()-num);
        }
    }



    //Constructors:
    Individual() {
        name = "Unknown";
    }
    Individual(String iName) {
        name = iName;
    }

    Individual(String iName, int iKNO, int iPOW, int iEND, int iSPD, int iESP) {
        name = iName;
        KNO = iKNO;
        POW = iPOW;
        END = iEND;
        SPD = iSPD;
        ESP = iESP;
    }
     Individual(String iName, int iKNO, int iPOW, int iEND, int iSPD, int iESP,
                String[] iSkill, String[] iTechnique) {
         name = iName;
         KNO = iKNO;
         POW = iPOW;
         END = iEND;
         SPD = iSPD;
         ESP = iESP;
         skills = iSkill;
         techniques = iTechnique;
     }
}
