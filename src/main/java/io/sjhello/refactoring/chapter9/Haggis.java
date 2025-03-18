package io.sjhello.refactoring.chapter9;

public class Haggis {
	public double distanceTravelled(Scenario scenario, int time) {
		double result;
		int acc = scenario.primaryForce / scenario.mass;
		double primaryTime = Math.min(time, scenario.delay);
		result = 0.5 * acc * primaryTime * primaryTime;
		double secondaryTime = time - scenario.delay;

		if (secondaryTime > 0) {
			int primaryVelocity = acc * scenario.delay;
			acc = (scenario.primaryForce + scenario.secondaryForce) / scenario.mass;
			result += primaryVelocity * secondaryTime + 0.5 * acc * secondaryTime * secondaryTime;
		}

		return result;
	}
}
