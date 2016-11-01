package task2.impl.bmw;

import task2.interfaces.IBody;
import task2.interfaces.ICarFabric;
import task2.interfaces.IDoor;
import task2.interfaces.IEngine;
import task2.interfaces.IInterior;

public class BmwFabric implements ICarFabric
{

	@Override
	public IBody getBody()
	{
		return new BmwBody();
	}

	@Override
	public IDoor getDoor()
	{
		return new BmwDoor();
	}

	@Override
	public IEngine getEngine()
	{
		return new BmwEngine();
	}

	@Override
	public IInterior getInterior()
	{
		return new BmwInterior();
	}

}
