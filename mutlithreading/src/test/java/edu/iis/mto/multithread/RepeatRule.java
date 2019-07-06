package edu.iis.mto.multithread;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RepeatRule implements TestRule {
    @Retention(RetentionPolicy.RUNTIME)
    @Target({java.lang.annotation.ElementType.METHOD})
    public @interface Repeat {
        int times();
    }

    private Repeat repeat;

    @Override
    public Statement apply(Statement statement, Description description) {
        Statement result = statement;
        repeat = description.getAnnotation(Repeat.class);
        if (repeat != null) {
            int times = repeat.times();
            result = new RepeatStatement(times, statement);
        }
        return result;
    }
}

