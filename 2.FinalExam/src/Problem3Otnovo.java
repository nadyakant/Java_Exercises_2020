import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class Problem3Otnovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<String, Integer> peopleHealth = new HashMap<>();
        Map<String, Integer> peopleEnergy = new HashMap<>();
        //int countDelete=0;
        int countAlive = 0;
        while (!text.equals("Results")) {
            String[] tokens = text.split(":");
            String command = tokens[0];
            if (command.equals("Add")) {
                String name = tokens[1];
                int health = Integer.parseInt(tokens[2]);
                int energy = Integer.parseInt(tokens[3]);
                if (!peopleHealth.containsKey(name)) {
                    peopleHealth.put(name, health);
                    peopleEnergy.put(name, energy);
                } else {
                    int increase = peopleHealth.get(name);
                    peopleHealth.replace(name, increase + health);
                }
                countAlive++;
            } else if (command.equals("Attack")) {
                String attackerName = tokens[1];
                String defenderName = tokens[2];
                int damage = Integer.parseInt(tokens[3]);
                if (peopleHealth.containsKey(attackerName) && peopleHealth.containsKey(defenderName)) {
                    int defHealthNew = peopleHealth.get(defenderName);
                    int attackNew = peopleEnergy.get(attackerName);
                    peopleHealth.replace(defenderName, defHealthNew - damage);
                    peopleEnergy.replace(attackerName, attackNew - 1);

                    if ((defHealthNew - damage) <= 0) {
                        countAlive--;

                        peopleHealth.remove(defenderName);
                        peopleEnergy.remove(defenderName);
                        System.out.printf("%s was disqualified!%n", defenderName);
                    }
                    if ((attackNew - 1) <= 0) {
                        countAlive--;

                        peopleEnergy.remove(attackerName);
                        peopleHealth.remove(attackerName);
                        //peopleHealth.clear();
                        //peopleEnergy.clear();
                        System.out.printf("%s was disqualified!%n", attackerName);
                    }
                }
            } else if (command.equals("Delete")) {
                String name = tokens[1];
                if (name.equals("All")) {
                    peopleHealth.clear();
                    peopleEnergy.clear();
                    countAlive = 0;

                    peopleEnergy.remove(peopleEnergy);
                    peopleHealth.remove(peopleHealth);
                } else {
                    //countDelete++;
                    countAlive--;
                    peopleEnergy.remove(name);
                    peopleHealth.remove(name);
                }

            }
            text = scanner.nextLine();
        }
        System.out.printf("People count: %d%n", countAlive);
        peopleEnergy.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(entry -> {
                    String name = entry.getKey();
                    int energy = peopleEnergy.get(name);
                    int health = peopleHealth.get(name);
                    System.out.printf("%s - %d - %d%n", name, health, energy);
                });
        // peopleEnergy.entrySet().stream().sorted(Collections.reverseOrder(comparingByValue()))
        //  .forEach(entry->{
        // String name=entry.getKey();
        //  int energy=peopleEnergy.get(name);
        //  int health=peopleHealth.get(name);
        //System.out.printf("%s - %d - %d%n",name,health,energy);
        //});
    }
}

