package com.company;
final class Aa {
    public void m1() {				// statement 1
    }
}
/*public class Bb extends Aa {				// statement 2---error as Aa has been declared as final
}*/
class Cc {
    public void m2() {
    }
}
class Dd extends Cc {
    public final void m2() {			// statement 3
        final int value = 2;
        final int[] valueArr = {2, 3, 4};
        final String text1 = "Cat on the wall";
        String text2 = text1;			// statement 4
        String text3 =  "Dog in the pool";
        //text1 = text3;				// statement 5------------error
        valueArr[1] = value;			// statement 6
    }
}
public class First_64_error_in_final {
    public static void main(String[] args) {

    }
}
