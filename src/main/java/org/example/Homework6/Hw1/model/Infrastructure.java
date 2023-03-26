package org.example.Homework6.Hw1.model;

import java.util.*;

public class Infrastructure {

    /**
     * Метод, генерирующий список рандомных экземпляров класса Laptop
     *
     * @param amount - необходимое количество элементов списка
     * @return - список рандомных экземпляров класса Laptop
     */
    public static List<Laptop> makeLaptopList(int amount) {
        List<Laptop> laptopList = new ArrayList<>();
        while (amount > 0) {
            Laptop laptop = new Laptop().generateRandomLaptop();
            laptopList.add(laptop);
            amount--;
        }
        return laptopList;
    }

    /**
     * Метод, выводящий в консоль список экземпляров, разделенный построчно
     *
     * @param listToPrint - список, который необходимо вывести в консоль
     */
    public static void printStorage(List<Laptop> listToPrint) {
        System.out.println("There are following laptops for you:");
        for (Laptop el : listToPrint) {
            System.out.println(el);
        }
    }

    /**
     * Метод, фиксирующий клиентские фильтры
     *
     * @return - Map из клиентских фильтров
     */
    public static Map<String, Integer> getClientChoice() {
        Map<String, Integer> clientChoice = new LinkedHashMap<>();
        System.out.println("Please make your choice");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose laptop type: (1 = MacBook, 2 = Classic Laptop, 3 = Ultrabook, 4 = Transformer, 0 = Skip choice)");
        clientChoice.put("laptopType", clientChoice.getOrDefault("laptopType", 0) + scanner.nextInt());
        System.out.println("Enter minimal value of RAM Size (0 = Skip choice)");
        clientChoice.put("ramSize", clientChoice.getOrDefault("ramSize", 0) + scanner.nextInt());
        System.out.println("Chose Memory Type: (1 = HDD, 2 = SDD, 0 = Skip choice)");
        clientChoice.put("memoryType", clientChoice.getOrDefault("memoryType", 0) + scanner.nextInt());
        System.out.println("Enter minimal value of Memory Size (0 = Skip choice)");
        clientChoice.put("memorySize", clientChoice.getOrDefault("memorySize", 0) + scanner.nextInt());
        System.out.println("Enter minimal value of Screen Size (0 = Skip choice)");
        clientChoice.put("screenSize", clientChoice.getOrDefault("screenSize", 0) + scanner.nextInt());
        System.out.println("Chose Operation System: (1 = MacOS, 2 = Windows, 3 = Linux, 4 = DOS, 5 = noOS, 0 = Skip choice)");
        clientChoice.put("osType", clientChoice.getOrDefault("osType", 0) + scanner.nextInt());
        System.out.println("Chose Body Material: (1 = Plastic, 2 = Metal, 3 = Combined, 0 = Skip choice)");
        clientChoice.put("bodyMaterial", clientChoice.getOrDefault("bodyMaterial", 0) + scanner.nextInt());
        System.out.println("Chose color: (1 = Steel, 2 = Black, 3 = Silver, 4 = White, 5 = Brown, 6 = Blue, 7 = Red, 0 = Skip choice)");
        clientChoice.put("color", clientChoice.getOrDefault("color", 0) + scanner.nextInt());
        return clientChoice;
    }

    /**
     * Метод, генерирующий экземпляр класса Laptop по фильтрам клиента
     *
     * @param parameters - набор фильтров для генерации соответствующего экземпляра
     * @return - экземпляр класса Laptop, соответствующий клиентским фильтрам
     */
    public static Laptop getBenchmark(Map<String, Integer> parameters) {
        List<String> laptopTypes = new ArrayList<>(Arrays.asList("any", "MacBook", "Classic Laptop", "Ultrabook", "Transformer"));
        List<String> memoryTypes = new ArrayList<>(Arrays.asList("any", "HDD", "SDD"));
        List<String> osTypes = new ArrayList<>(Arrays.asList("any", "Windows", "Linux", "DOS", "noOS"));
        List<String> bodyMaterials = new ArrayList<>(Arrays.asList("any", "Plastic", "Metal", "Combined"));
        List<String> colors = new ArrayList<>(Arrays.asList("any", "Steel", "Black", "Silver", "White", "Brown", "Blue", "Red"));
        Laptop searchedLaptop = new Laptop();
        searchedLaptop.setLaptopType(laptopTypes.get(parameters.get("laptopType")));
        searchedLaptop.setRamSize(parameters.get("ramSize"));
        searchedLaptop.setMemoryType(memoryTypes.get(parameters.get("memoryType")));
        searchedLaptop.setMemorySize(parameters.get("memorySize"));
        searchedLaptop.setScreenSize(parameters.get("screenSize"));
        searchedLaptop.setOsType(osTypes.get(parameters.get("osType")));
        searchedLaptop.setBodyMaterial(bodyMaterials.get(parameters.get("bodyMaterial")));
        searchedLaptop.setColor(colors.get(parameters.get("color")));
        return searchedLaptop;
    }

    /**
     * Метод фильтрации списка ноутбуков на основе параметров, указываемых клиентом
     *
     * @param storage - общий список ноутбуков
     * @param pattern - экземпляр класса Laptop, соответствующий клиентским фильтрам
     * @return - новый список ноутбуков, удовлетворяющий запросам клиента
     */
    public static List<Laptop> getFilteredList(List<Laptop> storage, Laptop pattern) {
        List<Laptop> filteredList = new LinkedList<>();
        for (Laptop laptop : storage) {
            if (laptop.getLaptopType().equals(pattern.getLaptopType()) || pattern.getLaptopType().equals("any")) {
                if (laptop.getRamSize() >= pattern.getRamSize()) {
                    if (laptop.getMemoryType().equals(pattern.getMemoryType()) || pattern.getMemoryType().equals("any")) {
                        if (laptop.getMemorySize() >= pattern.getMemorySize()) {
                            if (laptop.getScreenSize() >= pattern.getScreenSize()) {
                                if (laptop.getOsType().equals(pattern.getOsType()) || pattern.getOsType().equals("any")) {
                                    if (laptop.getBodyMaterial().equals(pattern.getBodyMaterial()) || pattern.getBodyMaterial().equals("any")) {
                                        if (laptop.getColor().equals(pattern.getColor()) || pattern.getColor().equals("any")) {
                                            filteredList.add(laptop);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        if (filteredList.isEmpty()) {
            filteredList.add(new Laptop());
        }
        return filteredList;
    }

}
