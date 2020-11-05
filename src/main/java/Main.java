public class Main {

    public static void main(String[] args) throws Exception {

        Lens lens1 = new Lens(32, 35);
        Lens lens2 = new Lens(31, 32);

        Camera camera1 = new Camera("nikon", 24.2, 1037000, true, lens1);
        Camera camera2 = new Camera("blubb", 32.1, 900000,false, lens1);
        
        camera1.setLens(lens2);

        System.out.println(camera1);
        System.out.println("How many lenses do we have: " + Lens.getCOUNTERLENSES());
        System.out.println("How many cameras do we have: " + Camera.getCOUNTER());
    }

}
