import java.util.*;
import java.io.*;
public class RBITextRpt extends HomeRunTextRpt{
  public RBITextRpt(String dataFile, String reportFile){
    super(dataFile, reportFile);
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
            list.add(new DataPair(temp[0],Integer.parseInt(temp[2])));
      }
      bufferedReader.close();
    }catch(Exception e){
      e.printStackTrace();
    }
    return list;
  }
}
