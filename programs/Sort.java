//package com.jojuskills;
import java.util.*;
import java.io.*;
public class Sort {
 @SuppressWarnings({ "unchecked", "rawtypes" })
public static void main(String[] args) throws IOException {
 if (args.length > 0) {
 Arrays.sort(args);
 for (int i = 0; i < args.length; i++) {
 System.out.println(args[i]);
 }
 } else {
 List lines = new ArrayList();
 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 String line = null;
 while ((line = reader.readLine()) != null) {
 lines.add(line);
 }
 Collections.sort(lines);
 for (Iterator i = lines.iterator(); i.hasNext();) {
 System.out.println(i.next());
 }
 }
 }
}

