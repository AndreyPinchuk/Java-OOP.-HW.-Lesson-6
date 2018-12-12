package homeworkLesson6Tasck5;

import java.io.*;

public class Cloner {

    public <T> T clone(T value){
      try {
          ByteArrayOutputStream fos = new ByteArrayOutputStream();
          ObjectOutputStream oos = new ObjectOutputStream(fos);
          oos.writeObject(value);

          ByteArrayInputStream fis = new ByteArrayInputStream(fos.toByteArray());
          ObjectInputStream oin = new ObjectInputStream(fis);
          return (T)oin.readObject();

      }
      catch (CloningException | IOException | ClassNotFoundException e){
          System.out.println("Error"+e);
      }
        return value;
    }
}
