package relXpath_Exersice;

public class LocatorsCRM {
    //----------------- Cách 1-5--------------------
    //Xpath của trang login
    public String headerLogin = "//h1[normalize-space()='Login']";
    public String inputEmail = "//input[@id='email']";
    public String inputPassword = "//input[@id='password']";
    public String checkboxRememberme = "//input[@id='remember']";
    public String buttonLogin = "//button[normalize-space()='Login']";
    public String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";

    //Xpath của menu Customer
    public String menuCustomer = "//span[normalize-space()='Customers']";

    //Xpath của trang new Customer
    public String inputCompany = "//input[@id='company']";
    public String inputVat = "//input[@id='vat']";
    public String inputPhone = "//input[@id='phonenumber']";
    public String inputWebsite = "//input[@id='website']";
    public String dropdownGroup = "//select[id='groups_in[]']";
    public String buttonAddNewCustomerGroup = "//a[@class='btn btn-default']";
    public String dropdownCurrency = "//button[@data-id='default_currency']";
    public String dropdownDefaultLanguage = "//button[@data-id='default_language']";
    public String textAreaAddress = "//textarea[@id='address']";
    public String inputCity = "//input[@id='city']";
    public String inputState = "//input[@id='city']";
    public String inputZipcode = "//input[@id='zip']";
    public String dropdownCountry = "//button[@data-id='country']";
    public String buttonSaveAndCreateContact = "//button[normalize-space()='Save and create contact']";
    public String buttonSaveCustomer = "//button[normalize-space()='Save']";


    //----------------- Cách 6-10--------------------
    //xpath của menu Project
    public String menuProject = "(//span[normalize-space()='Contracts']/ancestor::li)/following-sibling::li[@Class ='menu-item-projects']";

    //xpath của trang New Project
    public String inputProjectName = "//label[@for='name']/following-sibling::input";
    public String dropdownCustomer = "//select[@id='clientid']/following-sibling::button";
    public String checkboxCaculateProgressThroughTask = "(//div[@id='tab_project']/child::label)/preceding-sibling::div/descendant::input[@id='progress_from_tasks']";
    public String ProcessPercent = "(//div[@id='tab_project']/child::label)/child::span[@class = 'label_progress']";
    public String ProcessPercentBar = "//input[@name='progress']/following-sibling::div[1]";
    public String dropdownBillingType = "//select[@id='billing_type']/parent::div";
    public String dropdownStatus = "//select[@id='status']/parent::div";
    public String inputEstimatedHours = "//label[normalize-space()='Estimated Hours']/following-sibling::input[@id ='estimated_hours']";
    public String dropdownMember = "//select[contains(@id,'project_members')]/parent::div";
    public String inputStartDate = "//label[@for='start_date']/following-sibling::div[@class = 'input-group date']";
    public String inputDeadline = "//label[@for='deadline']/following-sibling::div[@class = 'input-group date']";
    public String inputTag = "(//label[normalize-space()='Tags']/following-sibling::ul)/descendant::input[@placeholder='Tag']";
    public String textareaDescription = "(//textarea[@id='description']/parent::div)/descendant::iframe";
    public String checkboxSendProjectCreatedEmail = "(//label[normalize-space()='Send project created email'])/preceding-sibling::input[@id='send_created_email']";
    public String buttonSaveProject = "//form[@id='project_form']/descendant::button[@type ='submit']";




}
