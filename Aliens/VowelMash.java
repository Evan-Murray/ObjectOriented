public class VowelMash implements ICrypto{
  private static VowelMash instance;
  public static VowelMash getInstance() {
		if (instance == null)
			instance = new VowelMash();

			return instance;
	}

  @Override
  	public String encrypt(String message) {
  		IMessageParser parser = Factory.getInstance().createParser(message);
  		String s = "";
  		for (int i = 0; i < parser.getCharCount(); i++) {
  			char c = parser.getChar(i);
  			switch (c) {
  				case 'A':	c = 'E';
  							break;
  				case 'E':	c = 'I';
  							break;
  				case 'I':	c = 'O';
  							break;
  				case 'O':	c = 'U';
  							break;
  				case 'U':	c = 'A';
  							break;
  				default:	break;
  			}
  			s += c;
  		}

  		return s;
  	}

  	@Override
  	public String decrypt(String message) {
  		IMessageParser parser = Factory.getInstance().createParser(message);
  		String s = "";
  		for (int i = 0; i < parser.getCharCount(); i++) {
  			char c = parser.getChar(i);
  			switch (c) {
  				case 'E':	c = 'A';
  							break;
  				case 'I':	c = 'E';
  							break;
  				case 'O':	c = 'I';
  							break;
  				case 'U':	c = 'O';
  							break;
  				case 'A':	c = 'U';
  							break;
  				default:	break;
  			}
  			s += c;
  		}

  		return s;
  	}
}
