package Creature;

public class Individual extends Species {

// Attributes:
    String name;
    int KNO = 0;
    int POW = 0;
    int END = 0;
    int SPD = 0;
    int ESP = 0;

    int currentHeads =  getMaxHeads();
    int currentArms =   getMaxArms();
    int currentLegs =   getMaxLegs();
    int currentTails =  getMaxTails();
    
    String[] skills =    new String[100];
    String[] techniques =new String[100];

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

    /**
     * Get the current head count
     * @return current head count
     */
    public int getCurrentHeads() {
        return currentHeads;
    }
    /**
     * Get the current arm count
     * @return current arm count
     */
    public int getCurrentArms() {
        return currentArms;
    }
    /**
     * Get the current leg count
     * @return current leg count
     */
    public int getCurrentLegs() {
        return currentLegs;
    }
    /**
     * Get the current tail count
     * @return current tail count
     */
    public int getCurrentTails() {
        return currentTails;
    }
    /**
     * Get total amount of current limbs
     * @return total limb count
     */
    public int getLimbTotal() {
        return (currentHeads + currentArms + currentLegs + currentTails);
    }

    /**
     * set the current amount of heads
     * @param currentHeads current amount of heads
     */
    public void setCurrentHeads(int currentHeads) {
        this.currentHeads = currentHeads;
    }
    /**
     * set the current amount of arms
     * @param currentArms current amount of arms
     */
    public void setCurrentArms(int currentArms) {
        this.currentArms = currentArms;
    }
    /**
     * set the current amount of legs
     * @param currentLegs current amount of legs
     */
    public void setCurrentLegs(int currentLegs) {
        this.currentLegs = currentLegs;
    }
    /**
     * set the current amount of tails
     * @param currentTails current amount of tails
     */
    public void setCurrentTails(int currentTails) {
        this.currentTails = currentTails;
    }
    
    
    //Grow and lose current limbs
    /**
     * Grow a head back
     */
    public void growCurrentHeads() {
        if (isValid(getCurrentHeads())) {
            setCurrentHeads(getCurrentHeads()+1);
        }
    }
    /**
     * Grow an  amount of heads
     * @param num the amount of additional heads
     */
    public void growCurrentHeads(int num) {
        if (isValid(getCurrentHeads())) {
            setCurrentHeads(getCurrentHeads()+num);
        }
    }
    /**
     * Lose one of your heads
     */
    public void loseCurrentHeads() {
        if (isValid(getCurrentHeads())) {
            setCurrentHeads(getCurrentHeads()-1);
        }
    }
    /**
     * Lose an amount of  heads
     * @param num the amount of reduced heads
     */
    public void loseCurrentHeads(int num) {
        if (isValid(getCurrentHeads())) {
            setCurrentHeads(getCurrentHeads()-num);
        }
    }

    /**
     * Grow an additional  arm
     */
    public void growCurrentArms() {
        if (isValid(getCurrentArms())) {
            setCurrentArms(getCurrentArms()+1);
        }
    }
    /**
     * Grow an additional amount of  arms
     * @param num the amount of additional arms
     */
    public void growCurrentArms(int num) {
        if (isValid(getCurrentArms())) {
            setCurrentArms(getCurrentArms()+num);
        }
    }
    /**
     * Lose one of your  arms
     */
    public void loseCurrentArms() {
        if (isValid(getCurrentArms())) {
            setCurrentArms(getCurrentArms()-1);
        }
    }
    /**
     * Lose an amount of  arms
     * @param num the amount of reduced arms
     */
    public void loseCurrentArms(int num) {
        if (isValid(getCurrentArms())) {
            setCurrentArms(getCurrentArms()-num);
        }
    }

    /**
     * Grow an additional  leg
     */
    public void growCurrentLegs() {
        if (isValid(getCurrentLegs())) {
            setCurrentLegs(getCurrentLegs()+1);
        }
    }
    /**
     * Grow an additional amount of  legs
     * @param num the amount of additional legs
     */
    public void growCurrentLegs(int num) {
        if (isValid(getCurrentLegs())) {
            setCurrentLegs(getCurrentLegs()+num);
        }
    }
    /**
     * Lose one of your  legs
     */
    public void loseCurrentLegs() {
        if (isValid(getCurrentLegs())) {
            setCurrentLegs(getCurrentLegs()-1);
        }
    }
    /**
     * Lose an amount of  legs
     * @param num the amount of reduced legs
     */
    public void loseCurrentLegs(int num) {
        if (isValid(getCurrentLegs())) {
            setCurrentLegs(getCurrentLegs()-num);
        }
    }

