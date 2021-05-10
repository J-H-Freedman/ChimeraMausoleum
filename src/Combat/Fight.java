package Combat;

public class Fight {

    /*
    to win:
        remove all heads to kill
        or remove all legs to disengage

    how to win:
        attack with your limbs to targeted parts of their body to disable them until they are unable to fight back
        defend with limbs of your choice to prevent them from doing the same to you
        between encounters you may choose to increase your limb count or mutate your existing limbs
        you may instead choose to equip yourself of artifacts that cease to work after certain levels of mutation

    set-up:
        on your turn:
            exhaust limb to use it
            exhaust technique to use it
            or rest to be able to use all available limbs and techniques against
                //when resting, you will be unable to defend, even to the head

        on their turn:
            when limb is attacked
                exhaust different limb to defend
                    defend with arm or tail of your choice
                    if limb == head
                        you *must* defend if able to
                or receive damage to limb
                if limb.durability =< 0
                    limb.loseLimb()

        limbs lose durability when damaged
        limbs lose increased durability when blocking
            held items increase durability
                held equipment's durability returns on rest
            shield switches to reduced durability
     */

}
