package ohtu.validator;

public class Validator {

    // private VinkkiI vinkkiI;
    private boolean validated;

    // Public Validator(VinkkiI vinkki){konstruktori}

    /**
     public void checkNull(){
        VinkkiI.getOtsikko.notEmpty() && != null
        VinkkiI.getKirjoittaja.notEmpty() && != null
        VinkkiI.getTyyppi.notEmpty() && != null
     }

     if(getTyyppi().equalsIgnoreCase("XXX"){
        check for class uniques
     }

     *

    */

    public void setValidated(boolean validated){
        this.validated = validated;
    }

    public boolean getValidated(){
        return this.validated;
    }



}
