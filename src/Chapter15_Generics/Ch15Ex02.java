/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter15_Generics;

/**Create a holder class that holds three objects of the same type, along with
the methods to store and fetch those objects and a constructor to initialize all three. 
 */
class Curtain {
    
    String curtainType;

    public Curtain(String curtainType) {
        this.curtainType = curtainType;
    }

    @Override
    public String toString() {
        return "Curtain{" + "curtainType=" + curtainType + '}';
    }
    
}

class Holder2<T> {
    
    private T curtainOne;
    private T curtainTwo;
    private T curtainThree;

    public Holder2(T curtainOne, T curtainTwo, T curtainThree) {
        this.curtainOne = curtainOne;
        this.curtainTwo = curtainTwo;
        this.curtainThree = curtainThree;
    }

    public T getCurtainOne() {
        return curtainOne;
    }

    public void setCurtainOne(T curtainOne) {
        this.curtainOne = curtainOne;
    }

    public T getCurtainTwo() {
        return curtainTwo;
    }

    public void setCurtainTwo(T curtainTwo) {
        this.curtainTwo = curtainTwo;
    }

    public T getCurtainThree() {
        return curtainThree;
    }

    public void setCurtainThree(T curtainThree) {
        this.curtainThree = curtainThree;
    }

    @Override
    public String toString() {
        return "Holder2{" + "curtainOne=" + curtainOne + ", curtainTwo=" + curtainTwo + ", curtainThree=" + curtainThree + '}';
    }
    
}

public class Ch15Ex02 {
    public static void main(String[] args) {
        
        Holder2<Curtain> curtainHolder = new Holder2(new Curtain("Light"), new Curtain("Dark"), new Curtain("Expensive"));
        System.out.println(curtainHolder);
        
        
    }
}
