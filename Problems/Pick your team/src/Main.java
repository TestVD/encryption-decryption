import java.util.Scanner;

class SelectionContext {

    private PersonSelectionAlgorithm algorithm;

    public SelectionContext(PersonSelectionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void setAlgorithm(PersonSelectionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public Person[] selectPersons(Person[] persons) {
        return this.algorithm.select(persons);
    }
}

interface PersonSelectionAlgorithm {

    Person[] select(Person[] persons);
}

class TakePersonsWithStepAlgorithm implements PersonSelectionAlgorithm {

    private int step;

    public TakePersonsWithStepAlgorithm(int step) {
        this.step = step;
    }

    @Override
    public Person[] select(Person[] persons) {
        if (this.step == 1) {
            return persons;
        } else {
            Person[] newPersons = new Person[persons.length % step == 0 ? persons.length / step : persons.length / step + 1];
            newPersons[0] = persons[0];
            for (int i = 1; i < persons.length; i++) {
                if (i % step == 0) {
                    newPersons[i / step] = persons[i];
                }
            }
            return newPersons;
        }
    }
}

    class TakeLastPersonsAlgorithm implements PersonSelectionAlgorithm {
        private int count;

        public TakeLastPersonsAlgorithm(int count) {
            this.count = count;
        }

        @Override
        public Person[] select(Person[] persons) {
                Person[] newPersons = new Person[count];
                if (this.count == 1) {
                    newPersons[0] = persons[persons.length - 1];
                    return newPersons;
                } else {
                    for (int i = persons.length - count, index = 0; i < persons.length; i++, index++) {
                            newPersons[index] = persons[i];
                    }
                }
                return newPersons;
        }
    }

    class Person {

        String name;

        public Person(String name) {
            this.name = name;
        }
    }

    /* Do not change code below */
    public class Main {

        public static void main(String[] args) {
            final Scanner scanner = new Scanner(System.in);

            final int count = Integer.parseInt(scanner.nextLine());
            final Person[] persons = new Person[count];

            for (int i = 0; i < count; i++) {
                persons[i] = new Person(scanner.nextLine());
            }

            final String[] configs = scanner.nextLine().split("\\s+");

            final PersonSelectionAlgorithm alg = create(configs[0], Integer.parseInt(configs[1]));
            SelectionContext ctx = new SelectionContext(alg);
            ctx.setAlgorithm(alg);

            final Person[] selected = ctx.selectPersons(persons);
            for (Person p : selected) {
                System.out.println(p.name);
            }
        }

        public static PersonSelectionAlgorithm create(String algType, int param) {
            switch (algType) {
                case "STEP": {
                    return new TakePersonsWithStepAlgorithm(param);
                }
                case "LAST": {
                    return new TakeLastPersonsAlgorithm(param);
                }
                default: {
                    throw new IllegalArgumentException("Unknown algorithm type " + algType);
                }
            }
        }
    }