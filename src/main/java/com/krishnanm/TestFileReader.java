package com.krishnanm;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FileSystem;

public class TestFileReader {

  public static void main(String[] args) {
    System.out.println("File separator: " + org.apache.hadoop.fs.Path.SEPARATOR);
    System.out.println("Path separator: " + org.apache.hadoop.fs.Path.SEPARATOR_CHAR);
  }
}
