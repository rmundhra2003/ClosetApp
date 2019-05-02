package com.company;

public class Jacket {
        private int size;
        private String color;
        private String material;
        private String sleeveType;

        public Jacket(int size, String color, String material, String sleeveType) {
            this.size = size;
            this.color = color;
            this.material = material;
            this.sleeveType = sleeveType;
        }

        public Jacket() {

        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getSleeveType() {
            return sleeveType;
        }

        public void setSleeveType(String sleeveType) {
            this.sleeveType = sleeveType;
        }
    }

