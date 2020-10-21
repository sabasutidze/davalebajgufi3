package ge.btu.io.saba;

import java.io.File;

public static void Main(String[]args){
    File file = new File("C:\\Users\\Home\Desktop\\testingjava");
    String[] fileName = file.list(new Filenamefilter(){
        @Override
        public boolean accept(File dir,String name){
        String sadzieboSityva="ge";
        if(name.toLowerCase().startsWith(sadzieboSityva.toLowerCase())){
        return true;
        }else{
        return false;
        }
        }
    });
    for(String fileName : fileNames){
        System.out.println(fileName);
    }
        }