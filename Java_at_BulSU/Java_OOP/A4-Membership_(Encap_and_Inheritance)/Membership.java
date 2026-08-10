//TODO: encap, two constructors, getStatusReport(), 
// PremiumMembership (adding int perksIncluded, not neg)

public class Membership {
    private String memberName;
    private String memberId;
    private double monthlyFee;

    //Constructors
    public Membership() {
        this("New Member", "MemberID", 2500);
    }

    public Membership(String memberName, String memberId, double monthlyFee) {
        this.memberName = memberName;
        this.memberId = memberId;
        setMonthlyFee(monthlyFee);
    }

    

    //Getter for memberName and memberID
    public String getMemberName() {
        return memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }


    //Validated setter for monthlyFee
    public void setMonthlyFee(double monthlyFee){
        if (monthlyFee <= 0) {
            throw new IllegalArgumentException("INVALID: Monthly fee cannot be zero or negative.");
        }

        this.monthlyFee = monthlyFee;
    }

    public String getStatusReport() {
        return getMemberName() + " | " + getMemberId() + " | PHP "+ getMonthlyFee();

    }


} //end of Membership class
