package com.o8k.academy.cleanarch;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Computer {
    private String cpu;
    private int cpuCores;
    private String ram;
    private String videoCard;
    private int usbPorts;
    private String hd;
    private boolean isOn;
}