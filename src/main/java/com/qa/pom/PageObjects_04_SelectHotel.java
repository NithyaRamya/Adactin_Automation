package com.qa.pom;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects_04_SelectHotel {

	WebDriver driver;

	//@FindBy(id = "total_radiobutton")
	//WebElement radiobtn_SelectHotel;

	@FindBy(name = "radiobutton_0")
	WebElement radiobtn_SH;

	@FindBy(name = "continue")
	WebElement btn_continue;

	@FindBy(xpath = "//table/tbody/tr/td[@class='login_title']")
	WebElement lbl_selectHotel;

	@FindBy(xpath = "/html/body/table/tbody")
	WebElement tbl_SelectHotel;

	@FindBy(tagName = "tr")
	List<WebElement> locate_count_rows;

	

	public PageObjects_04_SelectHotel(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public void lablelTitleSelectHotel() {

		System.out.println(lbl_selectHotel.isDisplayed());
		

	}

	public void selectHotel() {

		radiobtn_SH.click();

	}
	public void validate_yes_radio_is_selected() {
		Assert.assertEquals(true, radiobtn_SH.isSelected());
			}


	public void Continue() {

		btn_continue.click();

	}

	public void dynamicTableTitle() {

		System.out.println(tbl_SelectHotel.getText());

	}

	public void fetchValuesOfDynamicTable() {

		int row_count = locate_count_rows.size();
		System.out.println(row_count);
		// Loop will execute till the last row of table.
		for (int row = 0; row < row_count; row++) {

			// To locate cells(Columns) of in that specific Row
			List<WebElement> columns = locate_count_rows.get(row).findElements(By.tagName("td"));

			// To calculate No of cells(Columns) in that specific row
			int column_count = columns.size();

			System.out.println("No Of Cells in Row " + row + " are " + column_count);
			System.out.println(" ");

			// Loop will execute till the last cell of that specific row.
			for (int col = 0; col < column_count; col++) {

				// To Retrieve text from specific cell
				String celltext = columns.get(col).getText();
				System.out.println("Cell Value of row number" + row + " and column number " + col + " Is " + celltext);

			}

		}
	}
}