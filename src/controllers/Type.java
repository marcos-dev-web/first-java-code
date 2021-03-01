package controllers;

import java.io.*;

public class Type {
    String directory = System.getProperty("user.home");
    String fileName = ".filetosavetype233kk3k3lmgleardkji3s.txt";
    String absolutePath = directory + File.separator + fileName;

    public String getType() {
        StringBuilder r = new StringBuilder();

        try(FileInputStream fileInputStream = new FileInputStream(absolutePath)) {
            int ch = fileInputStream.read();
            while(ch != -1) {
                r.append((char) ch);
                ch = fileInputStream.read();
            }
            System.out.println(r);
        } catch (FileNotFoundException e) {
            return "not-found";
        } catch (IOException e) {
            return "error";
        }
        return r.toString();
    }

    public String setType(String type) {
        try(FileOutputStream fileOutputStream = new FileOutputStream(absolutePath)) {
            fileOutputStream.write(type.getBytes());
        } catch (FileNotFoundException e) {
            return "not-found";
        } catch (IOException e) {
            return "error";
        }
        return "";
    }
}
