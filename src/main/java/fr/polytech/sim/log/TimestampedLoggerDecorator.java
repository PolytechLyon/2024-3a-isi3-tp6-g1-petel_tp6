package fr.polytech.sim.log;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class TimestampedLoggerDecorator extends NamedLogger {

    Logger logger;

    public TimestampedLoggerDecorator(String name){
        super(name);
    }

    public void decorate(Logger logger){
        this.logger = logger;
    }
    @Override
    public void writeFile(String message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String newMessage = LocalTime.now().format(formatter) + " " + message;
        logger.log(newMessage);
    }
}
