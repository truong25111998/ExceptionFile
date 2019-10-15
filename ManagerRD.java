
package filemanager;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class ManagerRD {
    public void someMethod(String pathFile){
        try {
            RandomAccessFile rd = new RandomAccessFile(pathFile, "rw");
            String one = rd.readLine();
            String two = rd.readLine();

            rd.close();
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }

    public void saveStudent(Student s, String path){
        try {
            RandomAccessFile rd = new RandomAccessFile(path, "rw");
            //seek den vi tri cuoi cung
            rd.seek(rd.length());
            String content = s.getName()+"_"+s.getAge()+"_"+s.getDiem() +"\n";
            rd.write(content.getBytes());
            rd.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> readAllStudent(String path){
        List<Student>ss = new ArrayList<>();
        try {
            RandomAccessFile rd = new RandomAccessFile(path, "rw");
            String line = rd.readLine();
            while (line!=null){
                String[] strArr = line.split("_");
                Student s = new Student("Linh", 20, 9.5f);
                s.setName(strArr[0]);
                s.setAge(
                        Integer.parseInt(strArr[1])
                );
                s.setDiem(
                        Float.parseFloat(strArr[2])
                );
                ss.add(s);
                line = rd.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return ss;
    }
}
