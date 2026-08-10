public class MembershipTester {
    public static void main (String[] koiychi) {

        // Using default constructors
        System.out.println("Membership using default constructors: ");
        Membership member1 = new Membership();
        System.out.println(member1.getMemberName() + " | " + member1.getMemberId() + " | PHP" + member1.getMonthlyFee());
        System.out.println();

        // Using parameterized constructors
        System.out.println("Membership using parameterized constructors: ");
        Membership member2 = new Membership("Miles Rodriguez", "REG-00001", 0);
        System.out.println(member2.getMemberName() + " | " + member2.getMemberId() + " | PHP " + member2.getMonthlyFee());
        System.out.println();

        // Subclass instance through default constructor
        System.out.println("Subclass instance through default constructors: ");
        PremiumMembership proMember1 = new PremiumMembership();
        System.out.println(proMember1.getMemberName() + " | " + proMember1.getMemberId() + " | PHP " + proMember1.getMonthlyFee()+ " | " + proMember1.getPerksIncluded());
        System.out.println();

        // Subclass instance through parameterized constructor
        System.out.println("Subclass instance through parameterized constructors: ");
        PremiumMembership proMember2 = new PremiumMembership("Koi Rodriguez", "PRO-003987", 5000, 1);
        System.out.println(proMember2.getMemberName() + " | " + proMember2.getMemberId() + " | PHP " + proMember2.getMonthlyFee() + " | " + proMember2.getPerksIncluded());


        //OVERRIDE DEMO

        //Override demo: Superclass
        System.out.println();
        System.out.println("Override demo: Superclass");
        System.out.println(proMember2.getStatusReport());

    }
}
