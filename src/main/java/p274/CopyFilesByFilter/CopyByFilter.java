package p274.CopyFilesByFilter;

import java.io.*;


public class CopyByFilter {


    private String directoryFrom;
    private String directoryTo;
    private String [] extensions;



    CopyByFilter(String directoryFr, String directoryT) {

        this.directoryFrom = directoryFr;
        this.directoryTo = directoryT;
        this.extensions=null;
    }

    public CopyByFilter(String directoryFrom, String directoryTo, String extensions) {
        this.directoryFrom = directoryFrom;
        this.directoryTo = directoryTo;
        this.extensions = extensions.isEmpty()?null:extensions.split("\\s+");
    }


    public void copy() {
        try {
            File[] fileList = extensions == null ? new File(directoryFrom).listFiles() :
                    new File(directoryFrom).listFiles(new Filter(directoryFrom, extensions));
            try {
                for (File file : fileList) {
                    InputStream input = new FileInputStream(file);
                    OutputStream out = new FileOutputStream(new File(directoryTo + File.separator + file.getName()));
                    byte data[] = new byte[input.available()];
                    input.read(data);
                    out.write(data);
                    out.flush();
                    out.close();
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (NullPointerException e) {
            System.out.print("Wrong input information");
        }
    }
    }
