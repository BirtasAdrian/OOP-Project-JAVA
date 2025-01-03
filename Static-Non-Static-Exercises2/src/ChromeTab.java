public class ChromeTab {

    static String history = "";
    String currentSiteName;

    public void changeCurrentSite(String newSite){
        System.out.println("We change the website");
        currentSiteName = newSite;
        history+= " " + newSite + " ";
    }
}
