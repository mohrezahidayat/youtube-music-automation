package step_definitions;
import pages.home_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

public class home_step {
    public WebDriver driver;
    public home_page homePage;

    @Given("User launch chrome")
    public void user_launch_chrome() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "./src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = new home_page(driver);
    }

    @When("User visit Music Youtube")
    public void user_visit_music_youtube(){
        driver.get("https://music.youtube.com/");
    }

    @When("User click play button")
    public void user_click_play_button(){
        homePage.playMusicFromQuickPicks();
    }

    @When("User click pause button")
    public void user_click_pause_button(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage.pauseMusicPlaying();
    }

    @When("User click navbar search")
    public void user_click_navbar_search(){
        homePage.clickNavbarSearch();
    }

    @When("User input search {string}")
    public void user_input_search(String musicName){
        homePage.inputSearch(musicName);
    }

    @When("User click suggestion search")
    public void user_click_suggestion_search(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickSuggestionSearch();
    }

    @Then("User can see top results")
    public void Uuser_can_see_top_results(){
        homePage.displayTopResultSearch();
    }

    @Then("User can see youtube music logo")
    public void user_can_see_youtube_music_logo(){
        homePage.displayLogoYotubeMusic();
    }

    @Then("User can see navbar Home")
    public void user_can_see_navbar_home(){
        homePage.displayNavbarHome();
    }

    @Then("User can see navbar Library")
    public void user_can_see_navbar_library(){
       homePage.displayNavbarLibrary();
    }

    @Then("User can see navbar Explore")
    public void user_can_see_navbar_explore(){
        homePage.displayNavbarExplore();
    }

    @Then("User can see navbar Search")
    public void user_can_see_navbar_Search(){
        homePage.displayNavbarSearch();
    }

    @Then("User can see cast button")
    public void user_can_see_cast_button(){
        homePage.displayNavbarCast();
    }

    @Then("User can see bullet setting")
    public void user_can_see_bullet_setting(){
        homePage.displayNavbarSetting();
    }

    @Then("User can see Sign In button")
    public void user_can_see_sign_in_button(){
        homePage.displaySignIn();
    }

    @Then("User can see quick picks section")
    public void user_can_see_quick_picks_section(){
        homePage.displayQuickPicksSection();
    }

    @Then("User can see player page")
    public void user_can_see_player_page(){
        homePage.displayPlayerPage();
    }

    @Then("User can see player bar background")
    public void user_can_see_player_bar_background(){
        homePage.displayPlayerBarBackground();
    }

    @Then("Music playing")
    public void music_playing(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage.displayMusicPlaying();
    }

    @Then("Music pausing")
    public void music_pausing(){
        homePage.displayMusicPausing();
    }

    @Then("Close chrome")
    public void close_chrome() {
        driver.quit();
    }
}
