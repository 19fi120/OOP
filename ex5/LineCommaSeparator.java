package ex5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCommaSeparator {
	public static void main(String[] args) {
		String filename = "address.txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				for (int i = 0; i<data.length; i++) {
					System.out.print(i + ":" + data[i] + "\t");
				}
				System.out.println();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println(filename + "が見つかりません。");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
