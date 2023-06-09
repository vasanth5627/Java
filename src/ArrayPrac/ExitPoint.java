package ArrayPrac;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExitPoint {

    public static String wall(int i, int j, int rl, int cl){
        if(i==0) return "top";
        else if(i==rl) return "bottom";
        else if(j==0) return "left";
        else if(j==cl) return "right";
        else return "NA";

    }

    static int[] exitPoint1(int[][] arr){
        int dir = 0;
        int i=0;
        int j=0;
        while(true){
            dir = (dir+arr[i][j])%4;

            if(dir==0){
                j++;
            }
            else if(dir==1){
                i++;
            }
            else if(dir==2){
                j--;
            }
            else if(dir==3){
                i--;
            }

            if(i<0){
                i++;
                break;

            }
            else if(j<0){
                j++;
                break;
            }
            else if(i==arr.length){
                i--;
                break;
            }
            else if(j==arr[0].length){
                j--;
                break;
            }

        }
        return new int[]{i,j};
    }

    static int[] exitPoint(int[][] arr){
        boolean exit  = false;
        String cdr = "right";
        int i=0;
        int j=0;
        int rl = arr.length-1;
        int cl = arr[0].length-1;
        while(!exit){
            if(arr[i][j]==0){
                String wall = wall(i,j,rl,cl);
                if(wall.equals("NA")){
                    if(cdr.equals("top")){
                        i--;
                    }
                    else if(cdr.equals("bottom")){
                        i++;
                    }
                    else if(cdr.equals("left")){
                        j--;
                    }
                    else{
                        j++;
                    }
                }
                else{
                    if(cdr.equals(wall)) {
                        return new int[]{i, j};
                    }
                    else{
                        if(cdr.equals("top")){
                            i--;
                        }
                        else if(cdr.equals("bottom")){
                            i++;
                        }
                        else if(cdr.equals("left")){
                            j--;
                        }
                        else{
                            j++;
                        }
                    }
                }
            }
            else{
                if(cdr.equals("right")){
                  if(i<rl){
                      i++;
                      cdr = "bottom";
                  }
                  else exit= true;
                }
                else if(cdr.equals("left")){
                    if(i>0){
                        i--;
                        cdr = "top";
                    }
                    else exit= true;
                }

                else if(cdr.equals("top")){
                   if(j<cl){
                       j++;
                       cdr ="right";
                   }
                   else{
                       exit= true;
                   }
                }
                else{
                  if(j>0) {
                      j--;
                      cdr= "left";
                  }
                  else{
                      exit= true;
                  }

                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {{0,0,1,0},{1,0,0,0},{0,0,0,0},{1,0,1,0}};
        System.out.println(Arrays.toString(exitPoint(arr)));
        System.out.println(Arrays.toString(exitPoint1(arr)));
    }
}
