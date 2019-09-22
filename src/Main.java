public class Main {
    /**
     * fuelConsumption - расход топлива на 100 км
     * fuelVolume - текущий объем топлива в бензобаке, л
     */
    public static void main(String[] args) {
        int fuelConsumption = 8;
        int fuelVolume = 30;
        int distance = fuelVolume*100/fuelConsumption;
        System.out.println(distance);
    }
}
