package com.edu;

public class UserDataApp {

    User allUsers[] = new User[5];
    int indexCount = 0;
   UserService userService = new UserService();

   public boolean addUser(String username, String password, String email) {

       boolean insertStatus = false;
       boolean isValid = userService.doEmailDomainVerification(email);
       if(isValid) {
           // create user Object through constructor , pass all three arguments

           // insert user object in allUsers[]

           // change insert status to true
       }
       return insertStatus;

   }

   public User getUserBasedOnId(int userId){
       //Write code to search user from allUsers based on given UserId
       return null;
   }
   public boolean verifyEmailAndUserDetails(int userId)
   {
       User user = getUserBasedOnId(userId);
       if(user!=null)
       {
           // write code to verify that user email contains their firstName & lastName , through using
           // UserService isWordContains() method
           /* Sample output
           * for example
           * User Name is : Rahul Kumar
           * Email : rahul@gmail.com : it should return false
            *Email : rKumar@gmail.com : it should return false
            * Email : abc@gmail.com : it should return false
            *
            *Email : rahul.kumar@gmail.com : it should return true
            *Email : rahul.kumar.1@gmail.com : it should return true
            * Email : abc.rahul.kumar@gmail.com : it should return true
            *
           * */
       }
       return false;
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

        //---------------------------------------

        boolean isConsist = app.verifyEmailAndUserDetails(1);
        System.out.println("Is Consist "+isConsist);
   }

}
