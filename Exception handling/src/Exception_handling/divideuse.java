package Exception_handling;

public class divideuse  {


    public static void main(String[]args)//throws zerodenominatorexception//(when throwing exception)
    {
        divide d = new divide();
      
       // d.setdenominator(15); (normal when throwing exception)
       int i=0;
       try {
        i++;//(exception se pehle h isliye chalega)
       
        d.setdenominator(15);//{jha exception agya uske baad bs try catch block chalega uske andar kya h usse mtlb ni h}
        d.setnumerator(10);
        //i++;//{kaam ni krega kuki exception agya}
       } catch (zerodenominatorException e) {
        System.out.println("you cant set denominator as 0");
       }
       catch(zeronumeratorException e){
        System.out.println("you cant set numerator as 0");
       }
       catch(Exception e){// akela ek hi exception ho to ye b kr skte ho generic
        System.out.println("generic exception");
       }
       //iske baad jo marzi print kro koi dikkt ni h CATCH BLOCK KE  BAAD 
        

        System.out.println(d.getnumerator()+"/"+d.getdenominator());
        System.out.println(i);
    }

  
    }


