import java.io.File;
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
                for (int i = 0; i <= text.length(); i++) {
                    for (int j = i; j <= text.length(); j++) {
                        for (int k = 0; k < chars.length; k++) {

                            System.out.println("startIdx: " + startIdx + ",i: " + i + ", j: " + j + ", k: " + k);
                            if (text.substring(i, j).equals(chars[k])) {
                                replaced = text.replace(chars[k], charsPop[k]);
                                System.out.println(text + " = length(): " + text.length() + " => " + replaced);
                            }
                        }
                    }

                    counter++;
                }
                converted.print(replaced + " ");

            }
           converted.close();
           sc.close();
            System.out.println(counter);
        }catch (Exception ex){
            System.out.println(ex+" cos poszlo nie tak");
        }


    }

}