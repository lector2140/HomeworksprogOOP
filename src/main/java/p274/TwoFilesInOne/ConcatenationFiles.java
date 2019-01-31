package p274.TwoFilesInOne;
import java.io.*;
import java.util.ArrayList;

public class ConcatenationFiles {
public static void main(String[]args){
    ConcatenationFiles files=new ConcatenationFiles();
    files.concatenationFilesBySameWords("list.txt","list1.txt");
}

    public void concatenationFilesBySameWords(String fileNameFirst,String fileNameSecond){
       try( BufferedReader bf1=new BufferedReader(new FileReader("src\\main\\resources\\resources_p274_TwoFilesInOne\\"+fileNameFirst));

            BufferedWriter bf3=new BufferedWriter(new FileWriter("src\\main\\resources\\resources_p274_TwoFilesInOne\\result.txt"));
            )
       {   BufferedReader bf2=new BufferedReader(new FileReader("src\\main\\resources\\resources_p274_TwoFilesInOne\\"+fileNameSecond));
           ArrayList <String> listOfEqualWords=new ArrayList<>();
           String wordToSerch;
           while ((wordToSerch=bf1.readLine())!=null){
          String word2=null;
               if (word2==null){
                   bf2.close();
                   bf2 =new BufferedReader(new FileReader("src\\main\\resources\\resources_p274_TwoFilesInOne\\"+fileNameSecond));
               }
           while ((word2=bf2.readLine())!=null){
               if (wordToSerch.equals(word2)){
                   listOfEqualWords.add(wordToSerch);

                   break;
               }


           }
       }
           bf1.close();
           bf2.close();
           bf3.write(listOfEqualWords.toString());


       }catch (IOException e){e.fillInStackTrace();}
    }
}
