package com.duzi.lottochecker;

/**
 * Created by KIM on 2018-06-14.
 */

public class Lotto {
    public String bnusNo;
    public String drwtNo1;
    public String drwtNo2;
    public String drwtNo3;
    public String drwtNo4;
    public String drwtNo5;
    public String drwtNo6;

    public String getNumber() {
        return drwtNo1 + " " + drwtNo2 + " " + drwtNo3 + " " + drwtNo4 + " " + drwtNo5 + " " + drwtNo6;
    }

    public String getNumberWithBonus() {
        return drwtNo1 + " " + drwtNo2 + " " + drwtNo3 + " " + drwtNo4 + " " + drwtNo5 + " " + drwtNo6 + " " + bnusNo;
    }
}
