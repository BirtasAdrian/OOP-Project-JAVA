public class Main {
    public static void main(String[] args) {


        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Saxophone saxophone = new Saxophone();

         guitar.playMusic();
         piano.playMusic();
         saxophone.playMusic();

         SalesPerson salesPerson = new SalesPerson();

         MusicalInstrument instrument1 = salesPerson.sellInstrument("piano");
         MusicalInstrument instrument2 = salesPerson.sellInstrument("guitar");
         MusicalInstrument instrument3 = salesPerson.sellInstrument("saxophone");
         MusicalInstrument instrument4 = salesPerson.sellInstrument("drums");

    }

//   1. Create the MusicalInstrument class, which has the playMusic() method.
//   Create the child classes Guitar, Piano and Saxophone.
//   Initialize one object of each instrument type and make it play.
//   Each instrument must have its own implementation of the playMusic() method

//   2. Create the SalesPerson class, which has the MusicalInstrument sellInstrument(String desiredInstrument) method.
//   Our method will ask the user what instrument they want, and if they enter a valid instrument,
//   will sound test it, then return it. If the instrument entered is not valid, a corresponding message will be displayed.

}
