public class Main {
    
    public static void main(String[] args){
        /*
        try{
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println("条件2 : NullPointerExceptionが発生した!");
            System.out.println("条件3 : " +e.getMessage());
        }
        */
        //String str = "百二十三";
        //Integer.parseInt(str);
        String str = "123";
        //Integer.parseInt(str);
        System.out.println(str.getClass().getSimpleName());
        System.out.println(Integer.parseInt(str));
        
        

    }

}
