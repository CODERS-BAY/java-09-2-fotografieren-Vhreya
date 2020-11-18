public class   Lens {
    private int minFocalLength;
    private int maxFocalLength;
    private static int COUNTERLENSES = 0;

    public Lens(int minFocalLength, int maxFocalLength) throws Exception {
        if (maxFocalLength <= minFocalLength) {
            throw new RuntimeException("invalid value");
        }
        this.minFocalLength = minFocalLength;
        this.maxFocalLength = maxFocalLength;
        COUNTERLENSES++;
    }

    public static int getCOUNTERLENSES(){
        return COUNTERLENSES;
    }

    public int getMinFocalLength() {
        return minFocalLength;
    }

    public void setMinFocalLength(int minFocalLength) {
        this.minFocalLength = minFocalLength;
    }

    public int getMaxFocalLength() {
        return maxFocalLength;
    }

    public void setMaxFocalLength(int maxFocalLength) {
        if (maxFocalLength <= minFocalLength) {
            throw new RuntimeException("invalid value");
        }
        this.maxFocalLength = maxFocalLength;
    }

    @Override
    public String toString() {
        return "Lens{}";
    }
}
