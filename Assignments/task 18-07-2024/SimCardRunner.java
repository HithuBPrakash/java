class SimCardRunner {
public static void main(String args[]) {
SimCard simCard1 = new SimCard();
boolean isSimCardCreated = simCard1.createSimCard(1, "Jio", "4G");
System.out.println(isSimCardCreated);
simCard1.displaySimCard();

SimCard simCard2 = new SimCard();
isSimCardCreated = simCard2.createSimCard(2, "Airtel", "5G");
System.out.println(isSimCardCreated);
simCard2.displaySimCard();

SimCard simCard3 = new SimCard();
isSimCardCreated = simCard3.createSimCard(3, "Vodafone", "4G");
System.out.println(isSimCardCreated);
simCard3.displaySimCard();

SimCard simCard4 = new SimCard();
isSimCardCreated = simCard4.createSimCard(4, "BSNL", "2G");
System.out.println(isSimCardCreated);
simCard4.displaySimCard();

SimCard simCard5 = new SimCard();
isSimCardCreated = simCard5.createSimCard(5, "Idea", "Prepaid");
System.out.println(isSimCardCreated);
simCard5.displaySimCard();

SimCard simCard6 = new SimCard();
isSimCardCreated = simCard6.createSimCard(6, "Tata Docomo", "Postpaid");
System.out.println(isSimCardCreated);
simCard6.displaySimCard();

SimCard simCard7 = new SimCard();
isSimCardCreated = simCard7.createSimCard(7, "Reliance", "3G");
System.out.println(isSimCardCreated);
simCard7.displaySimCard();

SimCard simCard8 = new SimCard();
isSimCardCreated = simCard8.createSimCard(8, "MTNL", "4G");
System.out.println(isSimCardCreated);
simCard8.displaySimCard();

SimCard simCard9 = new SimCard();
isSimCardCreated = simCard9.createSimCard(9, "Videocon", "LTE");
System.out.println(isSimCardCreated);
simCard9.displaySimCard();

SimCard simCard10 = new SimCard();
isSimCardCreated = simCard10.createSimCard(10, "Mobile", "GSM");
System.out.println(isSimCardCreated);
simCard10.displaySimCard();

SimCard simCard11 = new SimCard();
isSimCardCreated = simCard11.createSimCard(11, "Telenor", "4G");
System.out.println(isSimCardCreated);
simCard11.displaySimCard();

SimCard simCard12 = new SimCard();
isSimCardCreated = simCard12.createSimCard(12, "Loop Mobile", "Unlimited");
System.out.println(isSimCardCreated);
simCard12.displaySimCard();

SimCard simCard13 = new SimCard();
isSimCardCreated = simCard13.createSimCard(13, "Docomo", "Voice");
System.out.println(isSimCardCreated);
simCard13.displaySimCard();

SimCard simCard14 = new SimCard();
isSimCardCreated = simCard14.createSimCard(14, "Aircel", "5G");
System.out.println(isSimCardCreated);
simCard14.displaySimCard();

SimCard simCard15 = new SimCard();
isSimCardCreated = simCard15.createSimCard(15, "BSNL", "Voice and Data");
System.out.println(isSimCardCreated);
simCard15.displaySimCard();
}
}
