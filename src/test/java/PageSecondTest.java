
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class PageSecondTest extends BaseTest {
    @Test(priority = 4)
    public void praceMonthTelekTest() { // функциональность кнопки -повна цена/цена в месяц- +
        mainPage.openPage();//мы обращаемся к классу mainPage и вызываем метод открыть страницу
        //mainPage.acceptCity();//мы обращаемся к классу mainPage и вызываем метод подтвердить местоположение
        mainPage.switchToSectionTelek();
        secondPage.chekpraceMonth();
        assertions.equalsOfStrings(elements.getTextFromElementBy(By.xpath("//a[@data-id='4429']/span[2]")), "1900");
    }

    @Test(priority = 2)
    public void sectionTelekTest() { // Телевизоры, наличие секций, торговой марки +
        mainPage.openPage();//обращаемся к классу mainPage и вызываем метод открыть страницу
        //mainPage.acceptCity();//обращаемся к классу mainPage и вызываем метод подтвердить местоположение
        mainPage.switchToSectionTelek();
        secondPage.clickOnElement(By.xpath("//div[@id='group-9501']"));
        List<WebElement> filter = driver.findElements
                (By.xpath("//div[@id='group-9501']//following-sibling::div/a/div/label"));
        assertTrue(filter.size() == 18);
    }

    @Test(priority = 1)
    public void titleTelekTest() { // соответствие страницы "телек" +
        mainPage.openPage();//обращаемся к классу mainPage и вызываем метод открыть страницу
        mainPage.combekZP();
        //mainPage.acceptCity();//обращаемся к классу mainPage и вызываем метод подтвердить местоположение
        mainPage.switchToSectionTelek();
        System.out.println(driver.getTitle());
        String titleTelek = "Телевізори у Запоріжжі купити за найкращою ціною ➥ Фокстрот";
        assertions.equalsOfStrings(driver.getTitle(), titleTelek);
    }
    @Test(priority = 5)
    public void ChepExpensivTelekTest() { //+
        mainPage.openPage();//обращаемся к классу mainPage и вызываем метод открыть страницу
        //mainPage.acceptCity();//обращаемся к классу mainPage и вызываем метод подтвердить местоположение
        mainPage.switchToSectionTelek();
        secondPage.checChepExpensivTelek();
        String theMinPrice = "3 999 ₴";
        assertions.equalsOfStrings(elements.getTextFromElementBy(By.xpath("//div[@data-id='3643']/following-sibling::div/div[2]/div/div/div[2]")), theMinPrice);
    }
    @Test(priority = 3)
    public void filterTelekSamsungTest() { // Samsung
        mainPage.openPage();//обращаемся к классу mainPage и вызываем метод открыть страницу
        //mainPage.acceptCity();//обращаемся к классу mainPage и вызываем метод подтвердить местоположение
        mainPage.switchToSectionTelek();
        secondPage.fiLterSectionS();
        String resFiltr = "Торгова марка: SAMSUNG";
        assertions.equalsOfStrings(elements.getTextFromElementBy(By.xpath("//span[@class='listing__sidebar-tags__link']")), resFiltr);
    }
     /*@Test(priority = 3)
    public void sravnenieTelekTest() { // сравнение выбранных телевизоров +
        mainPage.openPage();//обращаемся к классу mainPage и вызываем метод открыть страницу
        mainPage.acceptCity();//обращаемся к классу mainPage и вызываем метод подтвердить местоположение
        mainPage.switchToSectionTelek();
        secondPage.sravnenieTelek();
        secondPage.checkButtonTelek();
        System.out.println(elements.getTextFromElementBy
                (By.xpath("//div[@class='header-tooltip__cards-col groups-to-compare']/div/div/div/following-sibling::div[2]/a")));
        List<WebElement> listofCompare = driver.findElements(By.xpath("//div[@class='header-tooltip__cards-col groups-to-compare']/div/div/div/following-sibling::div[2]/a"));
        String[] massivIsTexta = {"Телевізор SAMSUNG UE43BU8000UXUA", "Телевізор HISENSE 50A6BG"};
        for (int i = 0; i < massivIsTexta.length; i++) {
            assertions.equalsOfStrings(listofCompare.get(i).getText(), massivIsTexta[i]);
        }
    }*/
}









