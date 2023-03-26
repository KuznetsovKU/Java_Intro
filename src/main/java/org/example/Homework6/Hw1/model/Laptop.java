package org.example.Homework6.Hw1.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Laptop {
    private String laptopType;
    private Integer ramSize;
    private String memoryType;
    private Integer memorySize;
    private Integer screenSize;
    private String osType;
    private String bodyMaterial;
    private String color;

    public Laptop(String laptopType, Integer ramSize, String memoryType, Integer memorySize, Integer screenSize, String osType, String bodyMaterial, String color) {
        this.laptopType = laptopType;
        this.ramSize = ramSize;
        this.memoryType = memoryType;
        this.memorySize = memorySize;
        this.screenSize = screenSize;
        this.osType = osType;
        this.bodyMaterial = bodyMaterial;
        this.color = color;
    }

    public Laptop() {
    }


    public String getLaptopType() {
        return laptopType;
    }

    public void setLaptopType(String laptopType) {
        this.laptopType = laptopType;
    }

    public Integer getRamSize() {
        return ramSize;
    }

    public void setRamSize(Integer ramSize) {
        this.ramSize = ramSize;
    }

    public String getMemoryType() {
        return memoryType;
    }

    public void setMemoryType(String memoryType) {
        this.memoryType = memoryType;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Integer screenSize) {
        this.screenSize = screenSize;
    }

    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        this.bodyMaterial = bodyMaterial;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopType='" + laptopType + '\'' +
                ", ramSize=" + ramSize + " Gb " +
                ", memoryType='" + memoryType + '\'' +
                ", memorySize=" + memorySize + " Gb " +
                ", screenSize=" + screenSize + " inches " +
                ", osType='" + osType + '\'' +
                ", bodyMaterial='" + bodyMaterial + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


    /**
     * Метод генерации псевдо-случайного ноутбука
     *
     * @return - экземпляр класса Laptop, сгенерированный псевдо-случайным образом
     */
    public Laptop generateRandomLaptop() {
        List<String> laptopTypes = new ArrayList<>(Arrays.asList("MacBook", "Classic Laptop", "Ultrabook", "Transformer"));
        List<Integer> ramSizes = new ArrayList<>(Arrays.asList(4, 6, 8, 12, 16, 24, 32));
        List<String> memoryTypes = new ArrayList<>(Arrays.asList("HDD", "SDD"));
        List<Integer> memorySizes = new ArrayList<>(Arrays.asList(128, 256, 512, 1024, 2048));
        List<Integer> screenSizes = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        List<String> osTypes = new ArrayList<>(Arrays.asList("Windows", "Linux", "DOS", "noOS"));
        List<String> bodyMaterials = new ArrayList<>(Arrays.asList("Plastic", "Metal", "Combined"));
        List<String> colors = new ArrayList<>(Arrays.asList("Steel", "Black", "Silver", "White", "Brown", "Blue", "Red"));
        Random rand = new Random();
        String randLaptopType = laptopTypes.get(rand.nextInt(laptopTypes.size()));
        Integer randRAMSize = ramSizes.get(rand.nextInt(ramSizes.size()));
        String randMemoryType = memoryTypes.get(rand.nextInt(memoryTypes.size()));
        Integer randMemorySize = memorySizes.get(rand.nextInt(memorySizes.size()));
        Integer randScreenSize = screenSizes.get(rand.nextInt(screenSizes.size()));
        String randOSType;
        if (randLaptopType.equals("MacBook")) {
            randOSType = "MacOS";
        } else {
            randOSType = osTypes.get(rand.nextInt(osTypes.size()));
        }
        String randBodyMaterial;
        if (randLaptopType.equals("MacBook")) {
            randBodyMaterial = "Steel";
        } else {
            randBodyMaterial = bodyMaterials.get(rand.nextInt(bodyMaterials.size()));
        }
        String randColor = colors.get(rand.nextInt(colors.size()));
        return new Laptop(randLaptopType, randRAMSize, randMemoryType, randMemorySize, randScreenSize, randOSType, randBodyMaterial, randColor);
    }
}
