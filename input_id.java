import java.util.ArrayList;
import java.util.Scanner;

public class mini_test {

	public static class student{
		String ID;
		String Pw;
	
		public student(String i,String p) {
			this.ID=i;
			this.Pw=p;
		}
		
		public void student_show() {
			System.out.println("아이디:"+ID);
			System.out.println("비밀번호:"+Pw);
		}
   
	}

	public static void main(String[] args) {
		ArrayList<student> students=new ArrayList<student>();
		Scanner s = new Scanner(System.in); //입력
		int i; //menu
		
		
		 while(true) {
			System.out.println("===================");
			System.out.println("1.sign up");
			System.out.println("2.Login");
			System.out.println("3.print All User");
			System.out.println("4.Exit");
			System.out.println("===================");
			System.out.print("번호를 입력하세요:");
			i=s.nextInt();
			
			if(i==1) {
				System.out.println("아이디 입력:");
				String input_id=s.next();
				System.out.println("비밀번호 입력:");
				String input_pw=s.next();
				students.add(new student(input_id,input_pw));
			}
			else if(i==2){
				System.out.println("Not Ready");
			}
			else if(i==3) {
				for(int j=0;j<students.size();j++) {
					System.out.println("id:"+students.get(j).ID);
					System.out.println("pw:"+students.get(j).Pw);
				}
			}
			
			else if(i==4) {
				break;
			}
		 }
		
	}

}
