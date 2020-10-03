package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger loggerWarn = LoggerFactory.getLogger("test.Main.logger.warn");
    private static final Logger loggerInfo = LoggerFactory.getLogger("test.Main.logger.info");
    private static final Logger loggerError = LoggerFactory.getLogger("test.Main.logger.error");

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Human st = new Human().setFirstName("FirstName#" + i).setLastName("LastName#" + i).setAge((int) (Math.random() * 100) + 1);

            if (st.getAge() < 60) {
                loggerInfo.info("Human is young : " + st.toString());
            } else if (st.getAge() > 60 && st.getAge() < 90) {
                loggerWarn.warn("Human is old yet : " + st.toString());
            } else {
                loggerError.error("Human is gonna die soon: " + st.toString());
            }
        }
    }
}
