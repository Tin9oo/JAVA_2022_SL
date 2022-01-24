import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class  Student {
	private int ID;
	private String name;
	private int score;
	
	Student() {
		this.ID = 0;
		this.name = "";
		this.score = 0;
	}
	Student(int ID, String name, int score){
		this.ID = ID;
		this.name = name;
		this.score = score;
	}
	
	int getID() {
		return this.ID;
	}
	String getName() {
		return this.name;
	}
	int getScore() {
		return this.score;
	}
	
	void setID(int ID) {
		this.ID = ID;
	}
	void setName(String name) {
		this.name = name;
	}
	void setScore(int score) {
		this.score = score;
	}
	
	public String toString() {
		return name+"'s ID is "+ID+" and his/her score is "+score+"\n";
	}
	
	public int compareTo(Student s) {
		if(this.score < s.score) return -1;
		else if (this.score > s.score) return 1;
		else return 0;
	}
}

public class AL {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\JAVA_2022_SL\\Lab10-2\\src\\data.txt");
			FileReader fin = new FileReader(file);
			BufferedReader bin = new BufferedReader(fin);
			
			String line="";
			String[] part = new String[3];
			ArrayList<Student> a = new ArrayList<Student>(8);
			
			// Student[] s = new Student[10];
			
			int i=-1;
			while ((line = bin.readLine()) != null) {
				part = line.split(", ");
				a.add(new Student());
				a.get(++i).setID(Integer.parseInt(part[0]));
				a.get(i).setName(part[1]);
				a.get(i).setScore(Integer.parseInt(part[2]));
			}
			
			file = new File("D:\\JAVA_2022_SL\\Lab10-2\\src\\output.txt");
			FileWriter fout = new FileWriter(file);
			BufferedWriter bout = new BufferedWriter(fout);
			
			i=-1;
			while(++i<8) {
				//fout.write(s[j].toString());
				bout.write(a.get(i).toString());
			}
			
			System.out.println("Max : " + Collections.max(a, Comparator.comparingInt(Student::getScore())));
			
			fin.close();
			bout.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

	private static Object getScore() {
		// TODO Auto-generated method stub
		return null;
	}
}
