package io.spring.cloud.samples.fortuneteller.ui.services.fortunes;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class FortunePowerBall {
	int ball1;
	int ball2;
	int ball3;
	int ball4;
	int ball5;
	int powerBall;
	private static final int BALL_SEED=59;
	private static final int POWERBALL_SEED=35;
	
	public FortunePowerBall() {
//		IntStream intStream;
//		intStream = random.ints(BALL_SEED,1, int(BALL_SEED+1);
//		List<Integer> randomBetween0And59 = intStream
//				.limit(5)
//				.boxed()
//				.collect(Collectors.toList());
//
//		ball1 = randomBetween0And59.get(0).intValue();
//		ball2 = randomBetween0And59.get(1).intValue();
//		ball3 = randomBetween0And59.get(2).intValue();
//		ball4 = randomBetween0And59.get(3).intValue();
//		ball5 = randomBetween0And59.get(4).intValue();
		int[] randomBetween0And59 = getRandomNumberInRange(1,BALL_SEED, 5);
		ball1 = randomBetween0And59[0];
		ball2 = randomBetween0And59[1];
		ball3 = randomBetween0And59[2];
		ball4 = randomBetween0And59[3];
		ball5 = randomBetween0And59[4];

//
//		intStream = random.ints(1, POWERBALL_SEED);
//		List<Integer> randomBetween0And35 = intStream
//				.limit(1)
//				.boxed()
//				.collect(Collectors.toList());
//		powerBall = randomBetween0And35.get(0).intValue();
		powerBall = getRandomNumberInRange(1,POWERBALL_SEED, 1)[0];
	}

	private int[] getRandomNumberInRange(int min, int max, int limit) {

		Random r = new Random();
		return r.ints(min, (max + 1)).limit(limit).toArray();

	}

	public FortunePowerBall(int ball1, int ball2, int ball3, int ball4, int ball5, int powerBall) {
		this.ball1 = ball1;
		this.ball2 = ball2;
		this.ball3 = ball3;
		this.ball4 = ball4;
		this.ball5 = ball5;
		this.powerBall = powerBall;
	}
	public int getBall1() {
		return ball1;
	}
	public void setBall1(int ball1) {
		this.ball1 = ball1;
	}
	public int getBall2() {
		return ball2;
	}
	public void setBall2(int ball2) {
		this.ball2 = ball2;
	}
	public int getBall3() {
		return ball3;
	}
	public void setBall3(int ball3) {
		this.ball3 = ball3;
	}
	public int getBall4() {
		return ball4;
	}
	public void setBall4(int ball4) {
		this.ball4 = ball4;
	}
	public int getBall5() {
		return ball5;
	}
	public void setBall5(int ball5) {
		this.ball5 = ball5;
	}
	public int getPowerBall() {
		return powerBall;
	}
	public void setPowerBall(int powerBall) {
		this.powerBall = powerBall;
	}
}
