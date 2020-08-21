package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {

    public default CompareResult compareWeight(CompareWeight smthHasWeigt){

        switch ( (Double.compare(getWeight(), smthHasWeigt.getWeight())) ){
            case -1: return CompareResult.LESS;
            case 1: return CompareResult.GREATER;
        }
        return CompareResult.EQUAL;
    };

    public enum CompareResult {
        LESS, EQUAL, GREATER;
    }

    public double getWeight();

}
