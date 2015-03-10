package controls;


import systems.PlayerSystem;

import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.ControllerAdapter;

public class PlayerControls extends ControllerAdapter {
	private PlayerSystem system;
	
	public PlayerControls(PlayerSystem syst) {
		this.system = syst;
	}
	
	@Override
	public boolean buttonDown (Controller controller, int buttonCode){
		switch (buttonCode) {
		case Xbox360Pad.BUTTON_A:
			system.jump(controller.getAxis(Xbox360Pad.AXIS_LEFT_X),
					    controller.getAxis(Xbox360Pad.AXIS_LEFT_Y));
			return true;
		}
		
		return false;
	}

	@Override
	public boolean buttonUp (Controller controller, int buttonCode){
		switch (buttonCode) {
		case Xbox360Pad.BUTTON_A:
			system.grab();
			return true;
		}
		
		return false;
	}
	
}