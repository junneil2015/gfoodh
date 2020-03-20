package edu.ucucite.gfood;

public class gdrinkchoices {
    public String getcorrans(int index){
        String ans[] = {"Capuchino", "Choco Syrup", "Fresh milk", "Soda", "Soju", "Strawberry syrup", "Juice", "Coffee", "Fresh Milk", "Milk tea"};
        return ans[index - 1];
    }


    public int getimg(int index){
        int images[] = {R.drawable.capuchino, R.drawable.chocosyrup, R.drawable.freshmilk,
                R.drawable.soda, R.drawable.soju, R.drawable.strawberrysyrup, R.drawable.juice, R.drawable.coffee,
                R.drawable.freshmilk, R.drawable.milktea};
        return images[index -1];
    }

    public String getchoice1(int index){
        String choice[] = {"Capuchino", "Fresh milk", "Strawberry syrup", "Choco Syrup",  "Soju", "Strawberry syrup", "Juice", "Coffee", "Fresh Milk", "Milk tea"};
        return choice[index - 1];
    }


}
