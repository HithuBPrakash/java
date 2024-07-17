import java.util.Arrays;
class Girias{
static String homeAppliances[] ={null,null,null,null,null,null,null,null,null,null,null,null};
static int index;

public static boolean createHomeAppliance(String applianceName){
boolean isCreateHomeAppliance = false;
if(applianceName != null){
homeAppliances[index] = applianceName;
index++; 
isCreateHomeAppliance = true;
     }
else{
System.out.println("Enter a valid Appliance Name");
    }
return isCreateHomeAppliance;
}
public static boolean updateAppliance(String oldAppliance,String newAppliance){
	System.out.println("update method started");
	boolean isupdateAppliance=false;
	for(index=0;index<homeAppliances.length;index++){
		if(oldAppliance==homeAppliances[index]){
			homeAppliances[index]=newAppliance;
			isupdateAppliance=true;
		}
	}
	if(isupdateAppliance==false){
		System.out.println("Enter valid details");
	}
		System.out.println("update method ended");
	return	isupdateAppliance;
}
public static boolean deleteAppliance(String applianceToBeDeleted){
		System.out.println("delete method started");
		boolean isdeleteAppliance=false;
		int newIndex,oldIndex;
		for(newIndex=0,oldIndex=0;oldIndex<homeAppliances.length;oldIndex++){
			if(homeAppliances[oldIndex]!=applianceToBeDeleted){
				homeAppliances[newIndex]=homeAppliances[oldIndex];
				newIndex++;
				isdeleteAppliance=true;
			}
		}
		homeAppliances=Arrays.copyOf(homeAppliances,newIndex);
		if(isdeleteAppliance=false){
			System.out.println("enter valid details");
		}
		return isdeleteAppliance;
}
public static void getHomeAppliances(){
for(String myApplianceName : homeAppliances){
System.out.println(myApplianceName);
  }
  }
}