    /**
     * Grow an additional  tail
     */
    public void growCurrentTails() {
        if (isValid(getCurrentTails())) {
            setCurrentTails(getCurrentTails()+1);
        }
    }
    /**
     * Grow an additional amount of  tails
     * @param num the amount of additional tails
     */
    public void growCurrentTails(int num) {
        if (isValid(getCurrentTails())) {
            setCurrentTails(getCurrentTails()+num);
        }
    }
    /**
     * Lose one of your  tails
     */
    public void loseCurrentTails() {
        if (isValid(getCurrentTails())) {
            setCurrentTails(getCurrentTails()-1);
        }
    }
    /**
     * Lose an amount of  tails
     * @param num the amount of reduced tails
     */
    public void loseCurrentTails(int num) {
        if (isValid(getCurrentTails())) {
            setCurrentTails(getCurrentTails()-num);
        }
    }

    //Grow and lose max limbs
    /**
     * Grow an additional permanent head
     */
    public void growMaxHeads() {
        if (isValid(getMaxHeads())) {
            setMaxHeads(getMaxHeads()+1);
        }
    }
    /**
     * Grow an additional amount of permanent heads
     * @param num the amount of additional heads
     */
    public void growMaxHeads(int num) {
        if (isValid(getMaxHeads())) {
            setMaxHeads(getMaxHeads()+num);
            
        }
    }
    /**
     * Lose one of your permanent heads
     */
    public void loseMaxHeads() {
        if (isValid(getMaxHeads())) {
            setMaxHeads(getMaxHeads()-1);
        }
    }
    /**
     * Lose an amount of permanent heads
     * @param num the amount of reduced heads
     */
    public void loseMaxHeads(int num) {
        if (isValid(getMaxHeads())) {
            setMaxHeads(getMaxHeads()-num);
        }
    }

    /**
     * Grow an additional permanent arm
     */
    public void growMaxArms() {
        if (isValid(getMaxArms())) {
            setMaxArms(getMaxArms()+1);
        }
    }
    /**
     * Grow an additional amount of permanent arms
     * @param num the amount of additional arms
     */
    public void growMaxArms(int num) {
        if (isValid(getMaxArms())) {
            setMaxArms(getMaxArms()+num);
            
        }
    }
    /**
     * Lose one of your permanent arms
     */
    public void loseMaxArms() {
        if (isValid(getMaxArms())) {
            setMaxArms(getMaxArms()-1);
        }
    }
    /**
     * Lose an amount of permanent arms
     * @param num the amount of reduced arms
     */
    public void loseMaxArms(int num) {
        if (isValid(getMaxArms())) {
            setMaxArms(getMaxArms()-num);
        }
    }

    /**
     * Grow an additional permanent leg
     */
    public void growMaxLegs() {
        if (isValid(getMaxLegs())) {
            setMaxLegs(getMaxLegs()+1);
        }
    }
    /**
     * Grow an additional amount of permanent legs
     * @param num the amount of additional legs
     */
    public void growMaxLegs(int num) {
        if (isValid(getMaxLegs())) {
            setMaxLegs(getMaxLegs()+num);
            
        }
    }
    /**
     * Lose one of your permanent legs
     */
    public void loseMaxLegs() {
        if (isValid(getMaxLegs())) {
            setMaxLegs(getMaxLegs()-1);
        }
    }
    /**
     * Lose an amount of permanent legs
     * @param num the amount of reduced legs
     */
    public void loseMaxLegs(int num) {
        if (isValid(getMaxLegs())) {
            setMaxLegs(getMaxLegs()-num);
        }
    }

    /**
     * Grow an additional permanent tail
     */
    public void growMaxTails() {
        if (isValid(getMaxTails())) {
            setMaxTails(getMaxTails()+1);
        }
    }
    /**
     * Grow an additional amount of permanent tails
     * @param num the amount of additional tails
     */
    public void growMaxTails(int num) {
        if (isValid(getMaxTails())) {
            setMaxTails(getMaxTails()+num);
            
        }
    }
    /**
     * Lose one of your permanent tails
     */
    public void loseMaxTails() {
        if (isValid(getMaxTails())) {
            setMaxTails(getMaxTails()-1);
        }
    }
    /**
     * Lose an amount of permanent tails
     * @param num the amount of reduced tails
     */
    public void loseMaxTails(int num) {
        if (isValid(getMaxTails())) {
            setMaxTails(getMaxTails()-num);
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
