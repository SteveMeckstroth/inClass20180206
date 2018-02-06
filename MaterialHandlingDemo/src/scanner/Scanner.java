package scanner;

import device.Device;

public class Scanner extends Device {

	@Override
	public void start() {
		System.out.println("I am a scanner and I am starting.");

	}

	@Override
	public void stop() {
		System.out.println("I am a scanner and I am stopping.");

	}

}
