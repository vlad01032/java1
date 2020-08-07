package ru.progwards.java1.lessons.arrays;

public class DIntArray {
    private int[] myArr = new int[0];

    public DIntArray(){

    }

    public void add(int num){

        int[] newArr = new int[myArr.length + 1];
        System.arraycopy(myArr,0,newArr,0,myArr.length);
        newArr[myArr.length] = num;
        myArr = new int[newArr.length];
        System.arraycopy(newArr,0,myArr,0,newArr.length);

//        for (int i = 0; i < myArr.length; i++) {
//            System.out.print(myArr[i] + " ");
//
//        }
//        System.out.println();
    }

    public void atInsert(int pos, int num) {

        int[] newArr = new int[myArr.length];
        System.arraycopy(myArr,0,newArr,0,myArr.length);
        myArr = new int[newArr.length + 1];

        if (pos == 0) {
            myArr[0] = num;
            System.arraycopy(newArr,0,myArr,1,newArr.length);
        } else {
            System.arraycopy(newArr,0,myArr,0,pos);
            myArr[pos] = num;
            System.arraycopy(newArr,pos,myArr,pos + 1, newArr.length - pos);
        }

    }

    public void atDelete(int pos) {
        int[] newArr = new int[myArr.length];
        System.arraycopy(myArr,0,newArr,0,myArr.length);
        myArr = new int[newArr.length - 1];
        if (pos == 0){
            System.arraycopy(newArr,1,myArr,0,newArr.length - 1);
        } else {
            System.arraycopy(newArr,0,myArr,0,pos);
            System.arraycopy(newArr, pos + 1,myArr,pos,newArr.length - pos - 1);
        }

    }
    public int at(int pos) {
        return myArr[pos];
    }

    public static void main(String[] args) {
        DIntArray arr  = new DIntArray();
        arr.add(78);
        arr.add(75);
        arr.add(5);
        arr.atInsert(1,98);
        arr.atInsert(3,85);
        arr.atInsert(0,73);
        arr.atDelete(0);
        arr.atDelete(2);
        System.out.println(arr.at(1));



    }
}
