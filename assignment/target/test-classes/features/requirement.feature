Feature: Signingup, register to application and verifing Message

  Scenario Outline: Signing up to application
    Given lanuch url
    When click on signup and signup page will populated
    And user enters a Firstname "<FirstName>"
    And user enters a Lastname "<LastName>"
    And user enters a emali "<email>"
    And user enters a username "<Username>"
    And user enters a password "<Pass>"
    And user re-enters a passwrod "<ConfirmPassword>"
    And click on submit button
    And user registration is successful
    Then user click on profile drop down
    And User verifies the email address "<email>"
    Then click on inbox icon
    And user will re-directed to Messages page
    And user click on compose message icon
    Then user enters the recepient email address as "<sendto>"
    Then user enter the subject text as "<Subject>"
    And user enter the message as "<EmailBody>"
    And user clicks on the send message button
    Then user confimrs the acknowledgement

    Examples: 
      | FirstName | LastName | email             | Username  | Pass       | ConfirmPassword | sendto | Subject    | EmailBody            |
      | Divya     | C M      | divya11@gamil.com | divyacm11 | divyacm#11 | divyacm#11      | div    | Assignment | Assignment completed |
