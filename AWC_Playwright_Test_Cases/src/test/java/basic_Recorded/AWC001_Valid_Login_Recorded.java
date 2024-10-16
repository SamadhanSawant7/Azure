package basic_Recorded;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class AWC001_Valid_Login_Recorded {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("http://localhost:3000/");
      page.getByPlaceholder("User Name").click();
      page.getByPlaceholder("User Name").fill("fbtcuser");
      page.getByPlaceholder("Password").click();
      page.getByPlaceholder("Password").fill("fbtcuser");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign in")).click();
    }
  }
}
