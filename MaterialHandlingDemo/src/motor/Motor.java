package motor;

import device.Device;

public class Motor extends Device {

	@Override
	public void start() {
		System.out.println("I am a motor and I am starting.");

	}

	@Override
	public void stop() {
		System.out.println("I am a motor and I am stopping.");

	}

}
