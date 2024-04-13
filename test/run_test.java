///usr/bin/env jbang "$0" "$@" ; exit $?

//JAVA 11+

//DEPS ch.qos.logback:logback-classic:1.5.5
//DEPS org.komamitsu:fluency:1.8.1
//DEPS com.sndyuk:logback-more-appenders:1.5.0

//FILES logback.xml

import org.slf4j.*;

/**
 * @author <A href="mailto:alexey@abashev.ru">Alexey Abashev</A>
 */
public class run_test {
    public static void main(String[] args) {
        var log = LoggerFactory.getLogger(run_test.class);

        log.info("Test info");
        log.error("Test error", new Exception());
    }
}
