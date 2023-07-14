import javax.swing.*;
import java.awt.*;
import java.io.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   public static void main(String[] args) {
     ;
      String filePath = "datos.dat";
      Estudiantes[] estudiantes=new Estudiantes[4];
     estudiantes[0] = new Estudiantes("Leonel", "Messi",238967,17684938,"Leo");
      try (FileOutputStream fileout = new FileOutputStream(filePath);
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileout);
      ) {
         objectOutputStream.writeObject(estudiantes);
         System.out.println("archivo escrito correctamente");


      } catch (IOException e) {
         throw new RuntimeException(e);
      }
      ///////////////
      try(
              FileInputStream fileIn=new FileInputStream(filePath);
              ObjectInputStream objectInputStream=new ObjectInputStream(fileIn);
      ) {
         Estudiantes readObject=(Estudiantes) objectInputStream.readObject();
         System.out.println("El ojeto en disco es: "+readObject);
         System.out.println(readObject.getCodigo());
         System.out.println(readObject.getCedula());
         System.out.println(readObject.getNombre());
         System.out.println(readObject.getApellido());
         System.out.println(readObject.getSigno());

      } catch (IOException e) {
         throw new RuntimeException(e);
      } catch (ClassNotFoundException e) {
         throw new RuntimeException(e);
      }
   }


   }
