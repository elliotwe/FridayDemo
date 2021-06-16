public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String str = getString();
        
        if (str.equals(str.toLowerCase()) ||
        	str.equals(str.toUpperCase()))
        {
        	return true;
        }
        
        
       String res = Character.toString(str.charAt(0)).toUpperCase() + str.substring(1).toLowerCase();
       
       if (str.equals(res))
       {
    	   return true;    	   
       }
       
       return false;
        
    }

}

