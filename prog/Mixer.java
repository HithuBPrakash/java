class Mixer{
static boolean isConnected;
static int currentVolume;
static int maximumVolume=8;

public static void onOrOff(){
System.out.println("on or off started);
if(isConnected==false){
isConnected==true;
System.out.println("Mixer is on");
}
else if(isConnected==true){
isConnected==false;
System.out.println("Turn off the Mixer");
}
System.out.println("on off ended");
return;
}

public static void increaseVolume(){
	System.out.println("increaseVolume started");
	if(isConnected==true){
		if(currentVolume<=maximumVolume){
			currentVolume++;
			System.out.println("the currentVolume is"+currentVolume);
		}
		else{
			System.out.println("Maximum volume is reached");
		}
	}
	else{
		System.out.println("Turn on the Mixer");
	}
	System.out.println("increaseVolume ended");
	return;
}