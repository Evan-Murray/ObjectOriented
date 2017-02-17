import java.util.*;
import java.io.*;
public class HomeRunTextRpt{
  protected String m_dataFile;
  protected String m_reportFile;

  public HomeRunTextRpt(String dataFile, String reportFile){
    m_dataFile = dataFile;
    m_reportFile = reportFile;
  }

  public List<DataPair> loadData(){
    List<DataPair> list = new ArrayList<>();
    try {
      FileReader fileReader = new FileReader(m_dataFile);

      BufferedReader bufferedReader = new BufferedReader(fileReader);
      String line;
      while((line = bufferedReader.readLine()) != null) {
          String[] temp = line.split(",");
          if (temp.length >= 2)
            list.add(new DataPair(temp[0],Integer.parseInt(temp[1])));
      }
      bufferedReader.close();
    }catch(Exception e){
      e.printStackTrace();
    }
    return list;
  }
  public void generateReport(List<DataPair> data){
    try {
        FileWriter fileWriter = new FileWriter(m_reportFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(DataPair d : data){
          bufferedWriter.write(d.getName() + "    " + Integer.toString(d.getStat()));
          bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
    catch(IOException ex) {
      ex.printStackTrace();
    }
  }
}
