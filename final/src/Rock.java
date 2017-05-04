
public class Rock extends GameObject
{
	public Rock(int x, int y)
	{
		super("../images/rock.png", "Rock",  x, y, 30, 30);
		m_dX = 8;
		m_dY = 8;
	}

	@Override
	public void tickCallback(int maxw, int maxh)
	{
		if (m_x >= maxw - 10 || m_x <= 10)
			m_dX *= -1;

		if (m_y >= maxh - 10 || m_y <= 10)
			m_dY *= -1;
	}
}
