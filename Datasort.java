/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Ryan
 */
public class Datasort {

    /**
     * @param args the command line arguments
     */
    public static void main (String [] args) throws IOException {

File fin = new File("week3.txt");	// input  file on e: drive (with data)   
File fout = new File("out.txt");	// create an out file on e: drive

// Java FileInputStream class obtains input bytes from a file
FileInputStream fis = new FileInputStream(fin);	  
FileOutputStream fos = new FileOutputStream(fout);

// buffering characters so as to provide for the efficient reading of characters, arrays, and lines
BufferedReader in = new BufferedReader(new InputStreamReader(fis));
BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

// declare an array in-line, ready for the sort

String aLine;
ArrayList<String> al = new ArrayList<> ();

int i = 0;
while ((aLine = in.readLine()) != null) {
// set the sort  for values is greater than 0
	if (!aLine.trim().startsWith("-") && aLine.trim().length() > 0) {
		al.add(aLine);
		i++;
			}
		}
 
Collections.sort(al);	// sorted content to the output  file
for (String s : al) {
    System.out.println(s);
	    out.write(s);
	    out.newLine();
	    out.newLine();
	}
 // close the 2 files
		in.close();
		out.close();
	}
}