class Hospital{
static String patientName;
static int age;
static String gender;
static long phoneNo;
static String emailId;
static String address;
static String bloodGroup;
static String medicalHistory;
static String currentMedications;
static String emergencyContact;

public static boolean registerPatient(String name, int ageParam, String genderParam, long phone, String email, String addr, String blood, String history, String medications, String emergency){
boolean isPatientRegistered = false;
boolean isNameValid = false;
boolean isAgeValid = false;
boolean isGenderValid = false;
boolean isPhoneValid = false;
boolean isEmailValid = false;
boolean isAddressValid = false;
boolean isBloodGroupValid = false;
boolean isHistoryValid = false;
boolean isMedicationsValid = false;
boolean isEmergencyContactValid = false;

if (name != null)) {
patientName = name;
isNameValid = true;
} 
else {
System.out.println("Enter a valid name");
}

if (ageParam > 0) {
age = ageParam;
isAgeValid = true;
} 
else {
System.out.println("Enter a valid age");
}

if (genderParam != null) {
gender = genderParam;
isGenderValid = true;
} 
else {
System.out.println("Enter a valid gender");
}

if (phone > 0) {
phoneNo = phone;
isPhoneValid = true;
} 
else {
System.out.println("Enter a valid phone number");
}

if (email != null) {
emailId = email;
isEmailValid = true;
} 
else {
System.out.println("Enter a valid email");
}

if (addr != null) {
address = addr;
isAddressValid = true;
} 
else {
System.out.println("Enter a valid address");
}

if (blood != null) {
bloodGroup = blood;
isBloodGroupValid = true;
} 
else {
System.out.println("Enter a valid blood group");
}

if (history != null) {
medicalHistory = history;
isHistoryValid = true;
} 
else {
System.out.println("Enter a valid medical history");
}

if (medications != null) {
currentMedications = medications;
isMedicationsValid = true;
} 
else {
System.out.println("Enter valid current medications");
}

if (emergency != null )) {
emergencyContact = emergency;
isEmergencyContactValid = true;
} 
else {
System.out.println("Enter a valid emergency contact");
}

if (isNameValid && isAgeValid && isGenderValid && isPhoneValid && isEmailValid && isAddressValid && isBloodGroupValid && isHistoryValid && isMedicationsValid && isEmergencyContactValid) {
isPatientRegistered = true;
}

return isPatientRegistered;
}

public static void getPatientDetails(){
System.out.println("Patient Name: " + patientName);
System.out.println("Age: " + age);
System.out.println("Gender: " + gender);
System.out.println("Phone Number: " + phoneNo);
System.out.println("Email ID: " + emailId);
System.out.println("Address: " + address);
System.out.println("Blood Group: " + bloodGroup);
System.out.println("Medical History: " + medicalHistory);
System.out.println("Current Medications: " + currentMedications);
System.out.println("Emergency Contact: " + emergencyContact);
}
}
