package task2.impl.audi;

import java.awt.Color;

import task2.interfaces.IDoor;

public class AudiDoor implements IDoor
{

	@Override
	public Color getDoorColor()
	{
		return new Color(0, 0, 255);
	}

}
