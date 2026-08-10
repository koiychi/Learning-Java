public interface FeaturedAct extends Performable, Maintainable {
    String getBillingName();

    @Override
    boolean needsStage();
}
