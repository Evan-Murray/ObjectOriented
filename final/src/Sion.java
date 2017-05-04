import java.applet.*;

public class Sion extends Hero
{
	private AudioClip sion = Applet.newAudioClip(getClass().getResource("Sion.wav"));
	private int speed = 5;
	private int charge_speed = 1;
	private int charge_duration = 30 * 2;
	private int charge = 0;
	private boolean charging = false;

	public Sion(int x, int y)
	{
		super("../images/Sion.png", "Sion", x, y,  40, 40, 5 * 30);
	}

	@Override
	public void tickCallback(int maxw, int maxh)
	{
		charging = charge > 0;
		if (charging)
		{
			invulnerable = true;
			charge--;
			if(charge_speed < 20){
				charge_speed += 1;
			}
			m_dX = Integer.signum(m_dX) * charge_speed;
			m_dY = Integer.signum(m_dY) * charge_speed;
		}
		else
		{
			charge_speed = 1;
			invulnerable = false;
			m_dX = Integer.signum(m_dX) * speed;
			m_dY = Integer.signum(m_dY) * speed;
		}

	}

	@Override
	public void keyPressedCallback(char ch)
	{
		if (ch == ' ' && charge == 0 && m_cd == 0 && !m_dead)
		{
			sion.play();
			charge = charge_duration;
			m_cd = m_cdlength;
		}
	}


}
