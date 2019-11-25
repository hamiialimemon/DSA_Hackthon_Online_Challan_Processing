import java.util.*;
import java.util.Queue;

class OnlineChallanProcessing {
	public static void main(String[] args) {
		ChallanInfo info=new ChallanInfo();
		ChallanInfo info1=new ChallanInfo();
		info.setName("Hamid");
		info.setF_Name("Zaheer");
		info.setCnic(276589);
		info.setS_Sign("HAMID");
		info.setPhoneNo(0123455);
		info.setEmail("hamidali@gmail.com");
		info.setCat("B.E");
		info.setDept("Software");
		info.setBatch(18);
		info.setDate("25/11/2019");
		info.setFee(2000);
		info.setBankName("HBL Jamshoro");
		info.setBankAcc(924324);
		info.setDepositName("Jabbar");
		info.setDepositCnic(78345674);
		LinkedList <ChallanInfo> list=new LinkedList <ChallanInfo>();
		ArrayList <ChallanInfo> array=new ArrayList<ChallanInfo>();
		array.add(info);
		System.out.println(array.get(0).name);
		list.add(info);
		//list.add(info1);
		System.out.println("Challan No:     "+list.get(0).challanNo);
		System.out.println("Name:           "+list.get(0).name);
		System.out.println("Father Name:    "+list.get(0).f_name);
		System.out.println("Student ID:     "+list.get(0).s_Id);
		System.out.println("CNIC:           "+list.get(0).cnic);
		System.out.println("Email:          "+list.get(0).email);
		System.out.println("Phone No:       "+list.get(0).phoneNo);
		System.out.println("Category        "+list.get(0).category);
		System.out.println("Department:     "+list.get(0).dept);
		System.out.println("Batch:          "+list.get(0).batch);
		System.out.println("Date:           "+list.get(0).date);
		System.out.println("fees:           "+list.get(0).fee);
		System.out.println("Bank Name:      "+list.get(0).bank_Name);
		System.out.println("Bank Account:   "+list.get(0).bank_Acc);
		System.out.println("Depositer Name: "+list.get(0).depositer_Name);
		System.out.println("Depositer CNIC: "+list.get(0).depositer_CNIC);
		System.out.println("Student Sign:   "+list.get(0).s_sign);
		int search;

	}
}
class ChallanInfo {
	int challanNo=100;
	String name;
	String f_name;
	String s_Id;
	long cnic;
	Long phoneNo;
	String email;
	String category;
	String dept;
	int batch;
	String date;
	int fee;
	String bank_Name;
	long bank_Acc;
	String depositer_Name;
	long depositer_CNIC;
	String s_sign;
	int count;
	public void setName(String name){
		this.name=name;
		challanNo++;
	}
	public void setF_Name(String f_name){
		this.f_name=f_name;
	}
	public void setS_Id(String s_Id){
		this.s_Id=s_Id;
	}
	public void setCnic(long cnic){
		this.cnic=cnic;
	}
	public void setS_Sign(String s_sign){
		this.s_sign=s_sign;
	}
	public void setPhoneNo(long phoneNo){
		this.phoneNo=phoneNo;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setCat(String category){
		this.category=category;
	}
	public void setDept(String dept){
		this.dept=dept;
	}
	public void setBatch(int batch){
		this.batch=batch;
	}
	public void setDate(String date){
		this.date=date;
	}
	public void setFee(int fee){
		this.fee=fee;
	}
	public void setBankName(String bank_Name){
		this.bank_Name=bank_Name;
	}
	public void setBankAcc(long bank_Acc){
		this.bank_Acc=bank_Acc;
	}
	public void setDepositName(String depositer_Name){
		this.depositer_Name=depositer_Name;
	}
	public void setDepositCnic(Long depositer_CNIC){
		this.depositer_CNIC=depositer_CNIC;
	}
	public String getter() {
		return name;
	}
}