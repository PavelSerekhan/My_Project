package Test;

interface AbleToEat {
    public void eat();
}

class Tetris {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Eating woioefmwqvmlq");
            }
        };
        ableToEat.eat();
    }
}