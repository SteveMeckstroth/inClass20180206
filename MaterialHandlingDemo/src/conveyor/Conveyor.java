package conveyor;

import device.Device;

public class Conveyor extends Device {

	@Override
	public void start() {
		System.out.println("I am a conveyor and I am starting.");

	}

	@Override
	public void stop() {
		System.out.println("I am a conveyor and I am stopping.");

	}

}
