
package EvidencPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;




public class ReadWrite {
    
    //Write to file from object
    public static void WriteToFile(String fileName, List<Student>student){
    //File , PrintWriter ,FileWriter
    File destFile = new File(fileName+".txt");
        try {
            if(destFile.exists() == false){
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile,true));
            for(Student s: student){
            out.append(s.getId()+", "+s.getName()+", "+s.getEmail()+", "+s.getGender()+", "+
                    s.getAge()+", "+s.getRound()+", "+s.getCourses()+", "+s.getComments()+"\n");
            }
            out.close();
        } catch (Exception e) {
        }
    }
    
    //read from file to table
    public static void readFromFileToTable(String fileName,DefaultTableModel model){}
BufferedReader reader = new BufferedReader(new FileReader(fileName+".txt"));
    
    
}
