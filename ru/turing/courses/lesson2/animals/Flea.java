package ru.turing.courses.lesson2.animals;

public class Flea extends Animal{
    protected float jumpHeight;
    protected boolean isAlive;
    protected boolean isImmortal;
    public static int maxNumberOfPaws = 6;

    @Override
    public void makeSound() {
        if (isAlive) {
            System.out.printf("%s: trtrtr\n", name);
        } else {
            System.out.printf("%s: ...\n", name);
        }
    }
    public void heal() {
        if (numberOfPaws < maxNumberOfPaws && isAlive) {
            System.out.printf("%s has been healed\n", name);
            numberOfPaws = maxNumberOfPaws;
        } else {
            if (!isAlive) {
                System.out.print("Veterinarian cannot revive fleas, sorry\n");
            } else {
                System.out.printf("%s was healthy before going to veterinarian, chill out\n", name);
            }
        }
    }
    public void tryKill() {
        if (!isAlive) {
            System.out.printf("%s is already dead\n", name);
        } else {
            if (isImmortal) {
                System.out.printf("%s cannot be killed, it's freaking flea!", name);
                if ((int) (Math.random() * 10) == 9 && numberOfPaws > 0) {
                    numberOfPaws--;
                    System.out.print(" But you broke it's paw, good job");
                }
                System.out.print("\n");
            } else {
                System.out.printf("Congrats! You've killed a little fea %s.\n", name);
                isAlive = false;
            }
        }
    }
    public void tryJump(double height) {
        if (!isAlive) {
            System.out.print("Dead fleas can't jump :(\n");
        } else if (numberOfPaws <= 0) {
            System.out.printf("%s is still alive but it's paws are broken, go to veterinarian!\n", name);
        } else {
            if (height < jumpHeight) {
                System.out.printf("%s conquered the height %f meters!\n", name, height);
            } else {
                if (isImmortal) {
                    System.out.printf("%s didn't jumped up and broke it's paw :(\n", name);
                    numberOfPaws--;
                } else {
                    System.out.printf("%s bumped it's head and died when fell down. It couldn't jump so high\n", name);
                    isAlive = false;
                }
            }
        }

    }

    public Flea() {
        isAlive = true;
        isImmortal = false;
        name = "Another";
    }

    public Flea(String name, boolean isFlying, boolean isSwimming, int numberOfPaws, int age,
                float jumpHeight, boolean isAlive, boolean isImmortal) {
        super(name, isFlying, isSwimming, numberOfPaws, age);
        this.numberOfPaws = Math.min(numberOfPaws, maxNumberOfPaws);
        this.jumpHeight = jumpHeight;
        this.isAlive = isAlive;
        this.isImmortal = isImmortal;
    }
    @Override
    public void setNumberOfPaws(int numberOfPaws) {
        this.numberOfPaws = Math.min(numberOfPaws, maxNumberOfPaws);
    }

    public float getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(float jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean isImmortal() {
        return isImmortal;
    }

    public void setImmortal(boolean immortal) {
        isImmortal = immortal;
    }
}

