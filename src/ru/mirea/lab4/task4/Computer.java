package ru.mirea.lab4.task4;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(Processor processor, Memory memory, Monitor monitor) {
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    public String Print_Computer_info(){
        return "Компоненты компьютера:\n процессор " + processor.toString() + " с частотой(МГЦ): " + processor.getSpeed() + "; количеством ядер: " + processor.getCores_num() +
                "\n память " + memory.toString() + " с объемом(ГБ): " + memory.getCapacity() + "; частотой(МГЦ): " + memory.getSpeed() +
                "\n монитор " + monitor.toString() + " с диагональю(дюйм): " + monitor.getSize() + "; типом матрицы: " + monitor.getMatrix();
    }
}
