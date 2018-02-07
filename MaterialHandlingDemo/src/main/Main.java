package main;

import java.util.ArrayList;

import conveyor.Conveyor;
import device.Device;
import motor.Motor;
import palletizer.Palletizer;
import scanner.Scanner;

public class Main {

	public static void main(String[] args) {
		//Declare and instantiate an array list of Device Objects
		ArrayList<Device> devices = new ArrayList<Device>();  //No problem.
		devices.add(new Motor());
		devices.add(new Palletizer());
		devices.add(new Conveyor());
		devices.add(new Motor());
		devices.add(new Motor());
		devices.add(new Conveyor());
		devices.add(new Palletizer());
		devices.add(new Scanner());
		devices.add(new Motor());
		devices.add(new Palletizer());
		
		//a loop to start all devices
		for(Device d : devices) {
			//Late-binding super-hero
			// We have a problem.  Only turn on the Conveyors
			if (d instanceof Conveyor) {
				d.start();
			}
		}
		
		
/*
 		// Declare and instantiate an object of type Device
 
		Device device; // Can't do this!	= new Device();
		
		device = new Motor();  // A base class object can be assigned to a derived class instance
		
		device.start();  		// which start() ???  No worries, we'll decide at run-time
		
		device = new Conveyor();
		
		device.start();			//Late-binding, now device is a conveyer
*/
	}

}
