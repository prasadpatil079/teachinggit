public class Pizza {
    private int price;
    private boolean isveg;
    private String bill;

    /////////
    private int baseprice;
    private int addExtraCheese;
    private int addExtraToppings;
    private int paperbag;
    ////////
    private boolean checkAddCheese=false;
    private boolean checkAddToppings=false;
    private boolean checkTakeAway=false;
    private boolean checkTotalBill=false;

    public Pizza(boolean isveg){
        this.isveg=isveg;
        if(this.isveg==true)
        {
            this.baseprice=300;
            this.addExtraToppings=70;
        }
        else
        {
            this.baseprice=400;
            this.addExtraToppings=120;
        }
        this.addExtraCheese=80;
        this.paperbag=20;
        this.price=this.baseprice;
    }
    public int getprice(){
        return this.price;
    }
    public void addExtraCheese(){
        if(this.checkAddCheese==false)
        {
         this.price=this.price+this.addExtraCheese;
         this.checkAddCheese=true;
        }
    }
    public void addExtraToppings(){
        if(this.checkAddToppings==false)
        {
         this.price=this.price+this.addExtraToppings;
         this.checkAddToppings=true;
        }
    }
    public void addTakeway(){
        if(this.checkTakeAway==false)
        {
         this.price=this.price+this.paperbag;
         this.checkTakeAway=true;
        }
    }
    public String getBill(){
        if(checkTotalBill==false)
        {
           this.bill="Base Price Of Pizza :"+this.baseprice + "\n";
           if(checkAddCheese==true)
             {
                 this.bill+="Extra Cheese :"+this.addExtraCheese + "\n";
             }
           if(checkAddToppings==true)
             {
                 this.bill=this.bill+"Extra Toppings :"+this.addExtraCheese + "\n";
             }
           if(checkTakeAway==true)
             {
                 this.bill=this.bill+"Paperbag Added :"+this.paperbag + "\n";
             }
            this.bill=this.bill+"Total Bill :"+this.price + "\n";
            checkTotalBill=true;
        }
        return this.bill;
    }
}
