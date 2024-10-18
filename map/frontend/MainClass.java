package com.edu.map.frontend;

import com.edu.map.entity.Policy;
import com.edu.map.entity.User;
import com.edu.map.service.PolicyService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MainClass {

    PolicyService policyService = new PolicyService();

    public static void main(String[] args) {

    }
    public void showAllAvailablePolicy(){

    }
    // Overloaded Method
    public Policy getPolicy(int pId){
        return null;
    }
    public Policy getPolicy(String policyName){
        return null;
    }

    public User getUser(String username, String password)
    {
        return null;
    }
    public void setPolicy(User user, Policy policy){}
    public void printUserDetails(User user){
        /* Print the user name , user address and user policy*/
        // Note : if address is not set , Print : Update Address
        // if Policy is not yet set , print : No Policy Selected
    }

    public void getPaymentReminder(User user)
    {
        /* Print the policy Name which has the due/upcomming payments in the current month*/

        // write code to print the list of policies with payment value & date
    }

    public void printUsersForPaymentReminder()
    {
        /* This operation is called by Admin */

        List<User> toWhomToRemind = new ArrayList<User>();
        toWhomToRemind = policyService.getNext5DaysPremiumReminders(LocalDate.now()); // You can change this code

        // write code to print the list of users with PolicyName , payment value & date
    }
}





