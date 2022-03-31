package Week1;

public class CaesarCipherOOPTwo {
    private String aph;
    private String shaph1;
    private String shaph2;

    CaesarCipherOOPTwo(int key1,int key2){
        aph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        shaph1 = aph.substring(key1) + aph.substring(0,key1);
        shaph2 = aph.substring(key2) + aph.substring(0,key2);
    }
    
}
