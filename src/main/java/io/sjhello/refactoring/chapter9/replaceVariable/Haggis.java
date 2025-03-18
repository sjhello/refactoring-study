package io.sjhello.refactoring.chapter9.replaceVariable;

public class Haggis {
	public double distanceTravelled(Scenario scenario, int time) {
		double result;
		final int primaryAcceleration = scenario.primaryForce / scenario.mass;
		double primaryTime = Math.min(time, scenario.delay);
		result = 0.5 * primaryAcceleration * primaryTime * primaryTime;
		double secondaryTime = time - scenario.delay;

		if (secondaryTime > 0) {
			int primaryVelocity = primaryAcceleration * scenario.delay;
			int secondaryAcceleration = (scenario.primaryForce + scenario.secondaryForce) / scenario.mass;
			result += primaryVelocity * secondaryTime + 0.5 * secondaryAcceleration * secondaryTime * secondaryTime;
		}

		return result;
	}
}
