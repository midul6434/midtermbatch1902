package datastructure;

import utility.XLSXFileReader;

/**
 * @author Jahidul Islam
 * Construct Two Dimensional array reference variable and
 * store all the data of testData.xlsx from data directory
 * You do not have to read xlsx file only the similar data need to be
 * stored in 2D Array reference variable
 * Later get those value by index and also by using any iteration process
 *
 *  */


public class TwoDimensionalArrayDemo {
    public static void main(String[] args) throws Exception {
        XLSXFileReader obj = new XLSXFileReader();
        String [][] mykey=obj.getExcelSheetData("data");
        for(int i=0;i<mykey.length;i++){
            System.out.println(mykey);
        }
    }


}