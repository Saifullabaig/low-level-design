package loggingframework.logappender;

import loggingframework.LogMessage;

public class DatabaseAppender implements LogAppender{

    @Override
    public void append(LogMessage logMessage) {
        System.out.print("DatabaseAppender::");
        System.out.println(logMessage);
    }
}
