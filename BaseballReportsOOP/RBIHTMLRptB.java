import java.util.*;
import java.io.*;
public class RBIHTMLRptB extends RBITextRpt{
  public RBIHTMLRptB(String dataFile, String reportFile){
    super(dataFile, reportFile);
  }
  public void generateReport(List<DataPair> data){
    try {
        FileWriter fileWriter = new FileWriter(m_reportFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("<html>\n<body\n<table>\n");
        for(DataPair d : data){
          bufferedWriter.write("<tr><td>"+d.getName()+"</td>" + "<td>"+Integer.toString(d.getStat())+"</td></tr>");
          bufferedWriter.newLine();
        }
        bufferedWriter.write("</table>\n</body\n</html>\n");

        bufferedWriter.close();
    }
    catch(IOException ex) {
      ex.printStackTrace();
    }
  }
}
