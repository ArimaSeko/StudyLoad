/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kz.kstu.coursework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

/**
 *
 * @author j3t1x
 */
public class Person {
  private String Name;
  private ArrayList<String>  actions= new ArrayList<>();
  private int TeacherCode=0;
  private String TypeOfUser;

    public Person(String Name, String TypeOfUser,int TeacherCode) {
        this.Name = Name;
        this.TypeOfUser = TypeOfUser;
        this.TeacherCode = TeacherCode;
    }

    public ArrayList<String> getActions() {
        return actions;
    }
    public String getTypeOfUser() {
        return TypeOfUser;
    }

    public void setTypeOfUser(String TypeOfUser) {
        this.TypeOfUser = TypeOfUser;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getAction(int index) {
        return actions.get(index);
    }

    public void setAction(String object,int index) {
        this.actions.set(index, object);
    }
public void addAction(String object) {
    if(object!=null)
        this.actions.add(CurrentDateTime.getTime()+"  "+object);
    }
    public int getTeacherCode() {
        return TeacherCode;
    }

    public void setTeacherCode(int teacherCode) {
        this.TeacherCode = teacherCode;
    }
    public void logWrite(){
        String text=" ";
        FileOutputStream fos = null;
        Path filePath = null;
String path=null;
char[] chararay=null;
File file = new File("D:\\log.txt");
for(int i =0;i<actions.size();i++)if(actions.get(i)!=null)text=text+actions.get(i)+"\n";
    try {
        text=text+CurrentDateTime.getTime()+"  logOut+\n--------------------------------------------\n";
                  chararay = text.toCharArray();
                   path = file.getPath();
                filePath = Path.of(path);
                fos = new FileOutputStream(file,true);
                for(int i = 0;i<chararay.length;i++){
                fos.write(chararay[i]);
                }
            System.out.println(text);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
