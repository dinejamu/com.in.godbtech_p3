package homeclass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFiles {
	public ReadFiles() {
		System.out.println("Test.Test()");
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br1 = null;
		BufferedReader br2 = null;
		String sCurrentLine;
		List<String> a = new ArrayList<String>();
		List<String> b = new ArrayList<String>();
		br1 = new BufferedReader(new FileReader("C:\\Users\\Dinesh V\\Desktop\\file1.txt"));
		br2 = new BufferedReader(new FileReader("C:\\Users\\Dinesh V\\Desktop\\file2.txt"));
		while ((sCurrentLine = br1.readLine()) != null) {
			a.add(sCurrentLine);
		}
		while ((sCurrentLine = br2.readLine()) != null) {
			b.add(sCurrentLine);
		}

		System.out.println("All Files Values-->");
		System.out.println(a);
		System.out.println(b);
		System.out.println();

		ArrayList<String> uniqueArr = new ArrayList<>();
		ArrayList<String> duplicateArr = new ArrayList<>();

		for (int i = 0; i < a.size(); i++) {
			if (!duplicateArr.contains(a.get(i))) {
				uniqueArr.add(a.get(i));
				duplicateArr.add(a.get(i));
			} else {
				uniqueArr.remove(a.get(i));
			}
		}
		for (int j = 0; j < b.size(); j++) {
			if (!duplicateArr.contains(b.get(j))) {
				uniqueArr.add(b.get(j));
				duplicateArr.add(b.get(j));
			} else {
				uniqueArr.remove(b.get(j));
			}
		}
		System.out.println("Unique Words--->");
		for (String a1 : uniqueArr) {
			System.out.println(a1);
		}
		br1.close();
		br2.close();
	}
}
