package convert;

import java.util.ArrayList;
import java.util.List;

public class RomanNumeralConverter {

    public String toRomanNumeral(int i) {
        StringBuilder temp = new StringBuilder();
        ArrayList<String> possibleSubStrings = fillArray();
        while (i > 0){
            if (i>=1000){
                while (i >= 1000){
                    temp.append(fillArray().get(0));
                    i -= 1000;
                }
            }
            if (i>=900){
                while (i >= 900){
                    temp.append(fillArray().get(1));
                    i -= 900;
                }


            }
            if (i>=500){
                while (i >= 500){
                    temp.append(fillArray().get(2));
                    i -= 500;
                }
            }
            if (i>=400){
                while (i >= 400){
                temp.append(fillArray().get(3));
                i -= 400;
            }}
            if (i>=100){
                while (i >= 100){
                    temp.append(fillArray().get(4));
                    i -= 100;
                }
            }
            if (i>=90){
                while (i >= 90){
                    temp.append(fillArray().get(5));
                    i -= 90;
                }
            }
            if (i>=50){
                while (i >= 50){
                    temp.append(fillArray().get(6));
                    i -= 50;
                }
            }
            if (i>=40){
                while (i >= 40){
                    temp.append(fillArray().get(7));
                    i -= 40;
                }
            }
            if (i>=10){
                while (i >= 10){
                    temp.append(fillArray().get(8));
                    i -= 10;
                }
            }
            if (i>=9){
                while (i >= 9){
                    temp.append(fillArray().get(9));
                    i -= 9;
                }
            }
            if (i>=5){
                while (i >= 5){
                    temp.append(fillArray().get(10));
                    i -= 5;
                }
            }
            if (i>=4){
                while (i >= 4){
                    temp.append(fillArray().get(11));
                    i -= 4;
                }
            }
            if (i>=1){
                while (i >= 1){
                    temp.append(fillArray().get(12));
                    i -= 1;
                }
            }
        }

        return temp.toString();


    }



    ArrayList<String> fillArray(){
        ArrayList<String> temp = new ArrayList<>();
        temp.add("M");
        temp.add("CM");
        temp.add("D");
        temp.add("CD");
        temp.add("C");
        temp.add("XD");
        temp.add("L");
        temp.add("XL");
        temp.add("X");
        temp.add("IX");
        temp.add("V");
        temp.add("IV");
        temp.add("I");
        

        
        return temp;


    }


}
