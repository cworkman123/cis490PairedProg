package com.wesleyreisz.rockpaperscissors;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wesleyreisz on 9/14/14.
 */
public class LogicTest extends TestCase {
    public void testRandomResult(){
        int totalTest = 100;
        List<RockPaperScissorType>results = new ArrayList<RockPaperScissorType>();
        RockPaperScissorsAI ai = new RockPaperScissorsAI();
        for(int i=0;i<totalTest;i++){
            results.add(ai.play());
        }
        Assert.assertTrue(results.contains(RockPaperScissorType.SCISSORS));
        Assert.assertTrue(results.contains(RockPaperScissorType.PAPER));
        Assert.assertTrue(results.contains(RockPaperScissorType.ROCK));
    }

    public void testResultMap(){
        Assert.assertEquals("Computer Wins", RockPaperScissorsUtil.eval(RockPaperScissorType.ROCK,RockPaperScissorType.PAPER));
        Assert.assertEquals("Tie", RockPaperScissorsUtil.eval(RockPaperScissorType.ROCK,RockPaperScissorType.ROCK));
        Assert.assertEquals("Player 1 Wins", RockPaperScissorsUtil.eval(RockPaperScissorType.ROCK,RockPaperScissorType.SCISSORS));

        Assert.assertEquals("Player 1 Wins", RockPaperScissorsUtil.eval(RockPaperScissorType.PAPER,RockPaperScissorType.ROCK));
        Assert.assertEquals("Tie", RockPaperScissorsUtil.eval(RockPaperScissorType.PAPER,RockPaperScissorType.PAPER));
        Assert.assertEquals("Computer Wins", RockPaperScissorsUtil.eval(RockPaperScissorType.PAPER,RockPaperScissorType.SCISSORS));

        Assert.assertEquals("Computer Wins", RockPaperScissorsUtil.eval(RockPaperScissorType.SCISSORS,RockPaperScissorType.ROCK));
        Assert.assertEquals("Player 1 Wins", RockPaperScissorsUtil.eval(RockPaperScissorType.SCISSORS,RockPaperScissorType.PAPER));
        Assert.assertEquals("Tie", RockPaperScissorsUtil.eval(RockPaperScissorType.SCISSORS,RockPaperScissorType.SCISSORS));
    }
}
