public class SalesPerson {

    public MusicalInstrument sellInstrument(String desiredInstrument){
        if(desiredInstrument.equalsIgnoreCase("guitar")){
            return new Guitar();
        }else if(desiredInstrument.equalsIgnoreCase("piano")){
            return new Piano();
        }else if(desiredInstrument.equalsIgnoreCase("saxophone")){
            return new Saxophone();
        }else{

            System.out.println("We don't have this kind of musical instrument ");
            return null;
        }
    }
}
