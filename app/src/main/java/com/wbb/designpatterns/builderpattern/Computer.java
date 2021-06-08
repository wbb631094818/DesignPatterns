package com.wbb.designpatterns.builderpattern;

/**
 *  电脑相关实体类
 */
public class Computer {

    private String cpu; // 必须
    private String ram; // 必须
    private String usbCount; // 可选
    private String keyboard; // 可选
    private String display; // 可选

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.display = builder.display;
        this.keyboard = builder.keyboard;
        this.usbCount = builder.usbCount;
    }


    public static class Builder{
        private String cpu; // 必须
        private String ram; // 必须
        private String usbCount; // 可选
        private String keyboard; // 可选
        private String display; // 可选

        public Builder(String cpu,String ram){
            this.cpu = cpu;
            this.ram =ram;
        }

        public Builder setUsbCount(String usbCount) {
            this.usbCount = usbCount;
            return this;
        }

        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

}
