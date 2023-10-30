package com.mycal.hcflcmandcommanfactorcalculator.methods;

import android.widget.EditText;

import java.util.HashSet;
import java.util.Set;

public class GetHCF {
    private static int hcf=1;
    private static Set<Integer> primeFactors = new HashSet<>();
    private static Set<Integer> factorFirstNumber = new HashSet<>();
    private static Set<Integer> factorSecondNumber = new HashSet<>();
    private static Set<Integer> factorThirdNumber = new HashSet<>();

    private static Set<Integer> factorCommonNumber = new HashSet<>();
    private static int num1, num2, num3, productOfNumbers;
    public static Set<Integer> getCommonFactors(EditText val1, EditText val2){

        num1 = Integer.parseInt(val1.getText().toString());
        num2 = Integer.parseInt(val2.getText().toString());

        int hcf;


        for (int i =1 ; i<=num1; i++){
            if (num1%i==0){
                factorFirstNumber.add(i);
                num1= num1/i;
            }
        }


        for (int j=1; j<=num2; j++){
            if (num2%j==0){
                factorSecondNumber.add(j);
                num2 = num2/j;
            }
        }

        for (int i: factorFirstNumber) {
            for (int j: factorSecondNumber) {
                if (i==j){
                    factorCommonNumber.add(i);
                }
            }
        }

        return factorCommonNumber;
    }

    private static Set<Integer> getCommonFactors(EditText val1, EditText val2, EditText val3) {
        num1 = Integer.parseInt(val1.getText().toString());
        num2 = Integer.parseInt(val2.getText().toString());
        num3 = Integer.parseInt(val3.getText().toString());

        for (int i =1 ; i<=num1; i++){
            if (num1%i==0){
                factorFirstNumber.add(i);
                num1= num1/i;
            }
        }


        for (int j=1; j<=num2; j++){
            if (num2%j==0){
                factorSecondNumber.add(j);
                num2 = num2/j;
            }
        }


        for (int k=1; k<=num3; k++){
            if (num2%k==0){
                factorSecondNumber.add(k);
                num3 = num3/k;
            }
        }

        for (int i: factorFirstNumber) {
            for (int j: factorSecondNumber) {
                for (int k: factorThirdNumber) {
                    if (i==j && j==k){
                        factorCommonNumber.add(i);
                    }
                }
            }
        }

        return factorCommonNumber;
    }

    public static int getHCF(EditText firstNumber, EditText secondNumber){
        for (int l: getCommonFactors(firstNumber, secondNumber)) {
            hcf *=l;
        }
        return hcf;
    }

    public static int getHCF(EditText firstNumber, EditText secondNumber, EditText thirdNumber){
        for (int l: getCommonFactors(firstNumber, secondNumber, thirdNumber)) {
            hcf *=l;
        }
        return hcf;
    }

    public static int productOfNumbers(EditText val1, EditText val2){
        num1 = Integer.parseInt(val1.getText().toString());
        num2 = Integer.parseInt(val2.getText().toString());

        productOfNumbers = num1*num2;
        return productOfNumbers;
    }

    public static int productOfNumbers(EditText val1, EditText val2, EditText val3){
        num1 = Integer.parseInt(val1.getText().toString());
        num2 = Integer.parseInt(val2.getText().toString());
        num3 = Integer.parseInt(val3.getText().toString());

        productOfNumbers = num1*num2*num3;
        return productOfNumbers;
    }

    public static Set<Integer> getPrimeFactors(EditText val1){
        num1 = Integer.parseInt(val1.getText().toString());
        for (int i=2; i<=num1; i++) {
            if (num1%i==0){
                primeFactors.add(i);
                num1 = num1/i;
            }
        }
        return primeFactors;
    }

    public static int getNumberDivisibleBy(EditText val){
        num1 = Integer.parseInt(val.getText().toString());
        for (int i=2; i<num1; i++){
            if (num1%i==0){
                return i;
            }
        }
        return num1;
    }

    public static void resetValue(){
        factorFirstNumber.clear();
        factorSecondNumber.clear();
        factorThirdNumber.clear();
        factorCommonNumber.clear();
        primeFactors.clear();
        num1 =0;
        num2 =0;
        num3 =0;
        hcf =1;
    }
}
