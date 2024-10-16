package com.edu;

public class UserDataApp {

   User allUsers[] = new User[10];
   EmailService emailService = new EmailService();

   public boolean addUser(String username, String password, String email) {

       boolean insertStatus = false;
       boolean isValid = emailService.doEmailVerification(email);
       if(isValid) {
           // create user Object through constructor , pass all three arguments

           // insert user object in allUsers

           // change insert status to true
       }
       return insertStatus;

   }

   public int countEmailsBasedOnDomain(String domainName)
   {

       // count the number of emails related to that domainName , write code inside emialService

       // send back the count number
       return 0;
   }

    public static void main(String[] args) {

       UserDataApp app = new UserDataApp();

       boolean isInserted = app.addUser("rahul","kumar","rahul@yahoo.com");
       System.out.println(isInserted);// should print false;

        // also write case to print true;

        //---------------------------------------------------

         int count = app.countEmailsBasedOnDomain("gmail.com");
        System.out.println("Domain Name : Gmail.com \t Available emails : "+count);
   }

}
