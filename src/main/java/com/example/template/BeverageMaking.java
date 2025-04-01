package com.example.template;

public abstract class BeverageMaking {
    /**模版方法，定义算法骨架，不可被子类修改*/
    public final void prepareRecipe(){
        boil();
        brew();
        if(customerNeedsCondiment()){ //hook method
            addCondiments();
        }
        pourIntoCup();
    }


    public void boil(){
        System.out.println("Boiling water.");
    }
    public abstract void brew(); // leave to subclass
    public abstract  void addCondiments(); // leave to subclass

    public boolean customerNeedsCondiment(){
        return false;
    }

    public void pourIntoCup(){
        System.out.println("Pouring into a cup.");
    }

}


