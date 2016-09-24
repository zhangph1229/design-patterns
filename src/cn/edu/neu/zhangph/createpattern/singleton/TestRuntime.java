package cn.edu.neu.zhangph.createpattern.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestRuntime {
	public static void main(String[] args) {
		Process p;
		BufferedReader input;
		try {
			p = Runtime.getRuntime().exec(
			        "C:/windows/system32/ping.exe 192.168.0.1");
			//get process input stream and put it to buffered reader
			 input = new BufferedReader(new InputStreamReader(
			        p.getInputStream()));
			String line;
			while ((line = input.readLine()) != null) {
			    System.out.println(line);
			}
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
