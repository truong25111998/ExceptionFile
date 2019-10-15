package filemanager;

import java.io.File;

public class FileManager {
    private String path;
    public FileManager(String path){
        this.path = path;
    }

    public void checkSomeMethod(){
        File f = new File(path);
        //kiem tra file co ton tai khong
        if (f.exists()){
            System.out.println("file: " + path +"  Ton tai");
        }else {
            System.out.println("file: " + path +"  Khong ton tai");
        }

        //lay duong dan cua file:
        String pathFile = f.getPath();
        System.out.println("pathFile: " +pathFile);
        //lay ra file chua file hien tai
        File fileParent = f.getParentFile();
        System.out.println("fileParent: " +fileParent);
        //xoa file
//        f.delete()
        //lay ten file
        String nameFile = f.getName();
        System.out.println("nameFile: " + nameFile);
        //doi ten file
        String newPath = fileParent.getPath()+File.separator + "test_file";
//        f.renameTo(new File(newPath));

        //kiem tra xem f co phai la folder hay khong
        if (f.isDirectory()){
            System.out.println("file tren la thu muc");
        }else {
            System.out.println("file tren khong phai la thu muc");
        }

        //kiem tra f co phai la file hay khong
        if(f.isFile()){
            System.out.println("f la file");
        }else{
            System.out.println("f khong phai la file");
        }

        //lay danh sach cac file con trong folder
        if (f.isDirectory()){
            File[] fs = f.listFiles();
            for ( int i = 0; i < fs.length; i++){
                System.out.println("file con: " + fs[i].getPath());
            }
        }

//tao thu muc
//        f.mkdirs();
//        tao file
//        f.createNewFile();
    }

    public void listAllFile(String path){
        File f = new File(path);
        if (!f.exists()){
            return;
        }
        System.out.println(f.getPath());
        if (f.isDirectory()){
            File[] fs = f.listFiles();
            for ( int i = 0; i < fs.length; i++){
                File fileChild = fs[i];
                listAllFile(fileChild.getPath());
            }
        }
    }

    
}
