public class Fire extends GameObject
{
	private static java.util.Random r = new java.util.Random();
	public Fire(int x, int y)
	{
		super("../images/fire.png", "Fire", x, y, 30, 30);
		m_dY = 7;
	}

	@Override
	public void tickCallback(int maxw, int maxh)
	{
		if (m_y >= maxh - 5)
		{
			m_x = r.nextInt(maxw);
		}
	}
}
