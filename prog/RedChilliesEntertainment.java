import java.util.Arrays;
class RedChilliesEntertainment{
static String movieActors[] = {null,null,null,null,null,null,null,null,null};
static int index;

public static boolean addMovieActors(String actorName){
boolean isAddMovieActors = false;
if(actorName != null){
movieActors[index] = actorName;
index++; 
isAddMovieActors = true;
        }
else{
System.out.println("Enter a valid Actor Name");
    }
return isAddMovieActors;
   }
   public static boolean updateActors(String oldActor,String newActor){
System.out.println("Update Actors started");
boolean isActorUpdated=false;
for(int index=0;index<movieActors.length;index++){
if(oldActor==movieActors[index]){
movieActors[index]=newActor;
isActorUpdated=true;
}
}
if(isActorUpdated==false){
System.out.println(oldActor+"Not Found");
}
System.out.println("update operation ended");
return isActorUpdated;
}

public static boolean deleteActors(String actorTobeDeleted){
System.out.println("delete method started");
boolean isActordeleted=false;
int newindex,oldindex;
for(newindex=0,oldindex=0;oldindex<movieActors.length;oldindex++){
if(movieActors[oldindex]!=actorTobeDeleted){
movieActors[newindex]=movieActors[oldindex];
newindex++;
	isActordeleted=true;

}
}
movieActors=Arrays.copyOf(movieActors,newindex);


if(isActordeleted==false){

	System.out.println(isActordeleted+"Not found");
}
System.out.println("delete operation ended");
return isActordeleted;
}


public static void getMovieActors(){
for(String myActorName : movieActors){
System.out.println(myActorName);
  }
   }
    }