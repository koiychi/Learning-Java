public class PremiumMembership extends Membership {

    private int perksIncluded;

    public void setPerksIncluded() {
        if (perksIncluded < 0) {
            throw new IllegalArgumentException("INVALID: Perks Included cannot be negative.");
        }
        this.perksIncluded = 1;
    }

    public int getPerksIncluded() {
        return perksIncluded;
    }

    public PremiumMembership() {
        this("New Premium Member", "New Pro ID", 2500, 1);
    }

    public PremiumMembership(String memberName, String memberId, double monthlyFee, int perksIncluded) {
        super(memberName, memberId, monthlyFee);
        setPerksIncluded();
    }

    @Override
    public String getStatusReport() {
        return super.getStatusReport() + " | " + getPerksIncluded();

    }
    
}
