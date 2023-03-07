package hello;

import java.util.Scanner;

@SuppressWarnings("unused")
public class data {
	
	String Frist_name, Sec_name, phone, gander;
	int Age, ID_mopile;
	static int 	ID_costmour = 1, cnt = 1;
	public String getFrist_name() {
		return Frist_name;
	}
	public void setFrist_name(String frist_name) {
		Frist_name = frist_name;
	}
	public String getSec_name() {
		return Sec_name;
	}
	public void setSec_name(String sec_name) {
		Sec_name = sec_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGander() {
		return gander;
	}
	public void setGander(String gander) {
		this.gander = gander;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getID_mopile() {
		return ID_mopile;
	}
	public void setID_mopile(int iD_mopile) {
		ID_mopile = iD_mopile;
	}

	
	public void display_data() {
		 if (getGander() == "male") System.out.print("Mr. ");
		 else System.out.print("Mrs. ");
		 System.out.print(getFrist_name() + ' ' + getSec_name() + "\n");
		 System.out.print("phone : " + getPhone() + "\n");
		 System.out.print("Age : " + getAge() + "\n");
		 System.out.print("Gender : " + getGander() + "\n");
		 System.out.print("ID Mopile  : " + getID_mopile() + "\n");
		 System.out.print("ID Coustmor : " + cnt + "\n");
		 cnt++;	
	}
	
	

}
