public class programnilai{
    public static void main(String[] args) {
       int nilai = Integer.parseInt(args[0]);

        if(nilai > 85&& nilai <=100){
            System.out.println("Anda mendapatkan grade A");
        }
        else if(nilai > 75&& nilai <=84){
            System.out.println("Anda mendapatkan grade B");
        }
        else if(nilai > 60&& nilai <=74){
            System.out.println("Anda mendapatkan grade C");
        }
        else if(nilai > 45&& nilai <=59){
            System.out.println("Anda mendapatkan grade D");
        }
        else if(nilai > 0&& nilai <=44){
            System.out.println("Anda mendapatkan grade E");
        }
    }
} 