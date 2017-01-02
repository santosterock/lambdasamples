import org.junit.Test;

/**
 * Created by sujes on 1/1/2017.
 */
public class LambdaTest {

    @Test
    public void lambdaTest() {

        /*
        Interface implementation 1
         */
        MyArithmeticInterface additionImpl = (a, b) -> {
            return a + b;
        };
        System.out.println("Addition result -> " + additionImpl.performArithmeticOper(17, 34));


        /*
        Interface implementation 2
         */
        MyArithmeticInterface moduloImpl = (a, b) -> {
            return a % b;
        };
        System.out.println("Modulo result -> " + moduloImpl.performArithmeticOper(17, 34));


        /*
        Using static method of the interface
         */
        System.out.println("Static method -> " + MyArithmeticInterface.getSystemTime());


        /*
        Using default method 1 of the interface
         */
        System.out.println("Addition impl default method 1 -> " + additionImpl.greetUser("sujesh add"));
        System.out.println("Modulo impl default method 1 -> " + moduloImpl.greetUser("sujesh modulo"));

        /*
        Using default method 2 of the interface
         */
        System.out.println("Addition impl default method 2 -> " + additionImpl.getTime());
        System.out.println("Modulo impl default method 2 -> " + moduloImpl.getTime());


    }

}
