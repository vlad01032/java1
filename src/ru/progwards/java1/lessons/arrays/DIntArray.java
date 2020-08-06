package ru.progwards.java1.lessons.arrays;

public class DIntArray {
    private int[] myArr = {5,7,12,45,32,2,8};
    public DIntArray(){

    }

    public void add(int num){
        int[] newArr = new int[myArr.length + 1];
        System.arraycopy(myArr,0,newArr,0,myArr.length);
        newArr[myArr.length] = num;

//        for (int i = 0; i < newArr.length; i++) {
//            System.out.print(newArr[i] + " ");
//
//        }
//        System.out.println();
    }

    public void atInsert(int pos, int num) {
        int[] newArr = new int[myArr.length + 1];
        System.arraycopy(myArr,0,newArr,0,pos);
        newArr[pos] = num;
        System.arraycopy(myArr,pos,newArr,pos + 1, myArr.length - pos);


    }

    public void atDelete(int pos) {
        int[] newArr = new int[myArr.length - 1];
        System.arraycopy(myArr,0,newArr,0,pos);
        System.arraycopy(myArr,pos + 1,newArr,pos, myArr.length - pos - 1);

    }
    public int at(int pos) {
        return myArr[pos];
    }

    public static void main(String[] args) {
        DIntArray arr  = new DIntArray();
        arr.add(78);
        arr.atInsert(4,98);
        arr.atDelete(5);
        System.out.println(arr.at(5));



    }
}
