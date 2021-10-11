public class Second {
    public static void main(String[] args) {
        try{
            int a[]= new int[2];
            System.out.println("Access element three:" +a[3]);
        } catch(ArithmeticException e){
            System.out.println("Exeception 1 thrown by this program:" +e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exeception 2 thrown by this program:" +e);
        }catch(NullPointerException e){
            System.out.println("Exeception 3 thrown by this program:" +e);
        }catch(Exception e){
            System.out.println("Exeception 4 thrown by this program:" +e);
        }finally {
            System.out.println("Out of block");
        }
    }
}
