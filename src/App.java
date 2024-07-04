public class App {
    public static void main(String[] args) throws Exception {
    Iphone iphone = new Iphone();

    iphone.playSong();
    iphone.pauseSong();
    iphone.selectSong();
    iphone.reloadPage();
    iphone.openTab();
    iphone.showPage();
    iphone.dial(123);
    iphone.answer();
    iphone.hangUp();
    iphone.voiceMail("Hello, World!");
}
}
