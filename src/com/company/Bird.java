package com.company;

public class Bird extends Animal{
    private String featherColorShava56415;



    public Bird(){
       super();
       featherColorShava56415="NN";

    }

    public Bird (String nameShava56415, int ageShava56415, int weightShava56415, String featherColorShava56415){
        super(nameShava56415, ageShava56415, weightShava56415);
        this.featherColorShava56415=featherColorShava56415;
    }

    public Bird(int ageShava56415 , String featherColorShava56415){
        super(ageShava56415);
        this.featherColorShava56415=featherColorShava56415;
    }

    public void takingFlightShava56415(){
        System.out.println("Flap flap");
    }

    @Override
    public void getVoiceShava56415() {
        System.out.println("Bird is making sounds");
    }

    @Override
    public void eatShava56415(String FoodName) {
        System.out.println("Bird is eating: " + FoodName);
    }

    public String getFeatherColorShava56415() {
        return featherColorShava56415;
    }

    public void setFeatherColorShava56415(String featherColorShava56415) {
        this.featherColorShava56415 = featherColorShava56415;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColorShava56415='" + featherColorShava56415 + '\'' +
                '}';
    }
}
