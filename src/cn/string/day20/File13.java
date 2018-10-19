package cn.string.day20;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File13 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("fos2.txt");

      /*  fos.write(97);
        fos.write(57);
        fos.write(55);*/
      byte[] bys={97,98,99,100};
      //fos.write(bys);
        fos.write(bys,1,3);

        fos.close();
    }
}
