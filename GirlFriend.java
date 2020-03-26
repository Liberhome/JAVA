package lec2;

import java.util.Date;
import java.util.GregorianCalendar;

public class GirlFriend {
    private String name;
    private Date birthday;
    private double score;

    public GirlFriend(String name, double score, int year, int month, int day) {
        this.name = name;
        this.score = score;
        GregorianCalendar calendar = new GregorianCalendar(year - (int)(Math.random() * 20) , month - 1, day);
        birthday = calendar.getTime();
    }

    public void reduceScore(double byPercent) {
        double reduce =score*byPercent/100;
        score-=reduce;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public double getScore() {
        return score;
    }
}
