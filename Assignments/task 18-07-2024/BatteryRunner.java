class BatteryRunner {
public static void main(String args[]) {
Battery battery1 = new Battery();
boolean isBatteryCreated = battery1.createBattery(1, "Duracell", 50.00);
System.out.println(isBatteryCreated);
battery1.displayBattery();

Battery battery2 = new Battery();
isBatteryCreated = battery2.createBattery(2, "Energizer", 55.00);
System.out.println(isBatteryCreated);
battery2.displayBattery();

Battery battery3 = new Battery();
isBatteryCreated = battery3.createBattery(3, "Panasonic", 60.00);
System.out.println(isBatteryCreated);
battery3.displayBattery();

Battery battery4 = new Battery();
isBatteryCreated = battery4.createBattery(4, "Eveready", 45.00);
System.out.println(isBatteryCreated);
battery4.displayBattery();

Battery battery5 = new Battery();
isBatteryCreated = battery5.createBattery(5, "Sony", 48.00);
System.out.println(isBatteryCreated);
battery5.displayBattery();

Battery battery6 = new Battery();
isBatteryCreated = battery6.createBattery(6, "GP", 52.00);
System.out.println(isBatteryCreated);
battery6.displayBattery();

Battery battery7 = new Battery();
isBatteryCreated = battery7.createBattery(7, "Energizer Ultimate Lithium", 40.00);
System.out.println(isBatteryCreated);
battery7.displayBattery();

Battery battery8 = new Battery();
isBatteryCreated = battery8.createBattery(8, "Rayovac", 58.00);
System.out.println(isBatteryCreated);
battery8.displayBattery();

Battery battery9 = new Battery();
isBatteryCreated = battery9.createBattery(9, "Kodak", 56.00);
System.out.println(isBatteryCreated);
battery9.displayBattery();

Battery battery10 = new Battery();
isBatteryCreated = battery10.createBattery(10, "Maxell", 54.00);
System.out.println(isBatteryCreated);
battery10.displayBattery();

Battery battery11 = new Battery();
isBatteryCreated = battery11.createBattery(11, "Toshiba", 62.00);
System.out.println(isBatteryCreated);
battery11.displayBattery();

Battery battery12 = new Battery();
isBatteryCreated = battery12.createBattery(12, "Energizer Rechargeable", 57.00);
System.out.println(isBatteryCreated);
battery12.displayBattery();

Battery battery13 = new Battery();
isBatteryCreated = battery13.createBattery(13, "Varta", 47.00);
System.out.println(isBatteryCreated);
battery13.displayBattery();

Battery battery14 = new Battery();
isBatteryCreated = battery14.createBattery(14, "GP Rechargeable", 53.00);
System.out.println(isBatteryCreated);
battery14.displayBattery();

Battery battery15 = new Battery();
isBatteryCreated = battery15.createBattery(15, "AmazonBasics", 59.00);
System.out.println(isBatteryCreated);
battery15.displayBattery();
}
}
