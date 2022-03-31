#Autor: Wilson Bedoya

@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay

  @scenario1
  Scenario: Search for automation course
    Given than Actor_Wilson wants to learn automation at the academy Ch
    When he searches for the course Automatización de Pruebas on the choucair academy platform
    |course|
    |Automatización de Pruebas|
    |Automatización de Pruebas|
    Then he finds the course called Automatización de Pruebas
      |result|
      |Automatización de Pruebas|
      |Automatización de Pruebas|