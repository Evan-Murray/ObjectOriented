public class Sinistar extends GameObject
{
	private static java.util.Random r = new java.util.Random();
	public Sinistar(int x, int y)
	{
		super("../images/Sinistar.gif", "Sinistar", x, y, 30, 30);
		changeDirection();
	}

	@Override
	public void tickCallback(int maxw, int maxh)
	{
		if (m_ticks % (30) == 0)
		{
			changeDirection();
		}

	}

	private void changeDirection()
	{
		m_dX = r.nextInt(12) + 1;
		if (r.nextBoolean())
			m_dX *= -1;
		m_dY = r.nextInt(12) + 1;
		if (r.nextBoolean())
			m_dY *= -1;
	}
}
