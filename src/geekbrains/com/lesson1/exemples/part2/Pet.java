package geekbrains.com.lesson1.exemples.part2;

public interface Pet {

      String name = "name";

      String voice();

      void loveMaster();

      boolean isUseful();

      default int run() {
            test();
            return 10;
      }

      static void test(){

      }

      private void test2(){

      }
}
