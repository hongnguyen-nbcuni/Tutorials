class Cricket extends Insect {

    double length;

    public Cricket(int age, double length) {
        super(age, 6);		// call Insect constructor class
        //System.out.println(super.age);
        this.length = length;
    }

    public void says() {                // we overwrite the says method
        System.out.println("CHIRP");
    }

    public void jump() {
        System.out.println("A cricket jumped!");
    }

}
