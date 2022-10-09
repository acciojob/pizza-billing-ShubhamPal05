package com.driver;

public class Pizza {
    boolean ToppingsAdded=false, ExtracheeseAdded=false, TakeAwayAdded=false;
    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){

        if(isVeg){
            this.price=300;
            // this.bill+="Base Price Of The Pizza: 300\n";
        }
        else{
            this.price=400;
        }
        
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(!ExtracheeseAdded){
            this.price+=80;
            // this.bill+="Extra Cheese Added: 80\n";
        }
        ExtracheeseAdded=true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!ToppingsAdded){
            if(isVeg){
                this.price+=70;
                // this.bill+="Extra Toppings Added: 70\n";
            }
            else{
                this.price+=120;
                // this.bill+="Extra Toppings Added: 120\n";
            }
        }
        ToppingsAdded=true;
    }

    public void addTakeaway(){
        // your code goes here
        this.price+=20;
        this.bill+="Paperbag Added: 20\n";
        TakeAwayAdded=true;
    }

    public String getBill(){
        // your code goes here
        if(isVeg){
            this.bill+=this.bill+="Base Price Of The Pizza: 300\n";
        }
        else{
            this.bill+=this.bill+="Base Price Of The Pizza: 400\n";
        }
        if(ExtracheeseAdded){
            this.bill+=this.bill+="Extra Cheese Added: 80\n";
        }
        if(ToppingsAdded){
            if(isVeg){
                this.bill+="Extra Toppings Added: 70\n";
            }
            else{
                this.bill+="Extra Toppings Added: 120\n";
            }
        }
        this.bill+="Total Price: "+price+"\n";

        return this.bill;
    }
}
