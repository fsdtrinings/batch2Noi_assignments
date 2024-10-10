package Day1;

public class Main {
    public static void main(String[] args) {
        IssuanceId id = new IssuanceId();
        id.randomNumber();
        PolicyName pol = new PolicyName();
        pol.policy(31, 'm');
        OwnerName name = new OwnerName();
        name.nameOfUser("Ramesh Kumar");
        SumAssured Assured = new SumAssured();
        Assured.sum(500000);
        BasePremium base = new BasePremium();
        System.out.println("premium amount: ");
        base.premium(31, 'm');
    }
}