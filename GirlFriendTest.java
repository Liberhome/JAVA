package lec2;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] gf = new GirlFriend[3];
        gf[0] = new GirlFriend("Elizabeth", 8.2, 2020, 5, 5);
        gf[1] = new GirlFriend("Selina", 8.8, 2020, 5, 5);
        gf[2] = new GirlFriend("Julia", 9.4, 2020, 5, 5);

        for (GirlFriend g :
                gf) {
            g.reduceScore(5);
        }

        for (GirlFriend g :
                gf) {
            System.out.println("name: "+g.getName()+", birthday= "+g.getBirthday()+", score= "+g.getScore());
        }
    }
}
