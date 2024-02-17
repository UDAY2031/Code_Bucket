class exceptionhandling_demo{
    public static void main(String[] args) {
        try{
            int[] a = {1,2,3};
            int r = a[5];
            System.out.println("Results:"+r);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds:"+e.getMessage());

        }
        catch(Exception e){
            System.out.println("Exception:"+e.getMessage());
        }
    }
}