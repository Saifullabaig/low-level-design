package loggingframework.logappender;

import loggingframework.LogMessage;

public class ConsoleAppender implements LogAppender{
    @Override
    public void append(LogMessage message){
        System.out.println(message);
    }
}
