/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9_Interfaces;

/**(2) Create an interface, and inherit two new interfaces from that interface.
Multiply inherit a third interface from the second two
 */
interface FirstLayer {
    
    void layer();
    
}

interface SecondLayer extends FirstLayer {
    
}

interface SecondLayerTwo extends FirstLayer {
    
}

interface LayerThree extends SecondLayer, SecondLayerTwo {
    
}

class Process implements LayerThree {

    @Override
    public void layer() {
        System.out.println("Hello from FirstLayer");
    }
    
}

public class Ch09Ex13 {
    public static void main(String[] args) {
        
        FirstLayer firstLayer = new Process();
        firstLayer.layer();
        
    }
}
