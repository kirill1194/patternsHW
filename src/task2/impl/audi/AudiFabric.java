package task2.impl.audi;

import task2.interfaces.IBody;
import task2.interfaces.ICarFabric;
import task2.interfaces.IDoor;
import task2.interfaces.IEngine;
import task2.interfaces.IInterior;

public class AudiFabric implements ICarFabric
{

	@Override
	public IBody getBody()
	{
		return new AudiBody();
	}

	@Override
	public IDoor getDoor()
	{
		return new AudiDoor();
	}

	@Override
	public IEngine getEngine()
	{
		return new AudiEngine();
	}

	@Override
	public IInterior getInterior()
	{
		return new AudiInterior();
	}

}
