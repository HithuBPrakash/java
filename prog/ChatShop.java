class ChatShop{
static String name="Sri Vinayaka Chat Shop";
static String ownerName="Hithu";

static int index;
static int i;
static String ChatNames[]={null,null,null,null,null,null};
static double ChatPrices[]={0.0,0.0,0.0,0.0,0.0,0.0};
public static boolean createChatNames(String chatName){
 boolean iscreateChatNames=false;
  System.out.println("method started");
  if(chatName!=null){
  ChatNames[index]=chatName;
   index++; 
    iscreateChatNames=true;

   }
   else{
   System.out.println("Enter valid Chat Names");
   }
    System.out.println("method ended");
		return iscreateChatNames;

	}
public static boolean addChatPrice(double price){
 boolean  isChatPrice=false;
   if(price!=0.0){
	   ChatPrices[i]=price;
	   i++;
isChatPrice=true;

}
else{
	System.out.println("Enter valid amount");
}
return isChatPrice;
}

	public static void getChatNames(){
	System.out.println("method started");
	for(String MychatName:ChatNames)
	System.out.println(MychatName);
		System.out.println("method ended");

	}
	public static void getChatPrices(){
	for(double ChatPrice:ChatPrices)
	System.out.println(ChatPrice);		

	}

	public static void getDetailsOfShop(){
		System.out.println("The Shop name is:"+name);
		System.out.println("The Owner name is:"+ownerName);
}
}
