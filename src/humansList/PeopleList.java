package humansList;

import java.io.*;
import java.util.*;

public class PeopleList {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Human> humans = new ArrayList<>();

    public static void main(String[] args) {
        inputData();
        printList();
        System.out.println("To end the program and record all the output in the console to a file, press ENTER 4 times");
        try {
            System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("lists.txt")), true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printList();

    }

    private static void inputData() {
        String name, surname;
        Human.Gender gender = null;
        int age = 0;
        System.out.println("Enter the first name, last name, age and gender separated by a space (in the same sequence):");
        String data;
        do {
            data = scanner.nextLine();
            String[] parts = data.split("\\s+");
            if (data.isEmpty()) {
                continue;
            }
            if (parts.length < 4) {
                System.out.println("You did not enter all the data, you must enter the last name, first name, age and gender separated by a space");
                continue;
            }

            name = parts[0];
            surname = parts[1];
            if (isDigit(parts[2])) {
                age = Integer.parseInt(parts[2]);
            } else {
                System.out.println("Invalid number format");
                continue;
            }
            if (age <= 0) {
                System.out.println("Age is incorrectly entered. Try again");
                continue;
            }
            if (parts[3].equalsIgnoreCase("M")) {
                gender = gender.MALE;
            } else if (parts[3].equalsIgnoreCase("F")) {
                gender = gender.FEMALE;
            } else {
                System.out.println("Gender entered incorrectly. Enter either M (Male) or F (Female)");
                continue;
            }

            humans.add(new Human(name, surname, age, gender));

        } while (!data.isEmpty());
        saveData();
    }


