package chapter6;

public class TableOfBinOctAndHex {
    public static void main(String[] args) {
        System.out.println("DECIMAL\t\tBINARY\t\tOCTAL DECIMAL\t\tHEXADECIMAL");
        for (int  decimal=1;decimal<=256;decimal++){
            String binaryNum=Integer.toBinaryString(decimal);
            String octalNum=Integer.toOctalString(decimal);
            String hexNum=Integer.toHexString(decimal);

            System.out.println(+decimal+"\t\t\t"+binaryNum+"\t\t\t\t\t"+octalNum+"\t\t\t\t\t"+hexNum);
        }
    }
}
