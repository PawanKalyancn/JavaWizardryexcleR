package javabasicpratices;

abstract class calculation {
    int value1;
    int value2;

    public calculation(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    int ADD() {
        return value1 + value2;
    }

    void display() {
    }
}

class Addition extends calculation {
    public Addition(int a, int b) {
        super(a, b);
        System.out.println("Addition constructor");
    }
}

public class abstractdemo {
    public static void main(String[] args) {
        Addition add = new Addition(5, 7);
        int result = add.ADD();
        System.out.println("Result: " + result);
    }
}
