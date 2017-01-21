
public class Student {
	
	public String getGrade(){
		if( gpa >=3.75f){
			return "A";
		}
		if( gpa >= 3.5f && gpa <3.75f){
			return "A-";
		}
		return "B";
	}

	float gpa;


}
