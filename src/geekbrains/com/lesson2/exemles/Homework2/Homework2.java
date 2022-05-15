package geekbrains.com.lesson2.exemles.Homework2;

public class Homework2 {

    private static final String[][] CORRECT_DATE = new String[][]{

            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},

    };

    public static void main(String[] args) {
try {
    int sum = sumArrayValues(CORRECT_DATE);
    System.out.println(sum);
} catch (MyArrayDataExeption e) {
    System.out.println(e.getMessage());
} catch (myArraySizeExeption e){
    System.out.println(e.getMessage());
}

    }

    private static int sumArrayValues(String[][] array) {
        checkArraySize(array);
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            String[] row = array[i];
               for (int j = 0; j < row.length; j++) {
                String value = row[j];

                   try {
                       sum += Integer.parseInt(value);
                   } catch (NumberFormatException e) {
                       throw new MyArrayDataExeption(4, 4);
                   }

               }
        }
        return sum;
    }
 private  static void checkArraySize (String [][] array){
        if(array.length != 4) {
            throw new myArraySizeExeption();
        }

     for (String[] row : array) {

         if(row.length != 4){
             throw new myArraySizeExeption();
         }



     }
 }


}
