package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page {
    public home_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"left-content\"]/a/picture[1]")
    private WebElement logoYotubeMusic;

    @FindBy(xpath = "//*[@id=\"layout\"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[1]")
    private WebElement navbarHome;

    @FindBy(xpath = "//*[@id=\"layout\"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[2]")
    private WebElement navbarExplore;

    @FindBy(xpath = "//*[@id=\"layout\"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[3]")
    private WebElement navbarLibrary;

    @FindBy(xpath = "//*[@id=\"layout\"]/ytmusic-nav-bar/div[2]/ytmusic-search-box/div/div[1]")
    private WebElement navbarSearch;

    @FindBy(xpath = "//*[@id=\"input\" and @class=\"style-scope ytmusic-search-box\" and @placeholder=\"Search\"]")
    private WebElement placeHolderSearch;

    @FindBy(xpath = "//*[@id=\"suggestion-4\"]/a[@aria-label=\"The Beatles\"]")
    private WebElement suggestionSearch;

    @FindBy(xpath = "//*[@id=\"header\"]/ytmusic-immersive-header-renderer/div/div/div/yt-formatted-string[@title=\"The Beatles\"]")
    private WebElement topResultSearch;

    @FindBy(xpath = "//*[@id=\"right-content\"]/ytmusic-cast-button")
    private WebElement navbarCast;

    @FindBy(xpath = "//*[@id=\"menu-button\"]")
    private WebElement navbarSetting;

    @FindBy(xpath = "//*[@id=\"right-content\"]/a[contains(text(), \"Sign in\")]")
    private WebElement signIn;

    @FindBy(xpath = "//*[@id=\"details\"]/yt-formatted-string[contains(text(), \"Quick picks\")]")
    private WebElement sectionOfQuickPicks;

    @FindBy(xpath = "//*[@id=\"items\"]/ytmusic-responsive-list-item-renderer/div/ytmusic-item-thumbnail-overlay-renderer/div/ytmusic-play-button-renderer[@id=\"play-button\"]")
    private WebElement playMusicQuickPicks;
    @FindBy(id = "player-page")
    private WebElement playerPage;

    @FindBy(id = "player-bar-background")
    private WebElement playerBarBackground;

    @FindBy(xpath = "//*[@id=\"play-pause-button\" and @title=\"Pause\"]")
    private WebElement musicPlaying;

    @FindBy(xpath = "//*[@id=\"play-pause-button\" and @title=\"Play\"]")
    private WebElement musicPausing;

    public void displayLogoYotubeMusic(){
        logoYotubeMusic.isDisplayed();
    }

    public void displayNavbarHome(){
        navbarHome.isDisplayed();
    }

    public void displayNavbarLibrary(){
        navbarLibrary.isDisplayed();
    }

    public void displayNavbarExplore(){
        navbarExplore.isDisplayed();
    }

    public void displayNavbarSearch(){
        navbarSearch.isDisplayed();
    }

    public void clickNavbarSearch(){
        navbarSearch.click();
    }

    public void displayTopResultSearch(){
        topResultSearch.isDisplayed();
    }

    public void inputSearch(String musicName){
        placeHolderSearch.sendKeys(musicName);
    }

    public void clickSuggestionSearch(){
        suggestionSearch.click();
    }

    public void displayNavbarCast(){
        navbarCast.isDisplayed();
    }

    public void displayNavbarSetting(){
        navbarSetting.isDisplayed();
    }

    public void displaySignIn(){
        signIn.isDisplayed();
    }

    public void displayQuickPicksSection(){
        sectionOfQuickPicks.isDisplayed();
    }

    public void playMusicFromQuickPicks(){
        playMusicQuickPicks.click();
    }

    public void displayPlayerPage(){
        playerPage.isDisplayed();
    }

    public void displayPlayerBarBackground(){
        playerBarBackground.isDisplayed();
    }

    public void displayMusicPlaying(){
        musicPlaying.isDisplayed();
    }

    public void pauseMusicPlaying(){
        musicPlaying.click();
    }

    public void displayMusicPausing(){
        musicPausing.isDisplayed();
    }

}
