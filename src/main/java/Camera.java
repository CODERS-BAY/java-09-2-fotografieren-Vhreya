public class Camera {

    private String brand;
    private double megaPixels;
    private int displaySizeInPixels;
    private boolean colored;
    private Lens lens;
    static int COUNTER = 0;

    public Camera(String brand, double megaPixels, int displaySize, boolean colored, Lens lens) {
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.displaySizeInPixels = displaySize;
        this.colored = colored;
        this.lens = lens;
        COUNTER++;
    }

    public static int getCOUNTER() {
        return COUNTER;
    }

    public static void setCOUNTER(int COUNTER) {
        Camera.COUNTER = COUNTER;
    }

    public boolean isColored() {
        return colored;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(double megaPixels) {
        this.megaPixels = megaPixels;
    }

    public int getDisplaySizeInPixels() {
        return displaySizeInPixels;
    }

    public void setDisplaySizeInPixels(int displaySizeInPixels) {
        this.displaySizeInPixels = displaySizeInPixels;
    }

    public void setColored(boolean colored) {
        this.colored = colored;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", megaPixels=" + megaPixels +
                ", displaySize=" + displaySizeInPixels +
                ", colored=" + colored +
                ", lens=" + lens +
                '}';
    }
}
