public class Main {

    public static void main(String[] args) {
        Main code = new Main();
    }

    public Main(){
       // printAllBoards();
       // nextBoards();
        withinOneMove(3,2,1);
   }

   public void printAllBoards() {
       for (int y = 0; y < 4; y++) {
           for (int x = 0; x < 4; x++) {
               for (int z = 0; z < 4; z++) {
                   if (x <= y && z <= x && y > 0) {
                       System.out.println(y + "" + x + "" + z);
                   }
               }
           }
       }
   }

    public void nextBoards(){
        for (int y =0; y<4; y++) {
            for (int x = 0; x < 4; x++) {
                for (int z=0; z<4; z++){
                    if (x<=y && z<=x && z>0){
                        System.out.println(y +""+ x +""+ (z-1));
                    } if (x<=y && x>0 && z==0){
                        System.out.println(y +""+ (x-1) +""+ z);
                    }
                    if (y>0 && x==0 && z==0){
                        System.out.println((y-1) +""+ x +""+ z);
                    }
                }
            }
        }
    }

    public void withinOneMove(int a, int b , int c){
        System.out.println("start board: "+a+""+b+""+c);
        if (c>0){
            for (int x=1; x<(c+1); x++) {
               System.out.println(a + "" + b + "" + (c-x));
            }
        }
        if (b>0){
            int redC=c;
            for (int x=1; x<(b+1); x++){
                if ((b-x)>=c){
                    redC=c;
                } else if ((b-x)<c){
                    redC=(b-x);
                }
                System.out.println(a+""+(b-x)+ ""+redC);
            }
        }
        if (a>0){
            int redB=b;
            int redC=c;
            for (int x=1; x<(a+1); x++){
                if (a==b || (a-x)<b){
                    redB=(a-x);
                } else if (a>b){
                    redB=b;
                }
                if (redB >=c){
                    redC=c;
                } else if(redB<c){
                    redC=redB;
                }
                System.out.println((a-x)+""+redB+""+redC);
            }
        }
    }


}
