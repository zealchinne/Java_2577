package com.jojuskills;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Unique {
 @SuppressWarnings("unchecked")
public static void main(String[] args) throws IOException {
 @SuppressWarnings("rawtypes")
Set unique = new HashSet(); // replace with TreeSet to get them sorted
 if (args.length > 0) {
 unique.addAll(Arrays.asList(args));
 } else {
 BufferedReader reader = new BufferedReader(new InputStreamReader(
 System.in));
 String line = null;
 while ((line = reader.readLine()) != null) {
 unique.add(line);
 }
 }
 for (@SuppressWarnings("rawtypes")
Iterator i = unique.iterator(); i.hasNext();) {
 System.out.println(i.next());
 }
 }
}
