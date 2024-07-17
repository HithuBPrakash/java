class ChatShopRunner{
public static void main(String args[]){
ChatShop.getDetailsOfShop();
boolean MyChatNames=ChatShop.createChatNames("Bhel Puri");
boolean MyChatPrice=ChatShop.addChatPrice(40.00);

 MyChatNames=ChatShop.createChatNames("Pani Puri");
MyChatPrice=ChatShop.addChatPrice(25.00);

 MyChatNames=ChatShop.createChatNames("Dahi Puri");
MyChatPrice=ChatShop.addChatPrice(35.00);

MyChatNames=ChatShop.createChatNames("Masala Puri");
MyChatPrice=ChatShop.addChatPrice(30.00);

if(MyChatNames==true && MyChatPrice==true){
	System.out.println("The menu is:");
}

ChatShop.getChatNames();
ChatShop.getChatPrices();



}

}












