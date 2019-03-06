import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

class GoogleInterview{

    public static void main (String [] args){

        File toConvert = new File("C:\\Users\\Mateo\\Desktop\\toConvert.txt");
        Long counter=0L;
        int startIdx=0;
        String [] chars ={"??=","??/","??'","??(","??)","??!","??<","??>","??-"};
        String [] charsPop ={"#","\\","^","[","]","|","{","}","~"};
        try {
            Scanner sc = new Scanner(toConvert);
            PrintWriter converted = new PrintWriter("C:\\Users\\Mateo\\Desktop\\Converted.txt");
            while (sc.hasNext()) {
                String text = sc.next();
                String replaced = text;
                for (int i = 0; i <text.length(); i++) {
                    for (int j = 0; j <chars.length ; j++) {

                        if(text.substring(startIdx,i).equals(chars[j]) || (text.equals(chars[j]))){
                            replaced =  text.replace(chars[j],charsPop[j]);

                            }
                    }

                }
                System.out.println(text+ " = lenght(): "+ text.length() +" => "+ replaced);

                converted.print(replaced+" ");
                counter++;
            }
           converted.close();
           sc.close();
            System.out.println(counter);
        }catch (Exception ex){
            System.out.println(ex+" cos poszlo nie tak");
        }


    }

}