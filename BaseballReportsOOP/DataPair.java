public class DataPair{
  private String m_name;
  private int m_stat;

  public DataPair(String name, int stat){
    m_stat = stat;
    m_name = name;
  }
  public String getName(){
    return m_name;
  }
  public int getStat(){
    return m_stat;
  }
}
