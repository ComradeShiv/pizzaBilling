package com.driver;

public class Pizza {
//comment

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
        } else{
            this.price = 400;
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
            extraCheese = true;
//comment
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!toppings) {
            if (isVeg) {
                this.price += 70;
            } else {
                this.price += 120;
            }
            toppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway) {
            this.price += 20;
            takeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isVeg) {
            this.bill = "Base Price Of The Pizza: 300\n";
        } else{
            this.bill = "Base Price Of The Pizza: 400\n";
        }

        if(extraCheese) {
            this.bill += "Extra Cheese Added: 80\n";
        }

        if(toppings) {
            if(isVeg) {
                this.bill += "Extra Toppings Added: 70\n";
            } else{
                this.bill += "Extra Toppings Added: 120\n";
            }
        }

        if(takeAway) {
            this.bill += "Paperbag Added: 20\n";
        }

        if(!isBill) {
            this.bill += "Total Price: " + this.price + "\n";
        }
        return this.bill;
    }
}
