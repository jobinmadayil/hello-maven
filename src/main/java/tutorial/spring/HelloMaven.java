package tutorial.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloMaven {
    private final static Logger log = LoggerFactory.getLogger(HelloMaven.class);

    public static void main(String[] args) {
        System.out.println("Hello Maven!!");
        log.info("Execution Succeeded!!");
        log.debug("Debug Test");
    }
}
