import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataParser {

	List<SPdata> spDataList = new ArrayList<SPdata>();
	public void parseData(String fileName) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			String line;
			
			while ( (line = br.readLine()) != null )
			{
				String[] spdata = line.split(",");
				SPdata theData = new SPdata(spdata[0], spdata[1], spdata[2],
						spdata[3], spdata[4], spdata[5],spdata[6]);
				spDataList.add(theData);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (SPdata theData : spDataList) {
			System.out.println(theData.toString());
		}
		
	}
	
	public static void main(String[] args) {
		DataParser dp = new DataParser();
		dp.parseData("table.csv");
	}
	
}
