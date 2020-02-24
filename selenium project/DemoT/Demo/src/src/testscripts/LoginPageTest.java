package testscripts;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseClass;
import vtiger.pages.CampaignsPage;
import vtiger.pages.CreateCampaignsPage;
import vtiger.pages.CreateOrganizationsPage;
import vtiger.pages.CreateProductPage;
import vtiger.pages.HomePage;
import vtiger.pages.OrganizationsPage;
import vtiger.pages.ProductsPage;

public class LoginPageTest extends BaseClass{
	
	@Test
	public void createOrganizationTest() throws IOException
	
	{
		HomePage hp=new HomePage(driver);
	
		OrganizationsPage orgPage = hp.navigateToOrgPage();
		CreateOrganizationsPage createOrg = orgPage.clickOncreateNewOrganizations();
		createOrg.createNewOraganizations("orgName1"+lib.getRandomNum());
	}
	@Test
	public void createOrganizationwithPhoneNoTest()
	{
		HomePage hp=new HomePage(driver);
		
		OrganizationsPage orgPage = hp.navigateToOrgPage();
		CreateOrganizationsPage createOrg = orgPage.clickOncreateNewOrganizations();
		createOrg.createNewOraganizations("orgname123"+lib.getRandomNum(), "2345678901");
		
	}
	@Test
	public void createOrganizationwithmemberTest()
	{
		HomePage hp=new HomePage(driver);
		
		OrganizationsPage orgPage = hp.navigateToOrgPage();
		CreateOrganizationsPage createOrg = orgPage.clickOncreateNewOrganizations();
		createOrg.createNewOraganizations("charan"+lib.getRandomNum(), "5432154321", "orgname1");
		
	}
	@Test
	public void createProductTest()
	{
		HomePage hp=new HomePage(driver);
		ProductsPage proPage = hp.navigateToProPage();
		CreateProductPage createPro = proPage.clickOnCreateNewProduct();
		createPro.createNewProduct("sanam");
	}
	@Test
	public void createProductWithActCost()
	{
		HomePage hp=new HomePage(driver);
		ProductsPage proPage = hp.navigateToProPage();
		CreateProductPage createPro = proPage.clickOnCreateNewProduct();
		createPro.createNewProduct("sanam", "10");
	}
	@Test
	public void createProductWithActBudCostTest()
	{
		HomePage hp=new HomePage(driver);
		ProductsPage proPage = hp.navigateToProPage();
		CreateProductPage createPro = proPage.clickOnCreateNewProduct();
		createPro.createNewProduct("sanam", "10", "20");
	}
	@Test
	public void createCampaignTest()
	{
		HomePage hp= new HomePage(driver);
		CampaignsPage camPage = hp.navigateToCamPage();
		CreateCampaignsPage creatCam = camPage.clickOnCreateCampaign();
		creatCam.createCampaign("cam1", "sandisk");
	}
	@Test
	public void createCampaignWithActCost()
	{
		HomePage hp= new HomePage(driver);
		CampaignsPage camPage = hp.navigateToCamPage();
		CreateCampaignsPage creatCam = camPage.clickOnCreateCampaign();
		creatCam.createCampaign("roadshow", "sandisk","10000");
	}
	@Test
	public void createCampaignWithActBudCost()
	{
		HomePage hp= new HomePage(driver);
		CampaignsPage camPage = hp.navigateToCamPage();
		CreateCampaignsPage creatCam = camPage.clickOnCreateCampaign();
		creatCam.createCampaign("roadshow", "sandisk","10000","6000");
	}
}
