package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


    private Boolean extraCheese = false;
    private Boolean toppings = false;
    private Boolean takeAway = false;
    private Boolean isBill = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) {
            this.price += 300;
            this.bill = "Base Price Of The Pizza: 300\n";
        } else{
            this.price = 400;
            this.bill = "Base Price Of The Pizza: 400\n";
        }
        // your code goes here
    }

    public Pizza() {
        this.isVeg = true;
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extraCheese) {
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";

            extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings) {
            if (isVeg) {
                this.price += 70;
                this.bill += "Extra Toppings Added: 70\n";
            } else {
                this.price += 120;
                this.bill += "Extra Toppings Added: 120\n";
            }
            toppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway) {
            this.price += 20;
            this.bill += "Paperbag Added: 20\n";

            takeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBill) {
            this.bill += "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}
