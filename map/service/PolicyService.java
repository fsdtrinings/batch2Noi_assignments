package com.edu.map.service;

import com.edu.map.entity.Policy;
import com.edu.map.entity.User;

import java.time.LocalDate;
import java.util.*;

public class PolicyService {

    Map<String,List<Policy>> allPolicies = new HashMap();
    // contains all the policies available to sell in the system
    /*Key : Policy Category like MedicalPolicy, Car Policy , Bike Policy , PensionPolicy , FamilyInsurance etc*/
    /*Value List<Policy> : company has various policies under one category like multiple medical policies , multiple car policies*/

    Map<LocalDate, List<User>> premiumReminder = new HashMap();
    /*Once the User purchase the policy , user details & premium date should be added in the map
    * Key : LocalDate : which is the policy sell date
    * Value : List<User> : add user in the list
    * */

    PolicyService()
    {
        // code to set the policies inside allPolicies
    }
    // getter & setter of allPolicies

    public List<User> getTodayPremiumReminders(LocalDate today)
    {
        return null;
    }
    public List<User> getNext5DaysPremiumReminders(LocalDate today)
    {
        return null;
    }

    // Developer can change the ? in return type
    public Set<?> getSortedReportBasedOnCity()
    {
        /* generate report based on the policy sold city wise in assending order of city Count*/
        /* Report Should looks like
        *  City Name    Count_PolicySold
        *   Delhi          160
        *   Kolkata        155
        *   Banglore        90
        * */
        return null;
    }

}
