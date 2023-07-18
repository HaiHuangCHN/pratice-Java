package log;

import org.junit.Test;

import java.io.IOException;
import java.util.logging.*;

public class LogPratice {

    private static final Logger logger = Logger.getLogger(LogPratice.class.getName());

    public static void main(String[] args) {

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                logger.log(Level.SEVERE, t + " LogPratice threw an exception: ", e);
                logger.log(Level.WARNING, "One way");// Practice "Level"
                logger.warning("Another way");
            }

            ;
        });

        class adminThread implements Runnable {
            public void run() {
                throw new RuntimeException();
            }
        }

        Thread t = new Thread(new adminThread());
        t.start();
    }

    @Test
    public void testBegin() {
        // 1.创建日志记录器对象
        Logger logger = Logger.getLogger(LogPratice.class.getName());
        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");//默认的日志级别
        logger.config("config");
        logger.fine("fine");
        logger.finest("finest");
    }

    @Test
    public void testLog2() throws IOException {
        Logger logger = Logger.getLogger(LogPratice.class.getName());
        // 关闭系统默认配置
        logger.setUseParentHandlers(false);


        // 创建一个输出到控制台 handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        // Formatter 是一个的日志格式接口 实现类有：
        // java.util.logging.SimpleFormatter
        // java.util.logging.XMLFormatter
        // sun.net.www.protocol.http.logging.HttpLogFormatter
        Formatter formatter = new SimpleFormatter();
        // 进行关联
        consoleHandler.setFormatter(formatter);
        // logger 关联 handler
        logger.addHandler(consoleHandler);
        // 设置日志级别
        // 这里需要设置两个（logger的级别和handler的级别）
        // 如果两个设置不一样，取级别大的，如logger级别是 info，handler级别是ALL，那么输出的级别就是 info，反过来也一样
        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);


        // 输出到文件的 handler
        FileHandler fileHandler = new FileHandler("/Users/haihuang/GitHub/pratice-Java/jul.log");
        fileHandler.setFormatter(formatter);
        // 可以关联多个
        logger.addHandler(fileHandler);


        logger.severe("severe");
        logger.warning("warning");
        logger.info("info");
        logger.config("config");
        logger.fine("fine");
        logger.finest("finest");
    }

}