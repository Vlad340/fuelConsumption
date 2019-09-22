public class Main {
    /**
     * fuelConsumption - fuel consumption per 100 km
     * fuelVolume - current fuel tank, l
     */
    public static void main(String[] args) {
        int fuelConsumption = 8;
        int fuelVolume = 30;
        int distance = fuelVolume*100/fuelConsumption;
        System.out.println(distance);
    }
}
