package ru.surova.java.core;

public class Main {

    public static void main(String[] args) {

        String[][][] arrays = {
                {
                        {"1", "3", "8", "0"},
                        {"2", "3", "4", "5"},
                        {"6", "7", "8", "9"},
                        {"101", "3", "9", "01"}
                },
                {
                        {"1", "3", "8", "0"},
                        {"2", "3", "4", "5"},
                        {"6", "7", "8", "9"},
                        {"101", "3", "#", "01"}
                },
                {
                        {"2", "5", "9", "8", "10"},
                        {"8", "22", "7", "4", "3"},
                        {"45", "1", "1", "4", "7"},
                        {"45", "1", "1", "4", "7"}
                }

        };

        for(int i = 0; i < arrays.length; i++) {
            try {
                int sum = array4x4(arrays[i]);
                System.out.println("Sum: " + sum);
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public static int array4x4(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if(!is4x4(array)){
            throw new MyArraySizeException();
        }
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                try {
                    int num = Integer.parseInt(array[i][j]);
                    sum += num;
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }

            }

        }
        information(array);
        return sum;


    }

    public static boolean is4x4(String[][] array){
        if(array.length != 4){
            return false;
        }
        for(int i = 0; i < array.length; i++){
            if(array[i].length != 4){
                return false;
            }
        }
        return true;

    }

    public static void information(String[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
    }
}
