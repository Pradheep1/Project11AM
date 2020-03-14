Feature: To validate the Login Function

  Scenario Outline: To validate the Login with Valid user name and Password
    Given User open the url
    When Enter user "<Name>" and "<Password>"
    And User click the Login
    And Select  the "<Location>" and "<Hotel> " and "<RoomType>" and "<NoRooms>"
    And Give Date "<Check in date>" and "<Check out Date>" and "<Adult per room>" and "<Child per room>"
    And Click on search and navigate to the Next page
    And Select the Radio Button and click ok
    And Fill "<First Name>" and "<Last Name>" and "<Address>" and "<Card No>" and  "<Card type>"
    And Click "<Month>" and "<Year>" and "<Cvv>"
    And Click Book Now and navigate to next page
    And Print the order number and take screenshot
    Then LogOut

    Examples: 
      | Name     | Password  | Location  | Hotel          | RoomType | NoRooms | Check in date | Check out Date | Adult per room | Child per room | First Name | Last Name | Address                       | Card No          | Card type        | Month | Year | Cvv |
      | Richards | Asdf*963. | Melbourne | Hotel Sunshine | Double   |       3 | 21/03/2020    | 25/03/2020     |              2 |              1 | Richard    | Sam       | Po Box 452,Salt Lake city,Uta | 1234567891234567 | American Express |     3 | 2022 | 452 |
