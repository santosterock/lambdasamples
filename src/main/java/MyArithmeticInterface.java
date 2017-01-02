import java.util.Date;

/**
 * Created by sujes on 1/1/2017.
 */
@FunctionalInterface
public interface MyArithmeticInterface {

    Long performArithmeticOper(long a, long b);

    static Date getSystemTime() {
        return new Date();
    }

    default String greetUser(String user) {
        return "Welcome " + user;
    }

    default String getTime() {
        return String.valueOf(new Date().getTime());
    }

}
