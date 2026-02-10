interface motor {
    int capacity = 5;
    void run();
    void consume();
}

class washingMachine implements motor {
    public void run() {
    }

    public void consume() {
    }

    public static void main(String[] args) {
        washingMachine wm = new washingMachine();
        System.out.println("Capacity of the motor is " + wm.capacity);
    }
}
