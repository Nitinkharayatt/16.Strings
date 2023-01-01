public class Print_Largest_String {

    public static void main(String[] args) {
        String fruit[]={"apple","mango","banana"};
        String largest=fruit[0];

        for (int i=1;i<fruit.length;i++){
            if (largest.compareTo(fruit[i]) < 0){

                largest=fruit[i];
            }
        }
        System.out.println("largest string = "+largest);
    }
}



//    when=  output > 0

//    String fruit[]={"apple","mango","banana"};
//    String largest=fruit[0];
//
//        for (int i=1;i<fruit.length;i++){
//        if (fruit[i].compareTo(largest) < 0){    //
//
//        largest=fruit[i];
//            }
//        }
//        System.out.println("largest string = "+largest);
//     }