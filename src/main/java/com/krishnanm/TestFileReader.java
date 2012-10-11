package com.krishnanm;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import java.io.IOException;
import java.net.URI;

public class TestFileReader {

  public static void main(String[] args) throws IOException {
    System.out.println("File separator: " + org.apache.hadoop.fs.Path.SEPARATOR);
    System.out.println("Path separator: " + org.apache.hadoop.fs.Path.SEPARATOR_CHAR);

    String basePath = "/user/cloudera";
    String trailingPath = "testdir";
    Path fullPath = new Path(basePath, trailingPath);
    System.out.println(fullPath.toString());

    Configuration conf = new Configuration();
    System.out.println(conf.toString());

    FileSystem localFileSystem = FileSystem.getLocal(conf);
    System.out.println(localFileSystem.toString());
/*
    URI namenode = URI.create("hdfs://0.0.0.0:8020");

    FileSystem hdfs = FileSystem.get(namenode, conf);
    System.out.println(hdfs.toString());
*/
  }
}
