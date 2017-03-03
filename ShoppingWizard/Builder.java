public class Builder {
	private static Builder instance;
  public static Builder getInstance() {
		if (instance == null)
			instance = new Builder();

			return instance;
	}
	private Builder() {}

	public IDecision buildWizard() {
		IDecision sb1 = new Decision("Do you want to buy a snowboard?");
		IDecision sb2 = new Decision("Have you snowboarded before?");
		IDecision sb3 = new Decision("Are you an expert?");
		IDecision sb4 = new Decision("Do you like to go fast?");

		IDecision ski1 = new Decision("Do you want to buy downhill skis?");
		IDecision ski2 = new Decision("Have you gone skiing before?");
		IDecision ski3 = new Decision("Are you an expert?");
		IDecision ski4 = new Decision("Do you like to jump?");

		sb1.setYes(sb2);
		sb1.setNo(ski1);
		sb2.setYes(sb3);
		sb2.setNoTerminal("Buy the XG100 model.");
		sb3.setYes(sb4);
		sb3.setNoTerminal("Buy the XG200 model.");
		sb4.setYesTerminal("Buy the XG300 model.");
		sb4.setNoTerminal("Buy the XG200 model.");

		ski1.setYes(ski2);
		ski1.setNoTerminal("You should try skiing!");
		ski2.setYes(ski3);
		ski2.setNoTerminal("Buy the ZR100 model.");
		ski3.setYes(ski4);
		ski3.setNoTerminal("Buy the ZR200 model.");
		ski4.setYesTerminal("Buy the ZR300 model.");
		ski4.setNoTerminal("Buy the ZR200 model.");

		return sb1;
	}

}
