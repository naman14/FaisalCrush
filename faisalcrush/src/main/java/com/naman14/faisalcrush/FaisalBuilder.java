package com.naman14.faisalcrush;

import java.util.ArrayList;
import java.util.List;

public class FaisalBuilder {

    private Faisal.CrushType crushType;
    private Error error;
    private RuntimeException exception;
    private List<StackTraceElement> elements = new ArrayList<>();

    public FaisalBuilder() {

        //default values
        this.crushType = Faisal.CrushType.EXCEPTION;
        this.exception = new RuntimeException();

    }

    public Faisal build() {
        return new Faisal(crushType, exception,error, elements.toArray(new StackTraceElement[elements.size()]));
    }

    public FaisalBuilder setCrushType(Faisal.CrushType crushType) {
        this.crushType = crushType;
        return this;
    }

    public FaisalBuilder setError(Error error) {
        this.error = error;
        return this;
    }

    public FaisalBuilder setException(RuntimeException exception) {
        this.exception = exception;
        return this;
    }

    public FaisalBuilder addStackTraceLement(String clazz, String method, String file, int line) {
        this.elements.add(new StackTraceElement(clazz, method, file, line));
        return this;
    }

}
