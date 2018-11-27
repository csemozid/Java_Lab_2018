package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import main.Sound;

class Test {
	Sound sound = new Sound();
	final double SPREED = 1100;
	final double TIME = 7.2;
	@org.junit.jupiter.api.Test
	void test() {
		assertEquals(7920.0,sound.caculation(SPREED, TIME),"");
	}

}
