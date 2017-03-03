import java.util.Scanner;
public class Decision implements IDecision{

  private String m_question;
  private IDecision m_yes;
  private IDecision m_no;
  private String m_yesTerminal;
  private String m_noTerminal;

  public Decision(String question){
    m_question = question;
  }

  @Override
  public void setYes(IDecision yes){
    m_yes = yes;
  }
  @Override
  public void setNo(IDecision no){
    m_no = no;
  }
  @Override
  public void setYesTerminal(String terminal){
    m_yesTerminal = terminal;
  }
  @Override
  public void setNoTerminal(String terminal){
    m_noTerminal = terminal;
  }
  @Override
  public IDecision ask(){
		Scanner scanner = new Scanner(System.in);
    String input;
    do{
      System.out.println(m_question);
      input = scanner.nextLine();
      if(input.equalsIgnoreCase("yes")){
  			if(m_yes != null)
  				return m_yes;
  			else
  				System.out.println(m_yesTerminal);
  		}else if(input.equalsIgnoreCase("no")){
  			if(m_no != null)
  				return m_no;
  			else
  				System.out.println(m_noTerminal);
  		}else{
        System.out.println("Enter \"Yes\" or \"No\"");
      }
    } while(!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no"));


		return null;
	}
}
