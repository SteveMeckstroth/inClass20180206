package main;

import conveyor.Conveyor;
import device.Device;
import motor.Motor;

public class Main {

	public static void main(String[] args) {
		// Declare and instantiate an object of type Device
		Device device; // Can't do this!	= new Device();
		
		device = new Motor();  // A base class object can be assigned to a derived class instance
		
		device.start();  		// which start() ???  No worries, we'll decide at run-time
		
		device = new Conveyor();
		
		device.start();			//Late-binding, now device is a conveyer
	}

}
