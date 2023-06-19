Feature: SetupInterview

  Background: LoginPage  
    Given User is on Login Page
    When User enters username and password
    And User click the login button
    Then User are successfully logged in Dashboard
    
    
  Scenario: InterviewKit_Add Interview
    When user click on Setup Interview
    When user clicks on Interview Kit
    Then user have to see the Interview Listing page
    When user click on Add Interview Kit
    
  
    Scenario: AddInterviewkit_Predefined Interview Kit
     When user click on Setup Interview
     When user clicks on Interview Kit
     And user click on Add Interview
     And user click on Predefined Interview Kit
     And user select one of the Interview Kit
     And user click on next button
     And user click on Save kit button
     Then user view the added Intervie Kit in Interview Listing page
 
     Scenario: AddInterviewkit_Videoquest_Default
     #When user click on Setup Interview
     #When user clicks on Interview Kit
     #And user click on Add Interview
     #And user click on Create own Kit
     #And user enter title of kit
     #Then user click on Video question
    
     Scenario: AddInterview_Flexible
     When user click on Setup Interview
     When user clicks on Interview Kit
     And user click on Add Interview
     And user click on Create you own
     And enter title of interview
     Then user select flexible to add interview question
     

     Scenario: AddInterview_Timed
     When user click on Setup Interview
     When user clicks on Interview Kit
     And user click on Add Interview
     And user click on Create you own
     And enter title of interview
     Then user select Timed and set time to add interview questions
     
     
     @test1
     Scenario: Schedule_the_Interview_Invitecandidate_with_Job
     When user click on Setup Interview
     And user click on Schedule Interview
     And user enter detail in setup interview page
     Then user click on send button
     
     
     