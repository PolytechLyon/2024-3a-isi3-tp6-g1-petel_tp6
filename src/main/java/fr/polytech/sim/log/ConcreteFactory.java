package fr.polytech.sim.log;

public class ConcreteFactory {

    public static Logger loggerFactory(String name){
        TimestampedLoggerDecorator logger = new TimestampedLoggerDecorator(name);
        logger.decorate(new ConsoleLogger(name));
        return logger;
    }

}
