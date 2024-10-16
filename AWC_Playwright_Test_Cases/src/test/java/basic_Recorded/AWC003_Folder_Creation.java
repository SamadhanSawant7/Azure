package basic_Recorded;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class AWC003_Folder_Creation{
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
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Folders")).click();
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("New")).click();
      page.locator("#ui-id-1").getByText("Add").click();
      page.getByPlaceholder("Required").click();
      page.getByPlaceholder("Required").fill("TestFolder");
      page.click("(//button[@action='createObject'])[1]");
   }
  }
}