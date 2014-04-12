package com.kirishikistudios.designpattern.interpreter;

import java.io.*;
import java.text.ParseException;

/**
 * @author yamadanaoyuki
 */
public class Main {
    public static void main(String[] args){
        try{
            InputStreamReader inputStreamReader = new InputStreamReader(ClassLoader.getSystemResourceAsStream("program.txt"));
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String text;
            while((text = reader.readLine()) != null){
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
