public class DiscountRate {
    private static final double SERVICE_DISCOUNT_PREMIUM = 0.2;
    private static final double SERVICE_DISCOUNT_GOLD = 0.15;
    private static final double SERVICE_DISCOUNT_SILVER = 0.1;
    private static final double PRODUCT_DISCOUNT_PREMIUM = 0.1;
    private static final double PRODUCT_DISCOUNT_GOLD = 0.1;
    private static final double PRODUCT_DISCOUNT_SILVER = 0.1;

    public static double getServiceDiscountRate(String type) {
        if (type.equals("Premium")) {
            return SERVICE_DISCOUNT_PREMIUM;
        } else if (type.equals("Gold")) {
            return SERVICE_DISCOUNT_GOLD;
        } else if (type.equals("Silver")) {
            return SERVICE_DISCOUNT_SILVER;
        } else {
            return 0.0;
        }
    }

    public static double getProductDiscountRate(String type) {
        if (type.equals("Premium")) {
            return PRODUCT_DISCOUNT_PREMIUM;
        } else if (type.equals("Gold")) {
            return PRODUCT_DISCOUNT_GOLD;
        } else if (type.equals("Silver")) {
            return PRODUCT_DISCOUNT_SILVER;
        } else {
            return 0.0;
        }
    }
}