    private static void saveData() {
        try {
            FileOutputStream fos = new FileOutputStream("data.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(humans.size());
            for (int i = 0; i < humans.size(); i++) {
                oos.writeObject(humans.get(i));
            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Human> readData() {
        try {
            FileInputStream fis = new FileInputStream("data.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();
            ArrayList<Human> savedPeople = new ArrayList<>();

            for (int i = 0; i < count; i++) {
                savedPeople.add((Human) ois.readObject());
            }
            ois.close();
            return savedPeople;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void printList() {
        String input = "c";
        ArrayList<Human> finalList = readData();
        System.out.println("Все списки отсортированы в алфавитном порядке по полю имя.");
        System.out.println("Cписок всех введенных людей:");
        sortByName(finalList); // Всех введенных людей.+
        tapEnter(input);
        filter(finalList); // В фамилии у которых нет буквы "E" и возраст которых не больше 35.+
        tapEnter(input);
        repeatA(finalList, "a");//Имя И Фамилия которых содержит больше двух букв "A", пол - мужской.+
        tapEnter(input);
        sameChar(finalList); // Имя и фамилия которых начинаются с одинаковой буквы. +
        tapEnter(input);
        averageAll(finalList); // Средний возраст всех людей, отдельно всех мужчин, отдельно всех женщин.
        repeatSymbol(finalList); // Наиболее часто встречающуюся букву в имени и фамилии отдельно для всех мужчин и женщин.
    }

    private static void sortByName(ArrayList<Human> humans) {
        humans.sort(Comparator.comparing(Human::getName));
        for (Human h : humans) {
            System.out.println(h.toString());
        }
        System.out.println("\nPress ENTER to display the following list");
    }


    private static void filter(ArrayList<Human> arr) {
        System.out.println("Cписок людей в фамилии у которых нет буквы \"E\" и возраст которых не больше 35.");
        ArrayList<Human> humans = new ArrayList<>(arr);
        ArrayList<Human> toRemove = new ArrayList<>();
        for (int i = 0; i < humans.size(); i++) {
            if ((humans.get(i).getSurname().toUpperCase().contains("E")) || (humans.get(i).getAge() > 35))
                toRemove.add(humans.get(i));
        }
        humans.removeAll(toRemove);

        sortByName(humans);
    }

    private static void sameChar(ArrayList<Human> arr) {
        System.out.println("Список людей Имя и фамилия которых начинаются с одинаковой буквы:");
        ArrayList<Human> humans = new ArrayList<>(arr);
        humans.removeIf(h -> h.getName().charAt(0) != h.getSurname().charAt(0));
        sortByName(humans);
    }

    private static void repeatA(ArrayList<Human> arr, String c) {
        System.out.println("Cписок людей Имя И Фамилия которых содержит больше двух букв \"A\", пол - мужской:");
        int count = 0;
        ArrayList<Human> humans = new ArrayList<>(arr);
        ArrayList<Human> toRemove = new ArrayList<>();
        humans.removeIf(h -> h.getGender() == Human.Gender.FEMALE);
        humans.removeIf(h -> !(h.getName().toLowerCase().contains(c.toLowerCase())) || !(h.getSurname().toLowerCase().contains(c.toLowerCase())));

        for (Human h : humans) {
            char[] s = h.getSurname().toLowerCase().toCharArray();
            char[] n = h.getName().toLowerCase().toCharArray();
            char ch = c.toCharArray()[0];
            for (int i = 0; i < s.length; i++) {
                if (ch == s[i])
                    count++;
            }
            for (int i = 0; i < n.length; i++) {
                if (ch == n[i])
                    count++;
            }


            if (count < 3) {
                toRemove.add(h);
            }
            count = 0;
        }
        humans.removeAll(toRemove);
        sortByName(humans);
    }

    private static void averageAll(ArrayList<Human> arr) {
        int count = 0, sum = 0;
        for (Human h : arr) {
            sum += h.getAge();
            count++;
        }
        double averageAll = (double) sum / count;

        sum = 0;
        count = 0;
        for (Human h : arr) {
            if (h.getGender() == Human.Gender.MALE) {
                sum += h.getAge();
                count++;
            }
        }

        double averageMale = (double) sum / count;
        sum = 0;
        count = 0;

        for (Human h : arr) {
            if (h.getGender() == Human.Gender.FEMALE) {
                sum += h.getAge();
                count++;
            }
        }
        double averageFemale = (double) sum / count;
        System.out.println("Средний возраст всех людей: " + averageAll + "\nСредний возраст всех мужчин: " + averageMale
                + "\nСредний возраст всех женщин: " + averageFemale);
        System.out.println();
    }

    private static void repeatSymbol(ArrayList<Human> arr) {
        StringBuilder stringbuilderM = new StringBuilder();
        StringBuilder stringbuilderF = new StringBuilder();
        for (Human h : arr) {
            if (h.getGender() == Human.Gender.MALE) {
                stringbuilderM.append(h.getName());
                stringbuilderM.append(h.getSurname());
            } else if (h.getGender() == Human.Gender.FEMALE) {
                stringbuilderF.append(h.getName());
                stringbuilderF.append(h.getSurname());
            }
        }


        String lineM = new String(stringbuilderM);
        String lineF = new String(stringbuilderF);

        Map<Character, Integer> entriesM = new HashMap<>();

        for (char c : lineM.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!entriesM.containsKey(c))
                    entriesM.put(c, 1);
                else
                    entriesM.put(c, entriesM.get(c) + 1);
            }
        }

        int count = 0;
        int maxM = (Collections.max(entriesM.values()));

        System.out.print("Наиболее часто встречающаяся буква в имени и фамилии всех мужчин: ");
        for (Map.Entry<Character, Integer> entry : entriesM.entrySet()) {
            if (entry.getValue() == maxM) {
                count++;
                System.out.println(entry.getKey() + "; ") ;
                if (count > 1)
                    System.out.print("\nЭти буквы встречались в имени и фамилии одинаковое количество раз");
            }
        }
        System.out.println();

        Map<Character, Integer> entriesF = new HashMap<>();

        for (char c : lineF.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!entriesF.containsKey(c))
                    entriesF.put(c, 1);
                else
                    entriesF.put(c, entriesF.get(c) + 1);
            }
        }

        count = 0;
        int maxF = (Collections.max(entriesF.values()));
        System.out.print("Наиболее часто встречающаяся буква в имени и фамилии всех женщин: ");
        for (Map.Entry<Character, Integer> entry : entriesF.entrySet()) {
            if (entry.getValue() == maxF) {
                count++;
                System.out.print(entry.getKey() + "; ");
                if (count > 1)
                    System.out.println("\nЭти буквы встречались в имени и фамилии одинаковое количество раз");
            }
        }
        System.out.println();
    }

    private static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static void tapEnter(String input) {
        do {
            input = scanner.nextLine();
        } while (!input.trim().isEmpty());
    }
}
