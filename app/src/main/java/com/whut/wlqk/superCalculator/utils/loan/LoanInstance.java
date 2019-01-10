package com.whut.wlqk.superCalculator.utils.loan;

public class LoanInstance {

    double amountOwed;  //欠款总额
    int monthNum; //还款月数
    double rate;  //贷款利率 商业4.9 公积金3.25
    protected double monthRate;
    public LoanInstance(double amountOwed, int monthNum, double rate) {
        this.amountOwed = amountOwed;
        this.monthNum = monthNum;
        this.rate = rate;
        this.monthRate = rate/12;
    }

    public double getAmountOwed() {
        return amountOwed;
    }

    public void setAmountOwed(double amountOwed) {
        this.amountOwed = amountOwed;
    }

    public double getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(int monthNum) {
        this.monthNum = monthNum;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
        this.monthRate = rate/12;
    }
}