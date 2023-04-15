/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kz.kstu.coursework;

import java.text.SimpleDateFormat;  
import java.util.Date;  
public class CurrentDateTime {  
public static String getTime() {  
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
    System.out.println(formatter.format(date));  
    return formatter.format(date);
}  
}  
