package hydraulicPump;

import deviceController.DeviceController;
import motor.Motor;

public class HydraulicPump extends Motor {
	
	@Override
	public void start() {
		System.out.println("I am a HydraulicPump and I am starting.");

	}

	@Override
	public void stop() {
		System.out.println("I am a HydraulicPump and I am stopping.");

	}

}
