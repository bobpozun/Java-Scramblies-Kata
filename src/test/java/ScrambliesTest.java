import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ScrambliesTest {

    private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        testing(Scramblies.scramble("rkqodlw", "world"), true);
    }
    @Test
    public void test2() {
         testing(Scramblies.scramble("cedewaraaossoqqyt","codewars"),true);
    }
    @Test
    public void test3() {
        testing(Scramblies.scramble("katas", "steak"), false);
    }
    @Test
    public void test4() {
        testing(Scramblies.scramble("scriptjavx","javascript"),false);
    }
    @Test
    public void test5() {
        testing(Scramblies.scramble("scriptingjava","javascript"),true);
    }
    @Test
    public void test6() {
        testing(Scramblies.scramble("scriptsjava","javascripts"),true);
    }
    @Test
    public void test7() {
        testing(Scramblies.scramble("javscripts","javascript"),false);
    }
    @Test
    public void test8() {
        testing(Scramblies.scramble("aabbcamaomsccdd","commas"),true);
    }
    @Test
    public void test9() {
        testing(Scramblies.scramble("commas","commas"),true);
    }
    @Test
    public void test10() {
        testing(Scramblies.scramble("sammoc","commas"),true);
    }
}