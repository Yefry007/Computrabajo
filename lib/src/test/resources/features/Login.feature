#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenary from to Login en Computrabajo Web PAge
Feature: Login
  I as a user of the application
  I want to access the application with my username and password
  I can find to new jobs

  @SuccessLogin
  Scenario: Success login
    Given that the User want do login in the application
    When he enter credentials
  #    | User                      | Password | Answear |
  #    | yefrycespedes14@gmail.com |  1234567 | TRUE    |
    Then he must access the homepage

  
