package com.tddbyexample.chapterone;

public interface Expression {

    public Money reduce(Bank bank, String to);

    Expression plus(Expression expression);

    Expression times(int multiplier);
}
