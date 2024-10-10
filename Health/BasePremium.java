package Day1;

public class BasePremium {
    public void premium(int age, char gender) {
        double SumAssured = 500000;
        if ((age >= 31 && age <= 50) && (gender == 'm' || gender == 'M')) {
            int BasePremium = 8000;
            System.out.println("Base premium: " + BasePremium);
            int x = age - 30;
            double surcharge = (SumAssured * 0.007) * x;
            System.out.println("Sucharge :" + surcharge);
            double total = BasePremium + surcharge;
            System.out.println("Total Premium: " + total);
        } else if ((age >= 50 && age <= 70) && (gender == 'm' || gender == 'M')) {
            int BasePremium = 15000;
            System.out.println("Base premium:" + BasePremium);
            int x = age - 30;
            double surcharge = (SumAssured * 0.0010) * x;
            System.out.println("Sucharge :" + surcharge);
            double total = BasePremium + surcharge;
            System.out.println("Total Premium: " + total);
        }
        if ((age >= 31 && age <= 50) && (gender == 'f' || gender == 'F')) {
            int BasePremium = 10000;
            System.out.println("Base premium: " + BasePremium);
            int x = age - 30;
            double surcharge = (SumAssured * 0.007) * x;
            System.out.println("Sucharge :" + surcharge);
            double total = BasePremium + surcharge;
            System.out.println("Total Premium: " + total);
        } else if ((age >= 50 && age <= 70) && (gender == 'f' || gender == 'F')) {
            int BasePremium = 20000;
            System.out.println("Base premium: " + BasePremium);
            int x = age - 30;
            double surcharge = (SumAssured * 0.0010) * x;
            System.out.println("Sucharge :" + surcharge);
            double total = BasePremium + surcharge;
            System.out.println("Total Premium: " + total);
        }
    }
}
