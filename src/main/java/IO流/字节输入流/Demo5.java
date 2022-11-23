package IO流.字节输入流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5 {
    public static void main(String[] args) throws IOException {
        //文件拷贝改写
        FileInputStream fis = new FileInputStream("C:\\Users\\天命之子\\Desktop\\dm\\" +
                "function-demo\\src\\main\\java\\a.txt");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\天命之子\\Desktop\\dm\\" +
                "function-demo\\src\\main\\java\\copy.txt");
        byte[] arr = new byte[1024*1024*5];//5MB的数组
        int len;//读取的个数
        while ( (len = fis.read(arr))!=-1){
            fos.write(arr,0,len);
        }
        fos.close();
        fis.close();

    }
}
