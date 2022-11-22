package Lampe;

import java.util.ArrayList;
import java.util.List;

public class Lampe {
        private String name;
        private List<Glühelement> lightElements;

        public Lampe(String name) {
            this.name = name;
            this.lightElements = new ArrayList();
        }

        public void turnAllOn() {
            for(int i = 0; i < this.lightElements.size(); ++i) {
                System.out.println(((Glühelement)this.lightElements.get(i)).turnOn());
            }

            System.out.println("Process accomplished");
        }

        public Double getOverallPowerConsumption() {
            double sum = 0.0;

            for(int i = 0; i < this.lightElements.size(); ++i) {
                sum += ((Glühelement)this.lightElements.get(i)).getPowerConsumption();
            }

            return sum;
        }

        public void getNamesOfLightElements() {
            for(int i = 0; i < this.lightElements.size(); ++i) {
                System.out.println(((Glühelement)this.lightElements.get(i)).getName());
            }

        }

        public List<Glühelement> getLightElements() {
            return this.lightElements;
        }

        public void addLightElements(Glühelement lightElement) {
            this.lightElements.add(lightElement);
        }
    }

