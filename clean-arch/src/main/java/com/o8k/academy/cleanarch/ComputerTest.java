package com.o8k.academy.cleanarch;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpu("I9");
        computer.setCpuCores(4);
        computer.setRam("4gb");
        computer.setVideoCard("IntelGraphics");
        computer.setUsbPorts(4);
        computer.setHd("128 Sata");
        computer.setOn(true);

        System.out.println(computer);
        System.out.println(computer.hashCode());

        var computerB = new Computer(
                "I7",
                8,
                "16gb",
                "Gforce 650",
                4,
                "256GB",
                false);

        System.out.println(computerB);
        System.out.println(computerB.hashCode());

        var computerC = Computer.builder()
                .cpu("I7")
                .cpuCores(8)
                .ram("16gb")
                .videoCard("Randeon 650")
                .usbPorts(4)
                .hd("500GB")
                .isOn(false)
                .build();
    }
}