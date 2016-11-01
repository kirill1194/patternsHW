package task2.impl.bmw;

import java.awt.Color;

import task2.interfaces.IDoor;

public class BmwDoor implements IDoor
{

	@Override
	public Color getDoorColor()
	{
		return new Color(255, 0, 0);
	}

}
