import java.io.*;

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
}

public class IOTest {
	public static void main(String[] args) {
		try {
			File file = new File("D:\\JAVA_2022_SL\\Lab9\\src\\data.txt");
			FileReader fin = new FileReader(file);
			BufferedReader bin = new BufferedReader(fin);
			
			String line="";
			String[] part = new String[3];
			
			Student[] s = new Student[10];
			
			int i=-1;
			while ((line = bin.readLine()) != null) {
				part = line.split(", ");
				s[++i] = new Student();
				s[i].setID(Integer.parseInt(part[0]));
				s[i].setName(part[1]);
				s[i].setScore(Integer.parseInt(part[2]));
			}
			
			file = new File("D:\\JAVA_2022_SL\\Lab9\\src\\output.txt");
			FileWriter fout = new FileWriter(file);
			BufferedWriter bout = new BufferedWriter(fout);
			
			i=-1;
			while(s[++i].getScore()!=-1) {
				//fout.write(s[j].toString());
				bout.write(s[i].toString());
			}
			
			fin.close();
			bout.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
