package com.naman14.faisalcrush;

/**
 * Created by naman on 21/10/15.
 */
public class Faisal {

    private Error error;
    private StackTraceElement[] elements;
    private RuntimeException exception;
    private CrushType crushType;

    public enum CrushType {
        EXCEPTION, ERROR, DEFAULT,

        @Deprecated
        SPECIAL
    }

    public Faisal() {
        this.crushType = CrushType.DEFAULT;
    }

    public Faisal(CrushType crushType, RuntimeException exception, Error error, StackTraceElement[] elements) {
        this.crushType = crushType;
        this.exception = exception;
        this.error = error;
        this.elements = elements;
    }

    public static Faisal getInstance() {
        return new Faisal();
    }


    public void crush() {

        switch (crushType) {

            case EXCEPTION:

                if (elements != null)
                    exception.setStackTrace(elements);
                throw exception;

            case ERROR:

                if (elements != null)
                    error.setStackTrace(elements);
                throw error;

            case SPECIAL:
                @SuppressWarnings("NumericOverflow")
                int faisal = 3 / 0;


            case DEFAULT:
                throw new RuntimeException();
        }

    }

}
