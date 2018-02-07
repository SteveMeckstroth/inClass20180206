package palletizer;

import device.Device;

public class Palletizer extends Device {

	@Override
	public void start() {
		System.out.println("I am a palletizer and I am starting.");

	}

	@Override
	public void stop() {
		System.out.println("I am a palletizer and I am stopping.");

	}

}
