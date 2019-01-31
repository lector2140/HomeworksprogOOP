package p274.CopyFilesByFilter;

import java.io.File;

import java.io.FilenameFilter;

public class Filter implements FilenameFilter {
 private String []arr;

     public Filter(String yourPath, String[] arr) {
        this.arr = arr;
        File directory=new File(yourPath);
        //this.yourPath = yourPath;
    }


    private boolean checkExt(String extansion){
    for(String strExp:arr){
        if (extansion.equals(strExp)){ return true;}
        }
        return false;
}
    @Override
    public boolean accept(File directory, String name) {
        int indexPointInNameFile=name.indexOf('.');
        if(indexPointInNameFile==-1){return false;}
        String extansion=name.substring(indexPointInNameFile+1);
        return checkExt(extansion);

    }
}
    /*@Override
    public boolean accept(File pathname) {
        int indexPointInNameFile=pathname.getName().indexOf('.');
        if(indexPointInNameFile==-1){return false;}
        String exppansion=pathname.getName().substring(indexPointInNameFile+1);
        return checkExp(exppansion);
    }*/