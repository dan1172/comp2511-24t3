package trains;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Wagon> cars = new ArrayList<>();

    public Train(List<Wagon> cars) {
        this.cars = cars;
    }

    public void printCars() {
        for (Wagon wagon : cars) {
            System.out.println(wagon.getType());
        }
    }

    public static class TrainBuilder {
        private int powerLeft = 0;
        private List<Wagon> cars = new ArrayList<>();

        public TrainBuilder addPassengerWagon() {
            return addWagon(new PassengerWagon());
        }

        public TrainBuilder addCargoWagon() {
            return addWagon(new CargoWagon());
        }

        public TrainBuilder addHighPoweredEngine() {
            return addWagon(new Engine(2000));
        }

        public TrainBuilder addNormalEngine() {
            return addWagon(new Engine(1000));
        }

        private TrainBuilder addWagon(Wagon wagon) {
            powerLeft += wagon.getPowerDelta();
            if (powerLeft < 0) {
                throw new IllegalStateException("Power cannot be less than 0 at any point");
            }
            cars.add(wagon);
            return this;
        }

        public Train build() {
            return new Train(cars);
        }

    }

    public static void main(String[] args) {
        Train train = new TrainBuilder()
                .addNormalEngine()
                .addPassengerWagon()
                .addCargoWagon()
                .build();
        train.printCars();
    }
}
