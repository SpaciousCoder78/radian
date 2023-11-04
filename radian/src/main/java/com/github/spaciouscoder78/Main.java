package com.github.spaciouscoder78;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;
public class Main {
    public static void main(String[] args)  {
        try{
            Terminal terminal = new DefaultTerminalFactory().createTerminal();

        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}