import java.io.*;

public class CsvUtil {


    public static String read5Line(String fileName) {//set read function
        try{
            FileInputStream fileInputStream = new FileInputStream(fileName);

            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                sb.append(bufferedReader.readLine()).append("\n");
            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
            return sb.toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    public static void write3RowToNewFile(String sourceFileName,String targetFileName){//set write function
        try{
            FileInputStream fileInputStream = new FileInputStream(sourceFileName);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String s = null;
            FileOutputStream out = new FileOutputStream(targetFileName);
            OutputStreamWriter outWriter = new OutputStreamWriter(out, "UTF-8");
            BufferedWriter bufWrite = new BufferedWriter(outWriter);

            while ((s = bufferedReader.readLine())!=null){
                String[] split = s.split(",");
                int size = Math.min(split.length, 3);

                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < size; i++) {
                    sb.append(split[i]).append(",");
                }
                bufWrite.write(sb.substring(0,sb.length()-1)+"\n");
            }
            bufWrite.close();
            outWriter.close();
            out.close();
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception {
        write3RowToNewFile("annual.csv","bbb.csv");

    }
}
