package edu.ucucite.gfood;

public class gdrinkchoices {
    public String getcorrans(int index){
        String ans[] = {"Capuchino", "Choco Syrup", "Fresh milk", "Soda", "Soju", "Strawberry syrup", "Juice", "Coffee", "Sea breeze", "Milk tea"};
        return ans[index - 1];
    }


    public int getimg(int index){
        int images[] = {R.drawable.capuchino, R.drawable.chocosyrup, R.drawable.freshmilk,
                R.drawable.soda, R.drawable.soju, R.drawable.strawberrysyrup, R.drawable.juice, R.drawable.coffee,
                R.drawable.seabreeze, R.drawable.milktea};
        return images[index -1];
    }

    public String getchoice1(int index){
        String choice[] = {"Capuchino", "Fresh milk", "Ice syrup", "Choco Syrup",  "Soju", "Milk", "Juice", "Creme latte", "Yogurt", "Tea"};
        return choice[index - 1];
    }

    public String getchoice2(int index){
        String choice[] = {"Fresh milk", "Choco Syrup", "Strawberry syrup", "Soda",  "Coffee", "Strawberry syrup", "Juice", "Coffee", "Soya", "Milk tea"};
        return choice[index - 1];
    }

    public String getchoice3(int index){
        String choice[] = {"Soda", "Soju", "Milk syrup", "Soju",  "Coffee", "Ice cream", "Tea",
                "Latte", "Fresh Milk", "Milk shake"};
        return choice[index - 1];
    }

    public String getchoice4(int index){
        String choice[] = {"Latte", "Fresh Milk", "Frshmilk","Soda", "Soju", "Milk syrup", "Soju",  "Soju", "Sea breeze", "Tea"};
        return choice[index - 1];
    }




}
