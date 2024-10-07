package Day1;

public class PolicyName {
    public void policy(int age, char gender) {
        if ((age >= 31 && age <= 50) && (gender == 'm' || gender == 'M')) {
            System.out.println("Policy Name : Policy-M1");
            System.out.println("Age:" + age + " Gender:" + gender);
        } else if ((age >= 50 && age <= 70) && (gender == 'm' || gender == 'M')) {
            System.out.println("Policy Name : Policy-M2");
            System.out.println("Age:" + age + " Gender:" + gender);
        } else if ((age >= 31 && age <= 50) && (gender == 'f' || gender == 'F')) {
            System.out.println("Policy Name : Policy-F1");
            System.out.println("Age:" + age + " Gender:" + gender);
        } else if ((age >= 50 && age <= 70) && (gender == 'f' || gender == 'F')) {
            System.out.println("Policy Name : Policy-F2");
            System.out.println("Age:" + age + " Gender:" + gender);
        } else {
            System.out.println("Policy Name : invalid input");
            System.out.println("Age:" + age + " Gender:" + gender);
        }
    }
}
