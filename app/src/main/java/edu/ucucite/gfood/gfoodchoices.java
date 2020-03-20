package edu.ucucite.gfood;

public class gfoodchoices {
    public String getcorrans(int index){
        String ans[] = {"Empanada", "Hamburger", "Hotdog", "Lasagna", "Nachos", "Pizza", "SearedScallops", "Sisig", "Tacos", "Shawarma"};
        return ans[index - 1];
    }

    public String getchoice1(int index){
        String choice[] = {"Chocolates", "Nachos", "Hotdog", "Pizza", "Nachos", "Pizza", "SearedScallops", "Sisig", "Hotdog", "Pizza"};
        return choice[index - 1];
    }
    public String getchoice2(int index){
        String choice[] = { "Lasagna", "Hamburger", "SearedScallops", "Lasagna", "Sisig", "Tacos", "Chocolates", "Nachos", "Tacos", "Tacos"};
        return choice[index - 1];
    }
    public String getchoice3(int index){
        String choice[] = {"Empanada", "Hotdog", "Nachos", "Shawarma", "Pizza", "Tacos", "Shawarma", "Hotdog", "Pizza", "Hotdog"};
        return choice[index - 1];
    }
    public String getchoice4(int index){
        String choice[] = {"Nachos", "Nachos", "Empanada", "Sisig", "Tacos", "Shawarma", "Shawarma", "Sisig", "Sisig", "Shawarma"};
        return choice[index -1];
    }
    public int getimg(int index){
        int images[] = {R.drawable.empanada, R.drawable.hamburger, R.drawable.hotdog,
                R.drawable.lasagna, R.drawable.nachos, R.drawable.pizza, R.drawable.searedscallops, R.drawable.sisig, R.drawable.tacos, R.drawable.shawarma};
        return images[index -1];
    }


}
