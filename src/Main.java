public class Main {
    public static void main(String[] args) {
        PetrolStation petrolStation = new PetrolStation(1_000);
        petrolStation.doRefuel(300);
        petrolStation.doRefuel(400);
        petrolStation.doRefuel(100);
        petrolStation.doRefuel(190);
        petrolStation.doRefuel(20);

        ThreadSafeList threadSafeList = new ThreadSafeList();
        threadSafeList.add("test");
        threadSafeList.add("test1");
        threadSafeList.add("test2");
        threadSafeList.add("test3");
        threadSafeList.add("test4");
        System.out.println();
        threadSafeList.get(0);
        threadSafeList.get(2);
        threadSafeList.get(4);
        threadSafeList.remove(1);
    }
}
