import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Main {
	
	    private static ArrayList<String> FileToArray(ArrayList<String> lines) {
    	
        try {
            File file = new File("C:\\Users\\map_9\\Desktop\\file.csv");
            Scanner fileReader = new Scanner(file);
            
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                lines.add(line);
            }
            fileReader.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file.");
            e.printStackTrace();
        }
        
		return lines;
    }


	    private static void DeleteDuplicate(ArrayList<String> lines) {
	    	ArrayList<String> uniqueLines = new ArrayList<String>();
	    	
	    	for(int i=0; i < lines.size(); i++) {
	    		if(!uniqueLines.contains(lines.get(i))) {
	    			uniqueLines.add(lines.get(i));
	    		}
	    	}
	    	for(int i=0; i < uniqueLines.size(); i++) {
	    		
		    	System.out.println(uniqueLines.get(i));
		    	
	    		}
	    }
	    
	    
	    public static void main(String[] args) {
	    	ArrayList<String> fileString = new ArrayList<String>();
		
	    	fileString = FileToArray(fileString);
	    	
	    	DeleteDuplicate(fileString);
		
	    }
}
	

