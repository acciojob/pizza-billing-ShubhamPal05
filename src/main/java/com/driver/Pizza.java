package com.driver;

public class Pizza {
    boolean ToppingsAdded=false, ExtracheeseAdded=false, TakeAwayAdded=false;
    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price=0;
        // your code goes here
        if(isVeg){
            this.price+=300;
        }
        else{
            this.price+=400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here

        if(!ExtracheeseAdded){
            this.price+=80;
        }
        ExtracheeseAdded=true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!ToppingsAdded){
            if(isVeg){
                this.price+=70;
            }
            else{
                this.price+=120;
            }
        }
        ToppingsAdded=true;
    }

    public void addTakeaway(){
        // your code goes here
        if(!TakeAwayAdded)
            this.price+=20;
        TakeAwayAdded=true;
    }

    public String getBill(){
        // your code goes here
        this.bill="";
        if(isVeg){
            this.bill+="Base Price Of The Pizza: 300\n";
        }
        else{
            this.bill+="Base Price Of The Pizza: 400\n";
        }
        if(ExtracheeseAdded){
            this.bill+="Extra Cheese Added: 80\n";
        }
        if(ToppingsAdded){
            if(isVeg){
                this.bill+="Extra Toppings Added: 70\n";
            }
            else{
                this.bill+="Extra Toppings Added: 120\n";
            }
        }
        if(TakeAwayAdded){
            this.bill+="Paperbag Added: 20\n";
        }
        this.bill+="Total Price: "+price+"\n";
        return this.bill;
    }
}
